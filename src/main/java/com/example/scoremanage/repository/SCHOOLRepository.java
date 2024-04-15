package com.example.scoremanage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.scoremanage.model.SCHOOL;
 
@Repository
public interface SCHOOLRepository extends JpaRepository<SCHOOL, Long> {
	
}