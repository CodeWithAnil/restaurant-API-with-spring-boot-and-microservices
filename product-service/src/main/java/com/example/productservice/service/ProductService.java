package com.example.productservice.service;

import java.security.KeyStore.PrivateKeyEntry;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.productservice.dto.ProductRequest;
import com.example.productservice.dto.ProductResponse;
import com.example.productservice.dto.ProductResponse.ProductResponseBuilder;
import com.example.productservice.model.Product;
import com.example.productservice.model.Product.ProductBuilder;
import com.example.productservice.repository.ProductRepository;
import com.fasterxml.jackson.core.sym.Name;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@AllArgsConstructor
@Slf4j
public class ProductService {
	
	
	final ProductRepository productRepository;
       
	public void  createProduct(ProductRequest productRequest) {
		Product product = Product.builder()
				.name(productRequest.getName())
				.description(productRequest.getDescription())
				.price(productRequest.getPrice())
				.build();
		
		productRepository.save(product);
		log.info("Product {} is saved",product.getId());
	}

	public List<ProductResponse> getAllProducts() {
		// TODO Auto-generated method stub
		List<Product> products =  productRepository.findAll();
		
		return products.stream().map(this::mapToProductResponse).toList();
	}
   public ProductResponse mapToProductResponse(Product product) {
	     return ProductResponse.builder()
	    		 .id(product.getId())
	    		 .name(product.getName())
	    		 .description(product.getDescription())
	    		 .price(product.getPrice())
	    		 .build();
   }
}