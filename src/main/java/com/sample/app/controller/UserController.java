package com.sample.app.controller;

import com.sample.app.entity.UserDataEntity;
import com.sample.app.repository.UserDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserDataRepository userDataRepository;

    @PostMapping("/insertData")
    public ResponseEntity<String> createUser(@RequestBody UserDataEntity userData) {
        try {
            userDataRepository.createUserData(userData);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.badRequest().body("Failed");
        }
        return ResponseEntity.ok().body("Success");
    }
}
