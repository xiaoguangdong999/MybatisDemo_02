package com.woniu.mybatis.pojo;

/**
 * @author z.chenbin
 * @date : 2019/8/31
 * @describe:
 */
public class BookImage {

    private int id;

    private String path;

    private int defaultCode;

    public BookImage(int id, String path, int defaultCode) {
        this.id = id;
        this.path = path;
        this.defaultCode = defaultCode;
    }

    public BookImage() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public int getDefaultCode() {
        return defaultCode;
    }

    public void setDefaultCode(int defaultCode) {
        this.defaultCode = defaultCode;
    }
}
