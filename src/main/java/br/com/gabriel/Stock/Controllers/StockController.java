package br.com.gabriel.Stock.Controllers;

import br.com.gabriel.Stock.entities.Stock;
import br.com.gabriel.Stock.services.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/stock")
public class StockController {

    @Autowired
    private StockService stockService;

    @PostMapping("/codeproduct")
    public ResponseEntity<Stock> create(@RequestBody Stock newStock,
                                          @PathVariable("codeproduct") UUID codeProduct){
        newStock.setCodeProduct(codeProduct);
        Stock stock = stockService.saveStock(newStock);
        return  new ResponseEntity<>(stock, HttpStatus.CREATED);
    }

    @PatchMapping("/{codeProduct}")
    public ResponseEntity<Stock> purchaseForStock(@RequestBody Stock stock,
                                                 @PathVariable("codeproduct") UUID codeproduct){
        Stock stc = stockService.findStockByIdProduct(codeproduct);
        stock.setCodeProduct(codeproduct);
        stock.setAvailableQuantity(stc.getAvailableQuantity() + stock.getQuantity());
        stockService.saveStock(stock);
        return new ResponseEntity<>(stock, HttpStatus.OK);
    }

    @GetMapping("{codeproduct}")
    public ResponseEntity<Stock> findStockByCodeProduct(@PathVariable("codeproduct") UUID codeProduct){
        return new ResponseEntity<>(stockService.findStockByIdProduct(codeProduct), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Stock>> findall(){
        return new ResponseEntity<>(stockService.findall(), HttpStatus.OK);
    }
}
