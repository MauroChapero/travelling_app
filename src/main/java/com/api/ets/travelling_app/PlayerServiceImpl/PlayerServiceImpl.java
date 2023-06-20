package com.api.ets.travelling_app.PlayerServiceImpl;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.ets.travelling_app.models.PlayerModel;
import com.api.ets.travelling_app.repositories.IPlayerRepository;
import com.api.ets.travelling_app.services.IPlayerService;

@Service
public class PlayerServiceImpl implements IPlayerService {

    private final IPlayerRepository playerRepository;

    @Autowired
    public PlayerServiceImpl(IPlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    @Override
    public ArrayList<PlayerModel> getAllPlayers() {
        return (ArrayList<PlayerModel>) playerRepository.findAll();
    }

    @Override
    public PlayerModel createPlayer(PlayerModel player) {
        return playerRepository.save(player);
    }

    @Override
    public Optional<PlayerModel> getPlayerById(Long id) {
        return playerRepository.findById(id);
    }

    @Override
    public Optional<PlayerModel> updatePlayerById(PlayerModel playerRequest, Long id) {
        Optional<PlayerModel> optionalPlayer = playerRepository.findById(id);
        if (optionalPlayer.isPresent()) {
            PlayerModel existingPlayer = optionalPlayer.get();

            existingPlayer.setName(playerRequest.getName());

            return Optional.of(playerRepository.save(existingPlayer));
        }

        return Optional.empty();
    }

    @Override
    public Boolean deletePlayer(Long id) {
        try {
            if (playerRepository.existsById(id)) {
                playerRepository.deleteById(id);
                return true;
            }
        } catch (Exception error) {
            error.printStackTrace();
        }
        return false;
    }

}
