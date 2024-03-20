package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{
	//select * from product where productname=name
	public List<Product> findByProductname(String name);
	
	//it will retrieve the data according to price in descending order
	//select * from product order by price desc;
	public List<Product> findByOrderByPriceDesc();
	
	
	//select * from product where productid=pid and productname=name;
	public Product findByProductidAndProductname(int pid, String pname);
}
