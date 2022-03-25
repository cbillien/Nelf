package room.infrastructure;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import room.domaine.Room;

import java.util.UUID;

@Repository
public interface RoomDao extends CrudRepository<Room, UUID> {

}
