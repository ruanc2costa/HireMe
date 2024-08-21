package com.cuzan.hireme.service;

import com.cuzan.hireme.dto.UserDTO;
import com.cuzan.hireme.model.User;
import com.cuzan.hireme.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public UserDTO createUser(UserDTO userDTO){
        User user = new User(userDTO);
        userRepository.save(user);
        return userDTO;
    }
}
