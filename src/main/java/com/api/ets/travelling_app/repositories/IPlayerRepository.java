package com.api.ets.travelling_app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.ets.travelling_app.models.PlayerModel;

public interface IPlayerRepository extends JpaRepository<PlayerModel, Long>{
       
}
