package com.user.userservice.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.userservice.user.entities.User;
import com.user.userservice.user.services.UserService;

@RestController
@RequestMapping("/users/")
public class Controller {
    @Autowired
    private UserService service;

     @PostMapping
    public ResponseEntity<User> add(@RequestBody User user){
        User  user1 =service.create(user);
        return new ResponseEntity<>(user1 , HttpStatus.CREATED);
               
    }
   @GetMapping("/{id}")
  public ResponseEntity<User>  getbyid(@PathVariable String id){
    User u = service.findbyid(id);
    return new ResponseEntity<>(u,HttpStatus.OK);

  }
  @GetMapping
  public ResponseEntity<List<User>> getallUser(){
    List<User> l = service.get();
    return new ResponseEntity<>(l,HttpStatus.OK);
  }
    
}
