package com.mimie.simpleWebApp.service;

import com.mimie.simpleWebApp.model.Product;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Getter //this is getting products
@Setter
@Service //also a component
public class ProductService {

    //get all products

    //use new arraylist because .aslist creates an immutable list
    List<Product> products = new ArrayList<>(Arrays.asList(
            new Product(101,"iphone",5000),
            new Product(102,"canon camera",6000),
            new Product(103,"samsung",6500)));

    //lombok is using the @Getter at the top to automatically implement this method
   /* public List<Product> getProducts() {
        return products;
    }*/

    //get product by id
    public Product getProductById(int prodId) {
        //using the stream api
        return products.stream()
                .filter(p -> p.getProdId() ==prodId)
                //.findFirst().get();
        .findFirst().orElse(new Product(0,"No item",0));
    }

    //add product
    public void addProduct(Product prod){
        products.add(prod);
    }
}
