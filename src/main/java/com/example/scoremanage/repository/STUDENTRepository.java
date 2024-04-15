package com.example.scoremanage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.scoremanage.model.STUDENT;
 
@Repository
public interface STUDENTRepository extends JpaRepository<STUDENT, Long> {
}