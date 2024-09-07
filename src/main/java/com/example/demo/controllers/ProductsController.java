package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.models.Product;
import com.example.demo.services.ProductsRepository;

@Controller
@RequestMapping("/products")
public class ProductsController {
    @Autowired
    private ProductsRepository repo;

    @GetMapping({ "", "/" })
    public String ShowProductList(Model model) {
        List<Product> products = repo.findAll();// Sort.by(Sort.Direction.DESC, "id")
        model.addAttribute("products", products);
        return "products/index";
    }

}
