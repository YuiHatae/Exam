package com.example.scoremanage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.scoremanage.repository.SUBJECTRepository;

import jakarta.transaction.Transactional;
 
@Service

@Transactional
 
public class SUBJECTService {
 
	@Autowired
 
	private SUBJECTRepository repository;
 
	/**
 
	 * 一覧の取得
 
	 * @return List<SUBJECT>
 
	 */
 
}