package com.mimie.simpleWebApp.service;

import com.mimie.simpleWebApp.model.Product;
import lombok.Getter;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
@Getter
@Service //also a component
public class ProductService {

    //get all products
    List<Product> products = Arrays.asList(
            new Product(101,"iphone",5000),
            new Product(102,"canon camera",6000),
            new Product(103,"samsung",6500));

 //get product by id
    public Product getProductById(int prodId) {
        //using the stream api
        return products.stream()
                .filter(p -> p.getProdId() ==prodId)
                //.findFirst().get();
        .findFirst().orElse(new Product(0,"No item",0));
    }
}
