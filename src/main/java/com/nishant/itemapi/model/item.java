package com.nishant.itemapi.model;

public class item {
    private int id;
    private String name;
    private String description;
    private double price;
    private String category;
    private double rating;
    private boolean inStock;

    public item(){

    }

    public item(int id,String name,String description,double price,String category,double rating,boolean inStock){
        this.id=id;
        this.name=name;
        this.description=description;
        this.price=price;
        this.category=category;
        this.rating=rating;
        this.inStock=inStock;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }
}
