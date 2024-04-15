package com.example.scoremanage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.scoremanage.model.TEST;
 
@Repository
public interface TESTRepository extends JpaRepository<TEST, Long> {
	
}