package br.com.gabriel.Stock.services;

import br.com.gabriel.Stock.Repositories.StockRepository;
import br.com.gabriel.Stock.entities.Stock;

import java.util.List;
import java.util.UUID;

public class StockService {

    private Stock stock;

    private StockRepository stockRepository;

    public Stock saveStock(Stock stock){
     return stockRepository.save(stock);
    }

    public Stock findStockByIdProduct(UUID codeProduct){
        return stockRepository.findStockByIdProduct(codeProduct);
    }
    public List<Stock> findall(){
        return stockRepository.findall;
    }
}
