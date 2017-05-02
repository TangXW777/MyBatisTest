package com.tang.manytomany.action;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tang.manytomany.dao.StudentDao;
import com.tang.manytomany.model.Student;

public class StudentTest {
	private static StudentDao studentDao;
	@BeforeClass
	public static void before(){
		 ApplicationContext ctx = null;
		 ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		 studentDao = (StudentDao) ctx.getBean("studentDao");
	}
	
	@Test
	@Ignore
	public void insertInfo(){
		Student student = new Student();
		student.setSId(4);
		student.setSName("Ñ§Éú4");
		studentDao.insertInfo(student);
	}
	
	@Test
	public void selectAll(){
		Student student = new Student();
		student.setSId(1);
		List<Student> sList = studentDao.selectAll(student);
		for(Student s : sList){
			System.out.println(s);
		}
	}
}
