package com.ecommerce.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.api.entities.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer>{
	
}
