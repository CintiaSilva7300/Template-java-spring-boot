package com.example.crud.teste;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import models.Product;

@RestController
@RequestMapping("/products")
public class ProductController {
    
    @GetMapping("/p")
    public List<Product> getAllProducts(){
    	
    	LocalDate creationDate = LocalDate.now();// Criação de uma instância de LocalDate com a data desejada

		Product product = new Product("Cadeira", "PRODUCT_001", 337, "madeira", 2, "img.png", true, creationDate);
    	
    	return Arrays.asList(product);
    }
}
