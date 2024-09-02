package com.oluwaseyi.bookingroom.dto;


import com.oluwaseyi.bookingroom.entity.Booking;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class userDTO {


    private Long id;
    private  String name;
    private  String email;
    private  String phoneNumber;
    private  String role;
    private List<BookingDTO> bookings = new ArrayList<>();

}
