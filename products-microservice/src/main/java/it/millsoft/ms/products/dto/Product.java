package it.millsoft.ms.products.dto;

import java.io.Serializable;

/**
 * Created by a.benvenuto on 23/03/2017.
 */
public class Product implements Serializable
{
    private static final long serialVersionUID = 5203171483511609855L;

    private Integer id;
    private String name;
    private String brand;
    private String description;
    private Double price;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
