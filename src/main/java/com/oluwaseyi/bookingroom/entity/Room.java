package com.oluwaseyi.bookingroom.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "rooms")
public class Room {
    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int roomId;
    private String roomType;
    private String roomPrice;
    private String roomPhotoUrl;
    private String roomType;

}
