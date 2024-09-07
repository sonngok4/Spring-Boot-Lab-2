package com.example.demo.services;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.Product;

public interface ProductsRepository extends JpaRepository<Product, Integer> {
    
}
