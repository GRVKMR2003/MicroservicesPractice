package com.user.userservice.user.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user.userservice.user.entities.User;

public interface userRepo extends JpaRepository<User,String> {
    
}
