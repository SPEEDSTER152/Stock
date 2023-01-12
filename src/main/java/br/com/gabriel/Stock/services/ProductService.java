package br.com.gabriel.Stock.services;

import br.com.gabriel.Stock.Repositories.ProductRepository;
import br.com.gabriel.Stock.entities.Product;

import java.util.List;
import java.util.UUID;

public class ProductService {

    private Product Product;

    private ProductRepository productRepository;

    public static Product save(UUID product){
        return ProductRepository.save(product);
    }

    public static List<Product> findByNameProduct(String nameProduct){
        return productRepository.findbyNameProduct(nameProduct);
    }
    public Product findById(UUID codeProduct){
        return productRepository.findbyId(codeProduct).orElseThrow();
    }

    public List<Product> findall(){
        return productRepository.findall();
    }
}
