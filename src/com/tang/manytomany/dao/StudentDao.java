package com.tang.manytomany.dao;

import java.util.List;

import com.tang.manytomany.model.Student;

public interface StudentDao {
	List<Student> selectAll(Student student);
	void insertInfo(Student student);
}
