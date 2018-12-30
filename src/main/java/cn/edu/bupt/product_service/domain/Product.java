package cn.edu.bupt.product_service.domain;


import java.io.Serializable;

public class Product implements Serializable{
    private int id;

    private String name;

    //价格，分为单位
    private int privce;

    //库存量
    private int store;

    public Product() {
    }

    public Product(int id, String name, int privce, int store) {
        this.id = id;
        this.name = name;
        this.privce = privce;
        this.store = store;
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

    public int getPrivce() {
        return privce;
    }

    public void setPrivce(int privce) {
        this.privce = privce;
    }

    public int getStore() {
        return store;
    }

    public void setStore(int store) {
        this.store = store;
    }
}
