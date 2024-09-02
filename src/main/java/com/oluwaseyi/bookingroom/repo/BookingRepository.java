package com.oluwaseyi.bookingroom.repo;

import com.oluwaseyi.bookingroom.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking,Long> {
}
