package com.trabalhospring.trabalho_springboot.repository;

import com.trabalhospring.trabalho_springboot.model.Player;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface PlayerRepository extends CrudRepository <Player, UUID> {
}
