package com.bala.pms.controller;

import com.bala.pms.model.ProductModel;
import com.bala.pms.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService){
        this.productService=productService;
    }

    @PostMapping("/add")
    public String addProduct(@RequestBody ProductModel productModel){
        productService.addProduct(productModel);
        return "Product has added successfully";
    }

    @GetMapping("/get")
    public List<ProductModel> listProduct(){
        return productService.listProduct();
    }

    @PutMapping("/update/{id}")
    public ProductModel updateProduct(@PathVariable long id , @RequestBody ProductModel productModel){
        return productService.updateProduct(id , productModel);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteProduct( @PathVariable long id){
        productService.deleteProduct(id);
    }
}
