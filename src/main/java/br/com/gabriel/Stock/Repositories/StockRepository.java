package br.com.gabriel.Stock.Repositories;

import br.com.gabriel.Stock.entities.Stock;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;

import java.util.UUID;

public interface StockRepository extends JpaRepositoriesAutoConfiguration<Stock, UUID> {

    public Stock findbyCodeProduct(UUID CodeProduct);
}
