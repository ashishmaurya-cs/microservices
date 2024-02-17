package com.ashish.restapicrud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ashish.restapicrud.model.Product;
import com.ashish.restapicrud.repository.ProductRepository;

@SpringBootApplication
public class RestapicrudApplication implements CommandLineRunner{
	
	@Autowired
	private ProductRepository productRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(RestapicrudApplication.class, args);
	}
	
	@Override
	public void run(String... args) {
		productRepository.save(new Product("Mobile", "Electronics"));
		productRepository.save(new Product("Jeans", "Clothes"));
		productRepository.save(new Product("Laptop", "Electronics"));
		productRepository.save(new Product("Paneer", "Food"));
		productRepository.save(new Product("Audo", "Auto Mobile"));
		
	}
}
