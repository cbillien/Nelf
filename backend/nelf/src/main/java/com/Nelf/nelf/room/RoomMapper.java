package com.Nelf.nelf.room;

import com.Nelf.nelf.room.domain.Room;
import com.Nelf.nelf.room.exposition.RoomDto;

public class RoomMapper {

    public static Room toRoom(RoomEntity roomEntity) {
        Room room = new Room();
        room.setId(roomEntity.getId());
        room.setName(roomEntity.getName());
        room.setTaille(roomEntity.getTaille());
        room.setCreationDate(roomEntity.getCreationDate());
        room.setReleaseDate(roomEntity.getReleaseDate());
        return room;
    }

    public static Room toRoom(RoomDto roomDto){
        Room room = new Room();
        room.setId(roomDto.getId());
        room.setName(roomDto.getName());
        room.setTaille(roomDto.getTaille());
        room.setCreationDate(roomDto.getCreationDate());
        room.setReleaseDate(roomDto.getReleaseDate());
        return room;
    }

    public static RoomDto toRoomDto(Room room) {
        RoomDto roomDto = new RoomDto();
        roomDto.setId(room.getId());
        roomDto.setName(room.getName());
        roomDto.setTaille(room.getTaille());
        roomDto.setCreationDate(room.getCreationDate());
        roomDto.setReleaseDate(room.getReleaseDate());
        return roomDto;
    }

    public static RoomEntity toRoomEntity(Room room) {
        RoomEntity roomEntity = new RoomEntity();
        roomEntity.setId(room.getId());
        roomEntity.setName(room.getName());
        roomEntity.setTaille(room.getTaille());
        roomEntity.setCreationDate(room.getCreationDate());
        roomEntity.setReleaseDate(room.getReleaseDate());
        return roomEntity;
    }
}
