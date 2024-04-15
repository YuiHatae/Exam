package com.example.scoremanage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.scoremanage.repository.TEACHERRepository;

import jakarta.transaction.Transactional;
 
@Service

@Transactional
 
public class TEACHERService {
 
	@Autowired
 
	private TEACHERRepository repository;
 
	/**
 
	 * 一覧の取得
 
	 * @return List<TEACHER>
 
	 */
 
}