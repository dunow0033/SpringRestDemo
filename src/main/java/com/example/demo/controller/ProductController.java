package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;

@RestController
public class ProductController {

	@Autowired
	ProductRepository productrep;
	
	@GetMapping("/retrieve")
	public List<Product> retrieveData()
	{
		return productrep.findAll();
	}
	
	@PostMapping("/insertData")
	public Product saveData(@RequestBody Product p)
	{
		return productrep.save(p);
	}
	
	@GetMapping("/retrieveData/{pid}")
	public Product getProduct(@PathVariable("pid") int id)
	{
		return productrep.findById(id).get();
	}
	
	@GetMapping("/data/{pname}")
	public List<Product> getProductList(@PathVariable("pname") String n)
	{
		return productrep.findByProductname(n);
	}
	
	@GetMapping("/sortedData")
	public List<Product> displayData()
	{
		return productrep.findByOrderByPriceDesc();
	}
	
	@GetMapping("/ret/{productid}/{productname}")
	public Product ret(@PathVariable("productid") int id, @PathVariable("productname") String pname)
	{
		return productrep.findByProductidAndProductname(id, pname);
	}
}
