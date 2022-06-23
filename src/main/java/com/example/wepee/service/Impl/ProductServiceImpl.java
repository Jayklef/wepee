package com.example.wepee.service.Impl;

import com.example.wepee.entity.Product;
import com.example.wepee.model.ProductModel;
import com.example.wepee.repository.ProductRepository;
import com.example.wepee.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class ProductServiceImpl implements ProductService {

    private ProductRepository productRepository;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> findAllProducts(){
        return productRepository.findAll();
    }

    @Override
    public Product saveProduct(ProductModel productModel){

        Product newProduct = Product.builder()
                .minimumDuration(productModel.getMinimumDuration())
                .maximumDuration(productModel.getMaximumDuration())
                .minimumAmount(productModel.getMinimumAmount())
                .maximumAmount(productModel.getMaximumAmount())
                .loan(productModel.getLoan())
                .charges(productModel.getCharges())
                .build();

        return productRepository.save(newProduct);
    }

    @Override
    public Product findProductById(Long id){

        Optional<Product> product = productRepository.findById(id);

        if (product.isEmpty()){
            throw new RuntimeException("product not found");
        }
        return productRepository.findById(id).get();
    }
}
