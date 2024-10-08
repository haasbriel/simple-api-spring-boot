package com.trabalhospring.trabalho_springboot.model;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor


@Entity
public class Payment {

    public Payment (){

    }

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID cod_payment;
    private int year;
    private int month;
    private float amount;


    @ManyToOne(optional = true, fetch = FetchType.EAGER)
    @JsonManagedReference
    private Player player;


}
