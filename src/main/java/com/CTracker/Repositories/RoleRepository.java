package com.CTracker.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CTracker.Entities.RoleAndPermission;;

public interface RoleRepository extends JpaRepository<RoleAndPermission, Integer> {

}
