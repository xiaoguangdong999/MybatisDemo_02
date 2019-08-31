package com.woniu.mybatis.pojo;


import java.math.BigDecimal;
import java.util.Date;

/**
 * @author z.chenbin
 * @date : 2019/8/31
 * @describe:
 */
public class Book {
    private int id;
    private String name;
    private String publish;
    private String author;
    private Date publishDate;
    private BigDecimal price;
    private BigDecimal nowPrice;
    private String status; //状态 1 上架   0  下架
    private String describe;
    private String bookNum; //编号
    private BookType booktype;  // 1 ,推荐  2 特价  3 精选   0  普通
    private BookCategory bookCategory;
    private BookImage bookImage;  //封面

    public Book(int id, String name, String publish, String author, Date publishDate, BigDecimal price, BigDecimal nowPrice, String status, String describe, String bookNum, BookType booktype, BookCategory bookCategory, BookImage bookImage) {
        this.id = id;
        this.name = name;
        this.publish = publish;
        this.author = author;
        this.publishDate = publishDate;
        this.price = price;
        this.nowPrice = nowPrice;
        this.status = status;
        this.describe = describe;
        this.bookNum = bookNum;
        this.booktype = booktype;
        this.bookCategory = bookCategory;
        this.bookImage = bookImage;
    }

    public Book() {
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

    public String getPublish() {
        return publish;
    }

    public void setPublish(String publish) {
        this.publish = publish;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getNowPrice() {
        return nowPrice;
    }

    public void setNowPrice(BigDecimal nowPrice) {
        this.nowPrice = nowPrice;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getdescribe() {
        return describe;
    }

    public void setdescribe(String describe) {
        this.describe = describe;
    }

    public String getBookNum() {
        return bookNum;
    }

    public void setBookNum(String bookNum) {
        this.bookNum = bookNum;
    }

    public BookType getBooktype() {
        return booktype;
    }

    public void setBooktype(BookType booktype) {
        this.booktype = booktype;
    }

    public BookCategory getBookCategory() {
        return bookCategory;
    }

    public void setBookCategory(BookCategory bookCategory) {
        this.bookCategory = bookCategory;
    }

    public BookImage getBookImage() {
        return bookImage;
    }

    public void setBookImage(BookImage bookImage) {
        this.bookImage = bookImage;
    }
}
