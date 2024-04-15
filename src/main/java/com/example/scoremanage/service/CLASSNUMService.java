package com.example.scoremanage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.scoremanage.repository.CLASSNUMRepository;

import jakarta.transaction.Transactional;
 
@Service

@Transactional
 
public class CLASSNUMService {
 
	@Autowired
 
	private CLASSNUMRepository repository;
 
	/**
 
	 * 一覧の取得
 
	 * @return List<CLASSNUM>
 
	 */
 
}