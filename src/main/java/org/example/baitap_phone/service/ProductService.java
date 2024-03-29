package org.example.baitap_phone.service;




import org.example.baitap_phone.model.Product;
import org.example.baitap_phone.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts() {
        return productRepository.getAllProduct();
    }

    public void createProduct(Product product) {
        productRepository.createProduct(product);
    }

    public void update(int id, Product product) {
        productRepository.update(id, product);
    }

    public Product findById(int id) {
        return productRepository.findById(id);
    }

    public void remove(int id) {
        productRepository.remove(id);
    }
}