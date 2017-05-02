package com.tang.onetomany.dao;

import java.util.List;

import com.tang.onetomany.model.Customer;

public interface CustomerDao {
	List<Customer> selectAll(Customer customer);
	void insertInfo(Customer customer);
}
