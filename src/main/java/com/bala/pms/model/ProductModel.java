package com.bala.pms.model;

import jakarta.persistence.*;

@Entity
@Table(name = "products")
public class ProductModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "product_name" ,nullable = false)
    private String productName;
    @Column(name = "product_description" , nullable = false)
    private String productDescription;
    @Column(name = "product_price" ,nullable = false)
    private double productPrice;
    @Column(name = "product_quantity", nullable = false)
    private int productQuantity;

    ProductModel(){

    }


    public ProductModel(String productName , String productDescription , double productPrice , int productQuantity){
        this.productName=productName;
        this.productDescription=productDescription;
        this.productPrice=productPrice;
        this.productQuantity=productQuantity;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
