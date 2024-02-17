package com.ashish.restapicrud.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ashish.restapicrud.model.Product;
import com.ashish.restapicrud.services.ProductServices;


@RestController
public class ProductController {
	@Autowired
	private ProductServices productServices;
	
	@RequestMapping(value = "/products",method = RequestMethod.GET)
	public List<Product> AllProducts(){
		return  productServices.getAllProducts();
	}
	
	@RequestMapping(value = "/product/{pid}",method = RequestMethod.GET)
	public Optional<Product> getProduct(@PathVariable Long pid) {
		return productServices.getProduct(pid);
		
	}
	
	@RequestMapping(value = "product/add", method = RequestMethod.POST)
	public void addProductToList(@RequestBody Product p) {
		productServices.addProduct(p);
	}
	
	@RequestMapping(value = "/update/{id}", method = RequestMethod.PUT)
	public void updateProduct(@PathVariable Long id, @RequestBody Product p) {
		productServices.update(id, p);
	}
	
	@RequestMapping(value = "/delete/{pid}",method = RequestMethod.DELETE)
	public void deleteProduct(@PathVariable Long pid) {
		productServices.delete(pid);
	}
}
