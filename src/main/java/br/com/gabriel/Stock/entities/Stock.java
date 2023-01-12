package br.com.gabriel.Stock.entities;

import java.util.UUID;

public class Stock {

    private UUID stockId;

    private UUID codeProduct;

    private int quantity;

    private int availableQuantity;

    public Stock(UUID stockId, UUID codeProduct, int quantity, int availableQuantity) {
        this.stockId = stockId;
        this.codeProduct = codeProduct;
        this.quantity = quantity;
        this.availableQuantity = availableQuantity;
    }

    public UUID getStockId() {
        return stockId;
    }

    public void setStockId(UUID stockId) {
        this.stockId = stockId;
    }

    public UUID getCodeProduct() {
        return codeProduct;
    }

    public void setCodeProduct(UUID codeProduct) {
        this.codeProduct = codeProduct;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getAvailableQuantity() {
        return availableQuantity;
    }

    public void setAvailableQuantity(int availableQuantity) {
        this.availableQuantity = availableQuantity;
    }
}
