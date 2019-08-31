package com.woniu.mybatis.controller;

import com.woniu.mybatis.entity.Result;
import com.woniu.mybatis.pojo.Book;
import com.woniu.mybatis.pojo.BookCategory;
import com.woniu.mybatis.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author z.chenbin
 * @date : 2019/8/31
 * @describe:
 */
@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    /**
     * find book by category id  controller
     * @param id
     * @return
     */
    @RequestMapping("/findBookByCategory")
    public Result<List<Book>> findBookByCategory(int id) {
        //find book category by category id
        BookCategory bookCategory = new BookCategory();

        List<Book> bookByCategory = bookService.findBookByCategory(bookCategory);
        if (bookByCategory.size() == 0) {
            return new Result<List<Book>>(false,"this category is empty");
        }
        return new Result<List<Book>>(true,bookByCategory);
    }

}
