package com.example.scoremanage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.scoremanage.model.TEACHER;
 
@Repository
public interface TEACHERRepository extends JpaRepository<TEACHER, Long> {
	
}