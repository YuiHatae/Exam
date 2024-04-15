package com.example.scoremanage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.scoremanage.repository.SCHOOLRepository;

import jakarta.transaction.Transactional;
 
@Service

@Transactional
 
public class SCHOOLService {
 
	@Autowired
 
	private SCHOOLRepository repository;
 
	/**
 
	 * 一覧の取得
 
	 * @return List<SCHOOL>
 
	 */
 
}