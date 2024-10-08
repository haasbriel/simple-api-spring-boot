package com.trabalhospring.trabalho_springboot.controllers;


import com.trabalhospring.trabalho_springboot.dtos.PaymentDTO;
import com.trabalhospring.trabalho_springboot.model.Payment;
import com.trabalhospring.trabalho_springboot.model.Player;
import com.trabalhospring.trabalho_springboot.repository.PaymentRepository;
import com.trabalhospring.trabalho_springboot.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("payments")
public class PaymentController {

    @Autowired
    public PaymentRepository paymentsRepository;

    @Autowired
    public PlayerRepository playerRepository;

    @PostMapping("/")
    public ResponseEntity<?> createPayment(@RequestBody PaymentDTO paymentDTO) {
        Player player = playerRepository.findById(paymentDTO.getPlayerId())
                .orElseThrow(() -> new RuntimeException("Jogador não encontrado."));

        Payment payment = new Payment();
        payment.setYear(paymentDTO.getYear());
        payment.setMonth(paymentDTO.getMonth());
        payment.setAmount(paymentDTO.getAmount());
        payment.setPlayer(player);  // Associar o Player encontrado

        paymentsRepository.save(payment);

        return ResponseEntity.ok(payment);
    }

    @GetMapping("/payments")
    public List<Payment> getPayment(){
        return (List<Payment>) paymentsRepository.findAll();
    }

    @GetMapping("/{id}")
    public Payment getPayment(@PathVariable UUID id) {
        return paymentsRepository.findById(id).orElseThrow(() -> new RuntimeException("Pagamento não encontrado."));
    }

    @DeleteMapping("/{id}")
    public String deletePayment(@PathVariable UUID id) {
        Payment existingPayment = paymentsRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Pagamento não encontrado."));

        paymentsRepository.delete(existingPayment);
        return "O Pagamento de ID " + id + " foi deletado com sucesso";
    }

}
