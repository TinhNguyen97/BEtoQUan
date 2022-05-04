package com.example.demobeforangular.model.dto;

import com.example.demobeforangular.model.entity.Category;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;


@Data
public class ProductForm {
    private Long id;
    private String name;
    private double price;
    private Category category;
    private MultipartFile img;
    private String description;

}
