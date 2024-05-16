package com.example.shopprojectspring;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ProductController {

private ProductsRepository productsRepository;

    public ProductController(ProductsRepository productsRepository) {
        this.productsRepository = productsRepository;
    }

    @GetMapping("/products")
    public String products(Model model) {
        List<Product> all = productsRepository.findAll();

        model.addAttribute("products",all);
        return "products";
    }

}
