package com.digitech.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.digitech.model.Product;
import com.digitech.service.ProductService;

@Controller
public class ProductController {
	@Autowired
	ProductService service;
	
	@RequestMapping(value={"/","home"})
	public String home(Model m) {
		List<Product> list=service.getAllProduct();
		m.addAttribute("list", list);
		return "start";
	}
	@RequestMapping("addProduct")
	public String addProduct(Model m,Product product) {
		m.addAttribute("command", new Product());
		return "addproduct";
	}
	@RequestMapping(value="/saveProduct", method=RequestMethod.POST)
	public String saveProduct(Product prod) {
		service.addProduct(prod);
		return "redirect:/";
	}
	
	@RequestMapping("/deleteProduct")
	public String deleteProduct(@RequestParam("id") int id) {
		service.deleteProduct(id);
		return "redirect:/";
	}
	
	@RequestMapping("/editProduct")
	public String editProduct(@RequestParam("id") int id, Model m) {
		Product prod = service.getProduct(id);
		m.addAttribute("command", prod);
		return "editproduct";
	}
	
	@RequestMapping(value="/updateProduct", method=RequestMethod.POST)
	public String updateProduct(Product prod) {
		service.updateProduct(prod);
		return "redirect:/";
	}


}
