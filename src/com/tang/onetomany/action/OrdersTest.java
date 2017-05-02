package com.tang.onetomany.action;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tang.onetomany.dao.OrdersDao;
import com.tang.onetomany.model.Customer;
import com.tang.onetomany.model.Orders;


public class OrdersTest {
	private static OrdersDao ordersDao;
	@BeforeClass
	public static void before(){
	     ApplicationContext ctx = null;
	        ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
	        ordersDao = (OrdersDao) ctx.getBean("ordersDao");
	}
	
	@Test
	@Ignore
	public void insertInfo(){
		Customer customer = new Customer();
		customer.setCId(2);
		Orders orders = new Orders();
		orders.setOId(2);
		orders.setOCode("222222222");
		orders.setCustomer(customer);
		ordersDao.insertInfo(orders);
	}
	
	@Test
	public void selectAll(){
		Orders orders = new Orders();
		orders.setOId(1);
		List<Orders> oList = ordersDao.selectAll(orders);
		for(Orders o : oList){
			System.out.println(o);
		}
	}
}
