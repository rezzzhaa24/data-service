package com.dataservice.Service;

import java.util.Arrays;
import java.util.List;

import com.dataservice.Entity.Product;

import org.springframework.stereotype.Service;

@Service
public class ProductService {

    public static List<Product> product = Arrays.asList(
        new Product(1L,"01","Rokok",1000.0),
        new Product(2L,"02","Kosmetik",2000.0),
        new Product(3L,"03","Scencare",3000.0),
        new Product(4L,"04","Handbody",4000.0),
        new Product(5L,"05","Vape",5000.0)
    );

    public List<Product>findAll(){
        return product;
    }


}
