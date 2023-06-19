package com.api.ets.travelling_app.services;

import java.util.ArrayList;
import java.util.Optional;

import com.api.ets.travelling_app.models.PlayerModel;

public interface IPlayerService {
    public ArrayList<PlayerModel> getAllPlayers();
    public PlayerModel createPlayer(PlayerModel player);
    public Optional<PlayerModel> getPlayerById(Long id);
    public Optional<PlayerModel> updatePlayerById(PlayerModel player, Long id);
    public Boolean deletePlayer(Long id);
}
