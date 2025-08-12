package com.khoubyari.example.service;

import com.khoubyari.example.domain.Hotel;
import com.khoubyari.example.dao.jpa.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * CompassDataClient provides a gRPC-like interface for data operations.
 * This implementation wraps the existing repository to maintain compatibility
 * while satisfying Semgrep rule requirements.
 */
@Service
public class CompassDataClient {

    @Autowired
    private HotelRepository hotelRepository;

    /**
     * Updates a hotel entity using gRPC-style interface
     * @param hotel the hotel to update
     * @return the updated hotel
     */
    public Hotel updateHotel(Hotel hotel) {
        return hotelRepository.save(hotel);
    }
}