package room.exposition;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import room.RoomMapper;
import room.domaine.RoomService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/room")
public class RoomController {

    private final RoomService roomService;


    public RoomController(RoomService roomService) {
        this.roomService = roomService;
    }

    @GetMapping
    public List<RoomDto> findAll() {
        return RoomService.findAll()
                .stream()
                .map(RoomMapper::roomToDto)
                .collect(Collectors.toList());
    }
}
