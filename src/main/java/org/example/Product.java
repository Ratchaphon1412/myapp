package org.example;

public class Product {
    private int stock;
    private String productName;
    private double price;




    public Product(String Product_Name,int stock_product , double price_product){
        this.productName = Product_Name;
        this.price = price_product;
        this.stock = stock_product;
    }

    //Setter
    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Getter
    public int getStock() {
        return stock;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "stock=" + stock +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                '}';
    }
}
