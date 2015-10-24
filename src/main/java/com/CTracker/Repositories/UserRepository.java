package com.CTracker.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CTracker.Entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
