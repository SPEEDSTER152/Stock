package br.com.gabriel.Stock.Repositories;

import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;

import java.util.UUID;

public interface ProductRepository extends JpaRepositoriesAutoConfiguration<Product, UUID> {

    public List<Product> findbyNameProduct(String NameProduct);
}
