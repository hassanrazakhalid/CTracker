package com.CTracker.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CTracker.Entities.InsuranceDetail;

public interface InsuranceRepository extends JpaRepository<InsuranceDetail, Integer> {

}
