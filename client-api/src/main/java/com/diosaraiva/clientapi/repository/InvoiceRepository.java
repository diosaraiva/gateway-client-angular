package com.diosaraiva.clientapi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.diosaraiva.clientapi.model.Invoice;

@Repository
public interface InvoiceRepository extends CrudRepository<Invoice,Long> {
}