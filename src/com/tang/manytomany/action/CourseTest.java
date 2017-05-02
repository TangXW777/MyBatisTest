package com.tang.manytomany.action;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tang.manytomany.dao.CourseDao;
import com.tang.manytomany.model.Course;

public class CourseTest {
	private static CourseDao courseDao;
	@BeforeClass
	public static void before(){
		 ApplicationContext ctx = null;
		 ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		 courseDao = (CourseDao) ctx.getBean("courseDao");
	}
	
	@Test
	@Ignore
	public void insertInfo(){
		Course course = new Course();
		course.setCId(4);
		course.setCName("¿Î³Ì4");
		courseDao.insertInfo(course);
	}
	
	@Test
	public void selectAll(){
		Course course = new Course();
		course.setCId(1);
		List<Course> cList = courseDao.selectAll(course);
		for(Course c : cList){
			System.out.println(c);
		}
	}
	
}
