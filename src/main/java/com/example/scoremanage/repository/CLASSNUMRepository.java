package com.example.scoremanage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.scoremanage.model.CLASSNUM;
 
@Repository
public interface CLASSNUMRepository extends JpaRepository<CLASSNUM, Long> {
	
}