package com.celestial.loreorbit;

import java.security.Timestamp;
import java.util.UUID;

public class Planet {

    private UUID id;
    private String name;
    private UUID owner;
    private String description;
    private Timestamp created;

    public Planet(UUID owner) {
        this.id = UUID.randomUUID();
        this.name = this.id.toString();
        this.owner = owner;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
