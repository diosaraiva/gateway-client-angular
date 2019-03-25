package com.diosaraiva.clientapi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.diosaraiva.clientapi.model.Booking;

@Repository
public interface BookingRepository extends CrudRepository<Booking,Long> {
}