package com.trabalhospring.trabalho_springboot.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@Entity
public class Player {

    public Player(){

    }

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID cod_player;

    @OneToMany(mappedBy = "player", fetch = FetchType.EAGER)
    @JsonIgnore
    private List<Payment> payments;

    private String name;
    private String email;
    private Date dateOfBirth;

    public Player(String id) {
    }
}
