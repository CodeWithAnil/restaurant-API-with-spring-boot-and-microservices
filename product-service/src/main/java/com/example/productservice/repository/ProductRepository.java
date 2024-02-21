package com.example.productservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.productservice.model.Product;

public interface ProductRepository extends MongoRepository<Product, String>{

}
