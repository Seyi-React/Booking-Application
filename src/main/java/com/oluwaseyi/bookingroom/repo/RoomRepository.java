package com.oluwaseyi.bookingroom.repo;

import com.oluwaseyi.bookingroom.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room,Long> {
}
