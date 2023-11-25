package com.kulonbekov.springrestapi.service;

import com.kulonbekov.springrestapi.exception.UserAlreadyExistException;
import com.kulonbekov.springrestapi.entity.UserEntity;
import com.kulonbekov.springrestapi.exception.UserNotFoundException;
import com.kulonbekov.springrestapi.model.User;

public interface UserService {

    public UserEntity registration(UserEntity userEntity) throws UserAlreadyExistException;
    public User getOneUser(Long id) throws UserNotFoundException;
    public Long delete(Long id);
}
