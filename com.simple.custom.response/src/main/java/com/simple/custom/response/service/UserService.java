package com.simple.custom.response.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.simple.custom.response.entity.UserEntity;

@Component
public interface UserService {
    UserEntity saveUser(UserEntity params);

    List<UserEntity> listAllUsers();

    UserEntity Get(int id);

    UserEntity Update(UserEntity params, int id);

    String Delete(int id);
}