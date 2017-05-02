package com.tang.onetomany.model;

import java.util.List;

/**
 * Customer vo
 * @author TangXW
 *
 */
public class Customer {
	private int cId;
	private String cName;
	private List<Orders> orders; // 顾客所有订单
	
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
	public List<Orders> getOrders() {
		return orders;
	}
	public void setOrders(List<Orders> orders) {
		this.orders = orders;
	}
	
	@Override
	public String toString(){
		String codes = "";
		for(Orders o : orders){
			codes += o.getOCode() + " && ";
		}
		return "the customer id is " + cId + ", the customer name is " + cName + ", the orders code is " + codes;
	}
	
}
