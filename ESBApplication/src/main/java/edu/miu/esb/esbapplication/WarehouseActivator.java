
package edu.miu.esb.esbapplication;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

public class WarehouseActivator {

	@Autowired
	RestTemplate restTemplate;

	public Order checkStock(Order order) {
		System.out.println("WarehouseActivator: checking order "+order.toString());
		restTemplate.postForLocation("http://localhost:8082/orders", order);
		return order;
	}
}
