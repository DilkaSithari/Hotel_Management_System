package com.HotelManagementSystem.HotelManagementSystem.Repository;


import com.HotelManagementSystem.HotelManagementSystem.Entity.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository extends JpaRepository<Hotel,Long> {
}
