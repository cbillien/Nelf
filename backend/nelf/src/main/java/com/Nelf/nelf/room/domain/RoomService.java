package com.Nelf.nelf.room.domain;

import com.Nelf.nelf.room.infrastructure.RoomRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class RoomService {
    @Autowired
    private RoomRespository roomRespository;

    public RoomService(RoomRespository roomRespository){
        this.roomRespository = roomRespository;
    }
    public List<Room> findAll(){
        return roomRespository.findAll();
    }

    public Optional<Room> findById(int id) {
        return roomRespository.findById(id);
    }

    public Room create(Room room) {
        return roomRespository.create(room);
    }
}
