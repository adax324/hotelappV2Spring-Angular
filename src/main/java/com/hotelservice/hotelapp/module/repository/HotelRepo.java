package com.hotelservice.hotelapp.module.repository;

import com.hotelservice.hotelapp.module.entity.HotelEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface HotelRepo extends JpaRepository<HotelEntity,Integer> {
    Optional<HotelEntity> getHotelEntityByUuid(String uuid);
    void deleteByUuid(String uuid);
    }

