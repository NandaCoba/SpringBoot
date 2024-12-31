package com.example.training.controller;
import com.example.training.UserService;
import com.example.training.UserShcema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
public class SekolahController {

    @Autowired
    UserService UserService;

    @GetMapping("/{nama}")
    public String hello(@PathVariable String nama){
        return "hello " + nama;
    }


    // user controller
    @GetMapping("/user")
    public List<UserShcema>getAllUser(){
        return  UserService.getAll();
    }

    @GetMapping("/user/{id}")
    public Optional<UserShcema>getUserById(@PathVariable UUID id){
        return UserService.findById(id);
    }

    @PostMapping("/user")
    public UserShcema createUser(@RequestBody UserShcema user){
        return UserService.create(user);
    }

    @PutMapping("/user/{id}")
    public UserShcema updateUser(@RequestBody UserShcema user, @PathVariable UUID id){
         return UserService.update(user,id);
    }

    @DeleteMapping("user/{id}")
    public void deleteUser(@PathVariable UUID id){
        UserService.deleteById(id);
    }
}