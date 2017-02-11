package com.mc.ssm.model;

/**
 * Created by zhangzhenguo on 2017/2/11.
 */
public class Book {

    private long bookId;

    private String name;

    private String price;

    public long getBookId() {
        return bookId;
    }

    public void setBookId(long bookId) {
        this.bookId = bookId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
