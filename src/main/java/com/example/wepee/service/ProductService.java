package com.example.wepee.service;

import com.example.wepee.entity.Product;
import com.example.wepee.model.ProductModel;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface ProductService {

    List<Product> findAllProducts();

    Product saveProduct(ProductModel productModel);

    Product findProductById(Long id);
}
