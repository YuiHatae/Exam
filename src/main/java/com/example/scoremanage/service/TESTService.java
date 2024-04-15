package com.example.scoremanage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.scoremanage.repository.TESTRepository;

import jakarta.transaction.Transactional;
 
@Service

@Transactional
 
public class TESTService {
 
	@Autowired
 
	private TESTRepository repository;
 
	/**
 
	 * 一覧の取得
 
	 * @return List<TEST>
 
	 */
 
}