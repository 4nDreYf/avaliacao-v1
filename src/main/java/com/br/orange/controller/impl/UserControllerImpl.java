package com.br.orange.controller.impl;

import com.br.orange.controller.UserController;
import com.br.orange.model.User;
import com.br.orange.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserControllerImpl implements UserController {

    @Autowired
    UserService userService;

    @Override
    public ResponseEntity getUsers() {
        return userService.findAllUsers();
    }

    @Override
    public ResponseEntity getUserByCpf(String cpf) {
        return userService.findByCpf(cpf);
    }

    @Override
    public ResponseEntity saveUser(User user) {
        return userService.saveUser(user);
    }

    @Override
    public ResponseEntity updateUserByCpf(User user, String cpf) {
        return userService.updateUserByCpf(user, cpf);
    }

    @Override
    public ResponseEntity deleteUserByCpf(String cpf) {
        return userService.deleteUserByCpf(cpf);
    }
}
