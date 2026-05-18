package com.mimie.simpleWebApp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
@Entity
@Data //to get the data(db)
@AllArgsConstructor //a feature of lombok to create constructors
public class Product {
    //use lombok deps to set up getters and setters or constructors for this class(get it from mvn repository and add to pom file)
    @Id
    private int prodId;
    private String prodName;
    private int price;

    public Product() {

    }
}
