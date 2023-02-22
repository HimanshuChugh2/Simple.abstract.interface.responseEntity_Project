package com.simple.custom.response.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simple.custom.response.entity.UserEntity;
import com.simple.custom.response.repo.UserRepository;
import com.simple.custom.response.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
    UserRepository userRepository;
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserEntity saveUser(UserEntity params) {
        userRepository.save(params);
        return params;
    }

    @Override
    public List<UserEntity> listAllUsers() {
        return userRepository.findAll();
    }	

    @Override
    public UserEntity Get(int id) {
        return userRepository.findById(id).get();
    }

    @Override
    public UserEntity Update(UserEntity params, int id) {

       UserEntity user =  userRepository.findById(id).get();
       user.setName(params.getName());
       user.setEmail(params.getEmail());

       return userRepository.save(user);

    }

    @Override
    public String Delete(int id) {
        userRepository.deleteById(id);
        return "User(" + id + ")" + " has been deleted!";
    }
}