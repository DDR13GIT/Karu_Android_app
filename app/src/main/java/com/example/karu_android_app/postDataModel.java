package com.example.karu_android_app;

public class postDataModel {
    private String title;
    private int size;
    private String description;
    private String category;
    private int price;

    public postDataModel() {
    }

    public postDataModel(String title, int size, String description, String category, int price) {
        this.title = title;
        this.size = size;
        this.description = description;
        this.category = category;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public int getSize() {
        return size;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public int getPrice() {
        return price;
    }
}
