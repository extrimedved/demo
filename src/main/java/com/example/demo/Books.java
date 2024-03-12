package com.example.demo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Books {
    private String name;
    private double price;
    private int typesId;
    private int authorsId;
    private String image;

    @JsonCreator
    public Books(
            @JsonProperty(value = "name") String name,
            @JsonProperty(value = "price") double price,
            @JsonProperty(value = "typesId") int typesId,
            @JsonProperty(value = "authorsId") int authorsId,
            @JsonProperty(value = "image") String image) {
        this.name = name;
        this.price = price;
        this.typesId = typesId;
        this.authorsId = authorsId;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getTypesId() {
        return typesId;
    }

    public int getAuthorsId() {
        return authorsId;
    }

    public String getImage() {
        return image;
    }

}
