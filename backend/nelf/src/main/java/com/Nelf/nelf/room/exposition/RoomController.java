package com.Nelf.nelf.room.exposition;

import com.Nelf.nelf.room.RoomMapper;
import com.Nelf.nelf.room.domain.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/room")
public class RoomController {
    private final RoomService roomService;

    @Autowired
    public RoomController(RoomService roomService){
        this.roomService = roomService;
    }

    @GetMapping
    public List<RoomDto> findAll() {
        List<RoomDto> list = roomService.findAll().stream().map(RoomMapper::toRoomDto).collect(Collectors.toList());

        return list;
    }

    @GetMapping("/{id}")
    public ResponseEntity<RoomDto> findById(@PathVariable int id){
        return roomService.findById(id).map(r -> {
            RoomDto roomDto = RoomMapper.toRoomDto(r);
            return ResponseEntity.ok(roomDto);
        }).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping("/{id}")
    public ResponseEntity<RoomDto> create(@RequestBody RoomDto roomDto) {
        return new ResponseEntity<>(RoomMapper.toRoomDto(roomService.create(RoomMapper.toRoom(roomDto))), HttpStatus.CREATED);
    }

}
