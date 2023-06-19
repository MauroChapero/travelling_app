package com.api.ets.travelling_app.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.ets.travelling_app.models.PlayerModel;
import com.api.ets.travelling_app.services.IPlayerService;

@RestController
@RequestMapping("/players")
public class PlayerController {

    private final IPlayerService playerService;

    @Autowired
    public PlayerController(IPlayerService playerService) {
        this.playerService = playerService;
    }

    @GetMapping
    public ArrayList<PlayerModel> getAllPlayers() {
        return playerService.getAllPlayers();
    }

    @PostMapping
    public PlayerModel createPlayer(@RequestBody PlayerModel player) {
        return playerService.createPlayer(player);
    }

    @GetMapping(path = "/{id}")
    public Optional<PlayerModel> getPlayerById(@PathVariable("id") Long id) {
        return playerService.getPlayerById(id);
    }

    @PutMapping(path = "/{id}")
    public Optional<PlayerModel> updatePlayerById(@RequestBody PlayerModel playerRequest, @PathVariable("id") Long id) {
        return playerService.updatePlayerById(playerRequest, id);
    }

    @DeleteMapping("/{id}")
public ResponseEntity<String> deletePlayer(@PathVariable("id") Long id) {
    boolean deleted = playerService.deletePlayer(id);

    if (!deleted) {
        return ResponseEntity.notFound().build();
    }

    return ResponseEntity.ok("Player has been deleted successfully");
}

}
