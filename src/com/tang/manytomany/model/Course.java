package com.tang.manytomany.model;

import java.util.List;

/**
 * Course vo
 * @author TangXW
 *
 */
public class Course {
	private int cId;
	private String cName;
	private List<Student> students;
	public int getCId() {
		return cId;
	}
	public void setCId(int id) {
		cId = id;
	}
	public String getCName() {
		return cName;
	}
	public void setCName(String name) {
		cName = name;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	
	@Override
	public String toString(){
		String snames = "";
		for(Student s : students){
			snames += s.getSName() + " && ";
		}
		return "the course id is " + cId + ", the course name is " + cName + ", the student name is " + snames;
	}
}
