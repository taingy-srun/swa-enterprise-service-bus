package edu.miu.esb.esbapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@ImportResource("classpath:esbconfig.xml")
public class EsbApplication {

    public static void main(String[] args) {
        SpringApplication.run(EsbApplication.class, args);
    }

    @Bean
    RestTemplate restTemplate(){
        return new RestTemplate();
    }

}
