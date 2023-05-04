package edu.miu.esb.esbapplication.shipping;

import edu.miu.esb.esbapplication.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

public class NextDayShippingActivator {
	@Autowired
	RestTemplate restTemplate;

	public void ship(Order order) {
		System.out.println("NextDayShippingActivator: "+ order.toString());
		restTemplate.postForLocation("http://localhost:8081/orders", order);
	}

}
