package org.webdevelopment.objectboxdemo;

import io.objectbox.annotation.Entity;
import io.objectbox.annotation.Id;
import io.objectbox.annotation.Generated;

/**
 * Created by makn on 07-04-2017.
 */

@Entity
public class Product {

    @Id
    private long id;
    private String name;
    private int price;

    @Override
    public String toString() {
        return id+": "+name+" costs "+price;
    }

    public Product(String name, int price)
    {
        this.price = price;
        this.name = name;
    }

    @Generated(hash = 358248395)
    public Product(long id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    @Generated(hash = 1890278724)
    public Product() {
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public long getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setId(long id) {
        this.id = id;
    }
}
