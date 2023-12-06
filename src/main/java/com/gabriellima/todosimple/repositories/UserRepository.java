package com.gabriellima.todosimple.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gabriellima.todosimple.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

        
} 
