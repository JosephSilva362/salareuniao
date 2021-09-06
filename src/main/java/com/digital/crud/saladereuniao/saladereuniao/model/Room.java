package com.digital.crud.saladereuniao.saladereuniao.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "meetingroom")
@AllArgsConstructor
@NoArgsConstructor
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "date", nullable = false)
    private String data;

    @Column(name = "startHour", nullable = false)
    private String startHour;

    @Column(name = "endHour", nullable = false)
    private String endHour;

    @Override
    public String toString(){
        return "Room [id="+id+", name="+name+", data= "+data+", startHour="+startHour+", endHour= "+endHour+"]";
    }
}
