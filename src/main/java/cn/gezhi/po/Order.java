package cn.gezhi.po;

import java.util.List;

public class Order {
    private Integer id;
    private Users user;
    private List<Products> products;
    private String date;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public List<Products> getProducts() {
        return products;
    }

    public void setProducts(List<Products> products) {
        this.products = products;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Order(Integer id, Users user, List<Products> products, String date) {
        this.id = id;
        this.user = user;
        this.products = products;
        this.date = date;
    }
    public Order(){}

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", user=" + user +
                ", products=" + products +
                ", date='" + date + '\'' +
                '}';
    }
}
