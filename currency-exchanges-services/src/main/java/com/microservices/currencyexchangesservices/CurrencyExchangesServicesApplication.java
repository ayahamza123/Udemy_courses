package com.microservices.currencyexchangesservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
public class CurrencyExchangesServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyExchangesServicesApplication.class, args);
	}

}
