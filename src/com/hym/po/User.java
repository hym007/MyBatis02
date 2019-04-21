package com.hym.po;

import java.io.Serializable;
import java.util.List;

public class User implements Serializable {

    private int id;
    private String username;
    private String address;
    private List<Orders> orders;

    public User() {
    }

    public User(int id, String username, String address, List<Orders> orders) {
        this.id = id;
        this.username = username;
        this.address = address;
        this.orders = orders;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Orders> getOrders() {
        return orders;
    }

    public void setOrders(List<Orders> orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", address='" + address + '\'' +
                ", orders=" + orders +
                '}';
    }
}
