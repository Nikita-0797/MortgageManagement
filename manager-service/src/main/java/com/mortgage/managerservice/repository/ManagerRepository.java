package com.mortgage.managerservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mortgage.managerservice.model.LoanDetails;

@Repository
public interface ManagerRepository extends JpaRepository<LoanDetails, Integer> {

}
