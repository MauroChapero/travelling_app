package com.api.ets.travelling_app.models;

import jakarta.persistence.Column;
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

    @Column(name = "euro_username")
    private String euroUsername;

    public PlayerModel(String name, String euroUsername) {
        this.name = name;
        this.euroUsername = euroUsername;
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

    public String getEuroUsername() {
        return euroUsername;
    }

    public void setEuroUsername(String euroUsername) {
        this.euroUsername = euroUsername;
    }

}
