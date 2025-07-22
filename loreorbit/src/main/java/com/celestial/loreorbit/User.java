package com.celestial.loreorbit;

import java.util.UUID;

public class User {

    private UUID id;
    private String userName;
    private String email;

    public User(String userName, String email) {
        this.id = UUID.randomUUID();
        this.userName = userName;
        this.email = email;
    }
}
