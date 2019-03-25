package com.diosaraiva.clientapi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.diosaraiva.clientapi.model.Staff;

@Repository
public interface StaffRepository extends CrudRepository<Staff,Long> {
}