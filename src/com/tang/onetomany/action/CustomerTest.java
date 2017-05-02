package com.tang.onetomany.action;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tang.onetomany.dao.CustomerDao;
import com.tang.onetomany.model.Customer;



public class CustomerTest {
	private static CustomerDao customerDao;
	@BeforeClass
	public static void before(){
		 ApplicationContext ctx = null;
		 ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		 customerDao = (CustomerDao) ctx.getBean("customerDao");
	}
	
	@Test
	@Ignore
	public void insertInfo(){
		Customer customer = new Customer();
		customer.setCId(2);
		customer.setCName("¹Ë¿Í2");
		customerDao.insertInfo(customer);
	}
	
	@Test
	public void selectAll(){
		Customer customer = new Customer();
		customer.setCId(2);
		List<Customer> cList = customerDao.selectAll(customer);
		for(Customer c : cList){
			System.out.println(c);
		}
	}
}
