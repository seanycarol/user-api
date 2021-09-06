package com.example.user.controllers;

import java.util.List;

import com.example.user.models.User;
import com.example.user.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserController {

  @Autowired
  private UserRepository repository;

  @GetMapping
  public ResponseEntity<List<User>> findAll() {
    List<User> result = repository.findAll();
    return ResponseEntity.ok(result);
  }
}
