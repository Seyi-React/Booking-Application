package com.oluwaseyi.bookingroom.dto;


import com.oluwaseyi.bookingroom.entity.Room;
import com.oluwaseyi.bookingroom.entity.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BookingDTO {

    private Long bookingId;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;
    private int totalOfAdults;
    private int totalOfChildren;
    private int numOfGuests;
    private String bookingCode;
    private User user;
    private RoomDTO room;
}
