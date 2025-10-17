package com.bala.pms.service;

import com.bala.pms.model.ProductModel;
import com.bala.pms.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ProductService {
    List<ProductModel> listProduct();
    ProductModel addProduct(ProductModel productModel);
    ProductModel updateProduct(long id , ProductModel updateProduct);
}

@Service
class ProductServiceImpl implements ProductService{

    private final ProductRepository productRepository;

    ProductServiceImpl(ProductRepository productRepository){
        this.productRepository=productRepository;
    }

    @Override
    public List<ProductModel> listProduct(){
        return productRepository.findAll();
    }

    @Override
    public ProductModel addProduct(ProductModel productModel){
       return productRepository.save(productModel);
    }

    @Override
    public ProductModel updateProduct(long id , ProductModel updateproduct){
        ProductModel existingProduct = productRepository.findById(id).orElseThrow(() -> new RuntimeException("product Not found"));
        existingProduct.setProductName(updateproduct.getProductName());
        existingProduct.setProductDescription(updateproduct.getProductDescription());
        existingProduct.setProductPrice(updateproduct.getProductPrice());
        existingProduct.setProductQuantity(updateproduct.getProductQuantity());

        return productRepository.save(existingProduct);
    }


}
