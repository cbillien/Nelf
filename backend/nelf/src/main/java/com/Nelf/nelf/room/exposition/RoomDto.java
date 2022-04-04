package com.Nelf.nelf.room.exposition;

import lombok.Data;

import java.util.Date;

@Data
public class RoomDto {
    public int id;
    public String name;
    public int taille;
    public Date creationDate;
    public Date releaseDate;

    public RoomDto() {

    }
}
