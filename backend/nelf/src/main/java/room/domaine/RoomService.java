package room.domaine;

import org.springframework.beans.factory.annotation.Autowired;
import room.infrastructure.RoomRepository;

import java.util.List;

public class RoomService {

    @Autowired
    private static RoomRepository roomRepository;

    public RoomService(RoomRepository roomRepository) {
        this.roomRepository= roomRepository;
    }

    public static List<Room> findAll() {

        return roomRepository.findAll();
    }
}
