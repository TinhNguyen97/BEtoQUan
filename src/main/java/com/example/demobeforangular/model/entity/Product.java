package com.example.demobeforangular.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private double price;

    @ManyToOne
    private Category category;

    private String image;

    private String description;

    public Product(String name, double price, Category category, String image, String description) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.image = image;
        this.description = description;
    }
}
