package com.tang.manytomany.dao;

import java.util.List;

import com.tang.manytomany.model.Course;

public interface CourseDao {
	List<Course> selectAll(Course course);
	void insertInfo(Course course);
}
