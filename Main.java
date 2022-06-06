package com.assignment;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Address add1 = new Address();
		add1.setCity("bihar");
		add1.setCountry("india");
		add1.setPin(234567);
		
		OrderLine ol1 = new OrderLine();
		ol1.setItem("phone");
		ol1.setPrice(10000);
		ol1.setQuantity(1);
		ol1.setEta(2);
		ol1.setOrderLineStatus(OrderLineStatus.open);
		
		OrderLine ol2 = new OrderLine();
		ol2.setItem("laptop");
		ol2.setPrice(90000);
		ol2.setQuantity(3);
		ol2.setEta(2);
		ol2.setOrderLineStatus(OrderLineStatus.delivered);
		
		List<OrderLine> orderlines = new ArrayList<>();
		orderlines.add(ol1);
		orderlines.add(ol2);
		
		Order order = new Order();
		order.setTotalAmount(order.claculateFinalAmount(orderlines));
		order.setOrderDate("02-06-2022");
		order.setAddress(add1);
		order.setOrderlines(orderlines);
		order.setOrderStatus(order.orderStatus(orderlines));
		
		
		System.out.println(order);
}


	}


