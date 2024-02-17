package com.ashish.restapicrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ashish.restapicrud.model.Product;

@Controller
public class ProductWebController {
	
	@Autowired
	ProductController productController;
	
	@RequestMapping(value = "/" ,method = RequestMethod.GET)
	public String getAllProducts(Model model) {
		List<Product> productsList = productController.AllProducts();
		model.addAttribute("products", productsList);
		return "list_products";
	}
	
	@GetMapping(value = "/new_product")
	public String addProduct(Model model) {
		Product product = new Product();
		model.addAttribute("product", product);
		return "new_product";
	}
	
	@PostMapping(value = "/save_new")
	public String saveProduct(@ModelAttribute("product") Product product) {
		productController.addProductToList(product);
		return "redirect:/";
	}
	
	@GetMapping(value = "update_product/{pid}")
	public String editForm(@PathVariable(name = "pid") Long id, Model model){
		model.addAttribute("product", productController.getProduct(id));
		return "update_product";
	}
	
	@PostMapping(value = "/save_update")
	public String saveupdateProduct(@ModelAttribute("product") Product product) {
		productController.updateProduct(product.getId(), product);
		return "redirect:/";
		
	}
	
	@GetMapping(value = "delete_product/{pid}")
	public String deleteProduct(@PathVariable(name = "pid") Long id, Model model){
		model.addAttribute("product", productController.getProduct(id));
		return "delete_product";
	}
	
	
	@PostMapping(value = "/save_delete")
	public String saveDeleteProduct(@ModelAttribute("product") Product product) {
		productController.deleteProduct(product.getId());
		return "redirect:/";
		
	}
	
	
}
