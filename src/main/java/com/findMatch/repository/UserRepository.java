package com.findMatch.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.findMatch.entity.User;

public interface UserRepository extends JpaRepository<User,Long>{

}
