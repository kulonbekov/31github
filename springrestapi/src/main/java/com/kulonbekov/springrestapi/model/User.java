package com.kulonbekov.springrestapi.model;

import com.kulonbekov.springrestapi.entity.UserEntity;

public class User {
    private Long id;
    private String username;


    public static User toModel(UserEntity user){
        User model = new User();
        model.setId(user.getId());
        model.setUsername(user.getUsername());
        return model;
    }


    public User() {
    }

    public User(Long id, String username) {
        this.id = id;
        this.username = username;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


}
