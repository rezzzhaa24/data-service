package com.dataservice.Entity;

public class Product {

    private Long id;
    private String code;
    private String name;
    private Double price;


    public Product() {

    }

    public Product (Long id , String code , String name , Double price){
        this.id =id;
        this.code =code;
        this.name =name;
        this.price =price;
    }    

    public Long getId(){
        return this.id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getCode(){
        return this.code;
    }

    public void setCode(String code){
        this.code = code;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getPrice(){
        return this.price;
    }

    public void setPrice(double price){
        this.price = price;
    }

}
