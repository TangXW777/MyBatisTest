package com.tang.onetoone.model;

/**
 * Classes vo
 * @author TangXW
 *
 */
public class Classes {
	private int cId;
	private String cName;
	private Teacher cTeacher;
	
	
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
	public Teacher getCTeacher() {
		return cTeacher;
	}
	public void setCTeacher(Teacher teacher) {
		cTeacher = teacher;
	}


	@Override
	public String toString() {
		return "the classes id is " + cId + ", the classes name is " + cName + ", the teacher name is " + cTeacher.getTName();
	}
	
	
}
