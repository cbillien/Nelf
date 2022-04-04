package com.Nelf.nelf.room.infrastructure;

import com.Nelf.nelf.room.RoomEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface RoomDao extends JpaRepository<RoomEntity, Integer> {
}
