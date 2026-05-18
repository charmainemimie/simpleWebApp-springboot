package com.mimie.simpleWebApp.service;

import com.mimie.simpleWebApp.model.Product;
import com.mimie.simpleWebApp.repository.ProductRepo;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Getter //this is getting products
@Setter
@Service //also a component
public class ProductService {

    @Autowired
    ProductRepo repo;


    //get all products

    //use new arraylist because .aslist creates an immutable list
//    List<Product> products = new ArrayList<>(Arrays.asList(
//            new Product(101,"iphone",5000),
//            new Product(102,"canon camera",6000),
//            new Product(103,"samsung",6500)));

    //lombok is using the @Getter at the top to automatically implement this method
 public List<Product> getProducts() {
        return repo.findAll();
    }

    //get product by id
    public Product getProductById(int prodId) {
        //using the stream api
//        return products.stream()
//                .filter(p -> p.getProdId() ==prodId)
//                //.findFirst().get();
//        .findFirst().orElse(new Product(0,"No item",0));

        //returns an optional so if not found create a new prod
        return repo.findById(prodId).orElse(new Product());

 }

    //add product
    public void addProduct(Product prod){
//        products.add(prod);
        repo.save(prod);
 }
//
//    //update product
 public void updateProduct(Product prod) {
//        int index=0;
//        for(int i=0;i<products.size();i++){
//if(products.get(i).getProdId()==prod.getProdId()){
//    index=i;
//}
//        }
//        products.set(index,prod);

     repo.save(prod);

    }

    //delete product
    public void deleteProduct(int prodId) {
//        int index=0;
//        for(int i=0;i<products.size();i++){
//            if(products.get(i).getProdId()==prodId){
//                index=i;
//            }
//        }
//        products.remove(index);
        repo.deleteById(prodId);
    }

    
}
