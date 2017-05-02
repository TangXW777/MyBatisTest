package com.tang.manytomany.model;

import java.util.List;

/**
 * Student vo
 * @author TangXW
 *
 */
public class Student {
	private int sId;
	private String sName;
	private List<Course> courses;
	public int getSId() {
		return sId;
	}
	public void setSId(int id) {
		sId = id;
	}
	public String getSName() {
		return sName;
	}
	public void setSName(String name) {
		sName = name;
	}
	public List<Course> getCourses() {
		return courses;
	}
	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
	
	@Override
	public String toString(){
		String cnames = "";
		for(Course c : courses){
			cnames += c.getCName() + " && ";
		}
		return "the student id is " + sId + ", the student name is " + sName + ", the course name is " + cnames;
	}
}
