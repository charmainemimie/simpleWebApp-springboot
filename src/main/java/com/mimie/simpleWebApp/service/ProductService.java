package com.mimie.simpleWebApp.service;

import com.mimie.simpleWebApp.model.Product;
import lombok.Getter;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
@Getter
@Service //also a component
public class ProductService {
    List<Product> products = Arrays.asList(
            new Product(101,"iphone",5000),
            new Product(102,"canon camera",6000),
            new Product(103,"samsung",6500));
}
