package com.HotelManagementSystem.HotelManagementSystem.ServiceImpl;

import com.HotelManagementSystem.HotelManagementSystem.Entity.Hotel;


import com.HotelManagementSystem.HotelManagementSystem.Repository.HotelRepository;
import com.HotelManagementSystem.HotelManagementSystem.Service.HotelService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class HotelServiceImpl implements HotelService {
    private HotelRepository hotelRepository;

    public HotelServiceImpl(HotelRepository hotelRepository) {
        super();
        this.hotelRepository = hotelRepository;
    }

    @Override
    public List<Hotel> getAllHotels() {
        return hotelRepository.findAll();
    }

    @Override
    public Hotel saveHotel(Hotel hotel) {
        return hotelRepository.save(hotel);
    }
}
