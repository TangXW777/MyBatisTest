package com.tang.onetomany.model;

/**
 * Orders vo
 * @author TangXW
 *
 */
public class Orders {
	private int oId; 
	private String oCode;   // ¶©µ¥Âë
	private Customer customer;  // ËùÊô¹Ë¿Í
	public int getOId() {
		return oId;
	}
	public void setOId(int id) {
		oId = id;
	}
	public String getOCode() {
		return oCode;
	}
	public void setOCode(String code) {
		oCode = code;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	@Override
	public String toString() {
		return "the orders id is " + oId + ", the orders code is " + oCode + ", the customer name is " + customer.getCName();
	}
	
	
	
}
