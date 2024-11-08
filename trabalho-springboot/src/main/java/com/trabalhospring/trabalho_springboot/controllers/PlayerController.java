package com.trabalhospring.trabalho_springboot.controllers;


import com.trabalhospring.trabalho_springboot.dtos.PlayerDTO;
import com.trabalhospring.trabalho_springboot.model.Player;
import com.trabalhospring.trabalho_springboot.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/player")
public class PlayerController {

    @Autowired
    public PlayerRepository playerRepository;

    @PostMapping("/")
    public Player create(@RequestBody Player player){
        return playerRepository.save(player);
    }

    @GetMapping("/players")
    public List<Player> getPlayer(){
        return (List<Player>) playerRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<PlayerDTO> getPlayer(@PathVariable UUID id) {
        Player player = playerRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Jogador não encontrado"));

        PlayerDTO playerDTO = new PlayerDTO(
                player.getCod_player(),
                player.getName(),
                player.getEmail()
        );

        return ResponseEntity.ok(playerDTO);

    }

    @PutMapping("/{id}")
    public Player updatePlayer(@PathVariable UUID id, @RequestBody Player updatedPlayer) {
        Player existingPlayer = playerRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Jogador não encontrado."));

        existingPlayer.setName(updatedPlayer.getName());
        existingPlayer.setEmail(updatedPlayer.getEmail());

        return playerRepository.save(existingPlayer);
    }

    @DeleteMapping("/{id}")
    public String deletePlayer(@PathVariable UUID id) {
        Player existingPlayer = playerRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Jogador não encontrado."));

        playerRepository.delete(existingPlayer);
        return "O jogador de ID " + id + " foi deletado com sucesso";
    }





}
