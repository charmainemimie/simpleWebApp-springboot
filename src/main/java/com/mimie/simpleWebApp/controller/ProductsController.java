package com.mimie.simpleWebApp.controller;

import com.mimie.simpleWebApp.model.Product;
import com.mimie.simpleWebApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class ProductsController {
//create a service layer to get data from
    @Autowired
    ProductService service;

    //use requestmapping (only get) or specified annotation eg getmapping, postmapping

    //get products
    @GetMapping("/products")
    public List<Product> getProducts(){

        return service.getProducts();
    }

    //get prod by id
@GetMapping("/products/{prodId}")
//use pathvariable to match the prodid
    public Product getProductById(@PathVariable  int prodId){
        return service.getProductById(prodId);
    }

    //add product
    @PostMapping("/products")
    //use the @requestbody annotation
    public String addProduct(@RequestBody Product prod){

        System.out.println(prod);
        service.addProduct(prod);
        return "product added!";
    }
}
