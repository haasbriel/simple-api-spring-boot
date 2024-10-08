package com.trabalhospring.trabalho_springboot.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.UUID;


@Getter
@Setter
@AllArgsConstructor
public class PaymentDTO {

    private UUID playerId;
    private int year;
    private int month;
    private float amount;
}
