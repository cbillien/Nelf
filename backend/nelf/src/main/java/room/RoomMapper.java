package room;

import room.domaine.Room;
import room.exposition.RoomDto;
import room.infrastructure.RoomEntity;

public class RoomMapper {


    public static Room EntityToRoom (RoomEntity roomEntity){
        Room roomConvert = new Room();
        roomConvert.setId(roomEntity.getId());

        return roomConvert;
    }

    public static RoomDto roomToDto (Room room){
        RoomDto roomConvert = new RoomDto();
        roomConvert.setId(room.getId());

        return roomConvert;
    }
}
