package com.woniu.mybatis.pojo;

/**
 * @author z.chenbin
 * @date : 2019/8/31
 * @describe:
 */
public class BookType {

    private int id;

    private String typeName;

    private String describe;

    public BookType(int id, String typeName, String describe) {
        this.id = id;
        this.typeName = typeName;
        this.describe = describe;
    }

    public BookType() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }
}
