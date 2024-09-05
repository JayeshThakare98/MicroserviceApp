package com.hotel.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hotel.entity.Hotel;

public interface HotelRepository extends JpaRepository<Hotel, String> {
}
