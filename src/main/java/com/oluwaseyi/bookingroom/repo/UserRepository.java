package com.oluwaseyi.bookingroom.repo;

import com.oluwaseyi.bookingroom.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
