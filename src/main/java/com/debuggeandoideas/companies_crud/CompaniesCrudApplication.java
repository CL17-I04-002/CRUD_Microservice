package com.debuggeandoideas.companies_crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan(basePackages = "com.debuggeandoideas.companies_crud")
public class CompaniesCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(CompaniesCrudApplication.class, args);
	}

}
