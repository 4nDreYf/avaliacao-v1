package com.br.orange.service;

import com.br.orange.model.User;
import org.springframework.http.ResponseEntity;

public interface UserService {

    ResponseEntity findAllUsers();

    ResponseEntity findByCpf(String cpf);

    ResponseEntity saveUser(User user);

    ResponseEntity updateUserByCpf(User user, String cpf);

    ResponseEntity deleteUserByCpf(String cpf);


}
