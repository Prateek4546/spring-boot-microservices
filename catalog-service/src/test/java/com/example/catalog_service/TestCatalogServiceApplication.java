package com.example.catalog_service;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Import;


public class TestCatalogServiceApplication {

	public static void main(String[] args) {
		SpringApplication.from(CatalogServiceApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
