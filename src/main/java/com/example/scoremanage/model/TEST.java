package com.example.scoremanage.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Data
@Entity
@Table(name = "TEST")
public class TEST {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(length = 10, nullable = false)
	private String STUDENT_NO;
	
	@Column(length = 3, nullable = false)
	private String SUBJECT_CD;
	
	@Column(length = 10, nullable = false)
	private String SCHOOL_CD;
	
	@Column(length = 10, nullable = false)
	private Integer NO;
	
	@Column(length = 10, nullable = true)
	private Integer POINT;
	
	@Column(length = 5, nullable = true)
	private String CLASS_NUM;
	
}