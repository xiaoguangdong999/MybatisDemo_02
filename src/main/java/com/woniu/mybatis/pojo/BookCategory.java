package com.woniu.mybatis.pojo;

/**
 * @author z.chenbin
 * @date : 2019/8/31
 * @describe:
 */
public class BookCategory {

    private int id;

    private String name;

    private String describe;

    public BookCategory(int id, String name, String describe) {
        this.id = id;
        this.name = name;
        this.describe = describe;
    }

    public BookCategory() {
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

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }
}
