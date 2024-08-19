package com.example.SpringAuth.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.SpringAuth.model.Users;

@Repository
public interface UserRepo extends JpaRepository<Users, Integer> {
    
    Users findByUsername(String username);

}
