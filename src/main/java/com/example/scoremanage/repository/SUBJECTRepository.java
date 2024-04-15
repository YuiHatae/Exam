package com.example.scoremanage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.scoremanage.model.SUBJECT;
 
@Repository
public interface SUBJECTRepository extends JpaRepository<SUBJECT, Long> {
	
}