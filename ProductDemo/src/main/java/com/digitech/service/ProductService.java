package com.digitech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.digitech.model.Product;
import com.digitech.repository.ProductRepository;

@Service
public class ProductService {
	@Autowired
	ProductRepository rep;
	
	public boolean addProduct(Product prod)
	{
		return rep.addProduct(prod);
	}
	
	public List<Product> getAllProduct()
	{
		return rep.getAllProduct();
	}
	
	public void deleteProduct(int id)
	{
		rep.deleteProduct(id);
	}
	
	public void updateProduct(Product prod)
	{
		rep.updateProduct(prod);
	}
	
	public Product getProduct(int id)
	{
		return rep.getProduct(id);
	}

}
