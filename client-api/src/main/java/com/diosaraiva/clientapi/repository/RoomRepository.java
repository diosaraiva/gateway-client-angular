package com.diosaraiva.clientapi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.diosaraiva.clientapi.model.Room;

@Repository
public interface RoomRepository extends CrudRepository<Room,Long> {
}