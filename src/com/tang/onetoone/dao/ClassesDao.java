package com.tang.onetoone.dao;

import java.util.List;

import com.tang.onetoone.model.Classes;


public interface ClassesDao {
	void insertInfo(Classes classes);
	List<Classes> selectAll(Classes classes);
}	

