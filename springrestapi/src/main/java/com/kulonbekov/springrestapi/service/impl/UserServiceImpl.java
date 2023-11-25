package com.kulonbekov.springrestapi.service.impl;

import com.kulonbekov.springrestapi.exception.UserAlreadyExistException;
import com.kulonbekov.springrestapi.entity.UserEntity;
import com.kulonbekov.springrestapi.exception.UserNotFoundException;
import com.kulonbekov.springrestapi.model.User;
import com.kulonbekov.springrestapi.repository.UserRepo;
import com.kulonbekov.springrestapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo userRepo;
    @Override
    public UserEntity registration(UserEntity userEntity) throws UserAlreadyExistException {
        if(userRepo.findByUsername(userEntity.getUsername()) != null){
            throw new UserAlreadyExistException("Пользователь с таким именем уже существует");
        }
        return userRepo.save(userEntity);
    }

    @Override
    public User getOneUser(Long id) throws UserNotFoundException {
        UserEntity user = userRepo.findById(id).get();
        if(user == null){
            throw new UserNotFoundException("Пользователь не найден");
        }
        return User.toModel(user);
    }

    @Override
    public Long delete(Long id) {
        userRepo.deleteById(id);
        return id;
    }
}
