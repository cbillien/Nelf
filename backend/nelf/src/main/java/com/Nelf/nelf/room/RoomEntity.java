package com.Nelf.nelf.room;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;
@Data
@AllArgsConstructor
@Entity
@Table(name = "Room")
public class RoomEntity {
    @Id
    @GeneratedValue
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "taille")
    private int taille;
    @Column(name = "creationDate")
    private Date creationDate;
    @Column(name = "releaseDate")
    private Date releaseDate;

    public RoomEntity() {

    }
}


