package com.tang.onetoone.action;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tang.onetoone.dao.ClassesDao;
import com.tang.onetoone.model.Classes;
import com.tang.onetoone.model.Teacher;

public class ClassesTest {
	private static ClassesDao classesDao;
	@BeforeClass
	public static void Before(){
        ApplicationContext ctx = null;
        ctx= new ClassPathXmlApplicationContext("applicationContext.xml");
        classesDao =(ClassesDao) ctx.getBean("classesDao");
	}
	
	@Test
	@Ignore
	public void insertInfo(){
		Classes classes = new Classes();
		Teacher teacher = new Teacher();
		teacher.setTId(4);
		teacher.setTName("¿Ó¿œ ¶");
		classes.setCId(3);
		classes.setCName("Õ¯¬Á1403");
		classes.setCTeacher(teacher);
		classesDao.insertInfo(classes);
	}
	
	@Test 
	public void selectAll(){
		Classes classes = new Classes();
		List<Classes> cList = classesDao.selectAll(classes);
		for(Classes c : cList){
			System.out.println(c);
		}
	}
}
