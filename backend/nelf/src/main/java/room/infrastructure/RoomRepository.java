package room.infrastructure;

import org.springframework.stereotype.Component;
import room.RoomMapper;
import room.domaine.Room;

import java.util.List;
import java.util.stream.Collectors;
@Component
public class RoomRepository {

    private final RoomDao roomDao ;

    public RoomRepository(RoomDao roomDao) {
        this.roomDao = roomDao;
    }

    public List<Room> findAll() {

        return (List<Room>) roomDao.findAll();
    }
}
