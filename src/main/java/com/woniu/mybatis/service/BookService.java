package com.woniu.mybatis.service;

import com.woniu.mybatis.mapper.BookMapper;
import com.woniu.mybatis.pojo.Book;
import com.woniu.mybatis.pojo.BookCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author z.chenbin
 * @date : 2019/8/31
 * @describe:
 */
@Service
public class BookService {

    @Autowired
    private BookMapper bookMapper;

    /**
     * find book by category service
     * @param bookCategory
     * @return
     */
    public List<Book> findBookByCategory(BookCategory bookCategory) {
        try{
            return bookMapper.findBookByCategory(bookCategory);
        }catch (Exception e) {
            return new ArrayList<Book>();
        }
    }

}
