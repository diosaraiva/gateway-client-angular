package com.diosaraiva.clientapi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.diosaraiva.clientapi.model.Client;

@Repository
public interface ClientRepository extends CrudRepository<Client,Long> {
}