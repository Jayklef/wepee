package com.example.wepee.controller;

import com.example.wepee.entity.Client;
import com.example.wepee.entity.Product;
import com.example.wepee.model.ProductModel;
import com.example.wepee.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/products")
public class ProductController {

    private ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/list")
    public ResponseEntity<List<Product>> findAllProducts(){
        List<Product> product = productService.findAllProducts();
        return new ResponseEntity<>(product, HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<Product> createProduct(@RequestBody ProductModel productModel){
        Product newProduct = productService.saveProduct(productModel);
        return new ResponseEntity<>(newProduct, HttpStatus.CREATED);
    }

    @GetMapping("/{id}/product")
    public ResponseEntity<Product> findProductById(@PathVariable("id") Long id){
        Product product = productService.findProductById(id);
        return new ResponseEntity<>(product, HttpStatus.FOUND);
    }
}
