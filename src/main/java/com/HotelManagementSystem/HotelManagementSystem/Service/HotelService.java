package com.HotelManagementSystem.HotelManagementSystem.Service;



import com.HotelManagementSystem.HotelManagementSystem.Entity.Hotel;

import java.util.List;

public interface HotelService {
    List<Hotel> getAllHotels();

    Hotel saveHotel(Hotel hotel);
}
