package com.api.ets.travelling_app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.ets.travelling_app.models.PlayerModel;

@Repository
public interface IPlayerRepository extends JpaRepository<PlayerModel, Long> {

}
