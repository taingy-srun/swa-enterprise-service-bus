package edu.miu.esb.orderservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class OrderServiceApplication  implements CommandLineRunner {


    @Autowired
    RestTemplate restTemplate;

    public static void main(String[] args) {
        SpringApplication.run(OrderServiceApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        System.out.println("**** OrderServiceApplication Run ****");
        restTemplate.postForLocation("http://localhost:8080/orders", new Order("334", 120.0, "international"));
        restTemplate.postForLocation("http://localhost:8080/orders", new Order("355", 185.0, "domestic"));
    }

}
