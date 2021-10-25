package com.digitech.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.digitech.model.Product;

@Repository
public class ProductRepository {
	@Autowired
	SessionFactory factory;
	
	@Transactional
	public boolean addProduct(Product prod) {
		Session session=factory.getCurrentSession();
		Product p=(Product)session.get(Product.class, prod.getId());
		if(p!=null) {
			return false;
		}
		session.save(prod);
		return true;
	}
	
	@Transactional
	public List<Product> getAllProduct(){
		Session session=factory.getCurrentSession();
		Query q=session.createQuery("from Product");
		List<Product> list=q.list();
		return list;
		}
	
	@Transactional
	public void deleteProduct(int id) {
		Session session=factory.getCurrentSession();
		session.delete(session.get(Product.class, id));
		
	}
	
	@Transactional
	public Product getProduct(int id) {
		Session session=factory.getCurrentSession();
		return (Product)session.get(Product.class, id);
	}
	
	@Transactional
	public void updateProduct(Product prod) {
		Session session=factory.getCurrentSession();
		session.saveOrUpdate(prod);
	}

}
