package com.example.scoremanage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

import com.example.scoremanage.model.STUDENT;
import com.example.scoremanage.repository.STUDENTRepository;

import jakarta.transaction.Transactional;

@Service

@Transactional

public class STUDENTService {

	@Autowired

	private STUDENTRepository repository;

	/**

	 * ユーザー一覧の取得

	 * @return List<STUDENT>

	 */

	public List<STUDENT> getUserList() {

	    List<STUDENT> entityList = this.repository.findAll();

	    return entityList;

	}

	/**

	 * 詳細データの取得

	 * @param @NonNull Long index

	 * @return  STUDENT

	 */

	public STUDENT get(@NonNull Long index) {

		STUDENT student = this.repository.findById(index).orElse(new STUDENT());

		return student;

	}

	/**

	 * ユーザーデータの保存

	 * @param STUDENT student

	 */

	public void save(@NonNull STUDENT student) {
		this.repository.save(student);

	}

	/**

	 * ユーザーデータの削除

	 * @param @NonNull Long index

	 */

	public void delete(@NonNull Long index) {

		this.repository.deleteById(index);

	}
}