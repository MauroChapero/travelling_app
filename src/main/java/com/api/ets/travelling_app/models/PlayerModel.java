package com.api.ets.travelling_app.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "player")
public class PlayerModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Long truckersMPId;

    public PlayerModel() {
    }

    public PlayerModel(String name, Long truckersMPId) {
        this.name = name;
        this.truckersMPId = truckersMPId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getTruckersMPId() {
        return truckersMPId;
    }

    public void setTruckersMPId(Long truckersMPId) {
        this.truckersMPId = truckersMPId;
    }

}
