package com.mimie.simpleWebApp.controller;

import com.mimie.simpleWebApp.model.Product;
import com.mimie.simpleWebApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class ProductsController {
//create a service layer to get data from
    @Autowired
    ProductService service;

    @RequestMapping("/products")
    public List<Product> getProducts(){
        return service.getProducts();
    }
}
