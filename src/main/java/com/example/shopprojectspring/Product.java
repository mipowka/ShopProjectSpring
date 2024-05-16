package com.example.shopprojectspring;

import jakarta.persistence.*;
import lombok.Data;

@Table(name = "products")
@Entity
@Data

public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String name;
    Double price;
    String info;

    public Product(Long id, String info, Double price, String name) {
        this.id = id;
        this.info = info;
        this.price = price;
        this.name = name;
    }

    public Product() {
    }

    public void h1(){

    }

    public void h2(){

    }
}
