package com.woniu.mybatis.pojo;

import com.woniu.mybatis.domian.BookType;
import com.woniu.mybatis.domian.Category;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author z.chenbin
 * @date : 2019/8/31
 * @describe:
 */
public class Book {
    private int bookid ;
    private String bookName ;
    private String publish ;
    private String author ;
    private Date publishDate ;
    private BigDecimal price ;
    private BigDecimal nowPrice ;
    private String status ; //状态 1 上架   0  下架
    private String decription ;
    private String bookNum ; //编号
    private BookType booktype ;  // 1 ,推荐  2 特价  3 精选   0  普通
    private Category category ;
    private String bookImg ;  //封面
}
