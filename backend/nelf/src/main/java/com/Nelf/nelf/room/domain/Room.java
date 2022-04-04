package com.Nelf.nelf.room.domain;

import lombok.Data;

import java.util.Date;

@Data
public class Room {
    public int id;
    public String name;
    public int taille;
    public Date creationDate;
    public Date releaseDate;

    public Room() {

    }
}
