package com.ashish.restapicrud.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashish.restapicrud.model.Product;
import com.ashish.restapicrud.repository.ProductRepository;

@Service
public class ProductServices {
	@Autowired
	private ProductRepository productRepository;
	
	public List<Product> getAllProducts(){
		List<Product> products = new ArrayList<>();
		productRepository.findAll().forEach(products::add);
		return products;
	}
	
	public Optional<Product> getProduct(Long id){
		return productRepository.findById(id);
	}
	
	
	public void addProduct(Product product) {
		productRepository.save(product);
		
	}
	
	
	public void update(Long id, Product product) {
		if(productRepository.findById(id).get()!=null) {
			productRepository.save(product);
		}
	}
	
	public void delete(Long id) {
		productRepository.deleteById(id);
	}
}
