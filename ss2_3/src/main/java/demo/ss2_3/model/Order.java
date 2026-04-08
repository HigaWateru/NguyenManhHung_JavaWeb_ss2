package demo.ss2_3.model;

import java.util.Date;

public class Order {
    public String id, productName;
    public double total;
    private Date orderDate;

    public Order(String id, String productName, double total, Date orderDate) {
        this.id = id;
        this.productName = productName;
        this.total = total;
        this.orderDate = orderDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }
}
