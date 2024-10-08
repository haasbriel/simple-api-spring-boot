package com.trabalhospring.trabalho_springboot.repository;

import com.trabalhospring.trabalho_springboot.model.Payment;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface PaymentRepository extends CrudRepository<Payment, UUID> {
}
