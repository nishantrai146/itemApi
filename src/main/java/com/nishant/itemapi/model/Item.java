package com.nishant.itemapi.model;

public class Item {
    private int id;
    private String name;
    private String description;
    private double price;
    private String category;

    public Item(){

    }

    public Item(String name, String description, double price, String category){
        this.name=name;
        this.description=description;
        this.price=price;
        this.category=category;
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
}
