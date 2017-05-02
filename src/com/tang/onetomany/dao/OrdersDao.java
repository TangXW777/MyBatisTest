package com.tang.onetomany.dao;

import java.util.List;

import com.tang.onetomany.model.Orders;

public interface OrdersDao {
	List<Orders> selectAll(Orders orders);
	void insertInfo(Orders orders);
}
