package com.Nelf.nelf.room.infrastructure;

import com.Nelf.nelf.room.RoomMapper;
import com.Nelf.nelf.room.domain.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class RoomRespository {
    private RoomDao roomDao;

    @Autowired
    public RoomRespository(RoomDao roomDao) {
        this.roomDao = roomDao;
    }

    public List<Room> findAll() {
        return roomDao.findAll().stream().map(RoomMapper::toRoom).collect(Collectors.toList());
    }

    public Optional<Room> findById(int id) {
        return roomDao.findById(id).map(RoomMapper::toRoom);
    }

    public Room create(Room room) {
        return RoomMapper.toRoom(roomDao.save(RoomMapper.toRoomEntity(room)));
    }
}
