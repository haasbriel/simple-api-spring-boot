package com.trabalhospring.trabalho_springboot.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;


@Getter
@Setter
@AllArgsConstructor
public class PlayerDTO {
    private UUID paymentId;
    private String name;
    private String email;
}
