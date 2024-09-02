package com.oluwaseyi.bookingroom.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Response {


    private int code;
    private String message;
    private String token;
    private String role;
    private String expirationTime;
    private String bookingCode;
    private userDTO user;
    private RoomDTO room;
    private BookingDTO booking;
    private List<userDTO> userList;
    private  List<RoomDTO> roomList;
    private List<BookingDTO> bookingList;

}
