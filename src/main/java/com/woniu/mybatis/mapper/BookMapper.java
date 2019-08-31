package com.woniu.mybatis.mapper;

import com.woniu.mybatis.pojo.Book;
import com.woniu.mybatis.pojo.BookCategory;

import java.util.List;

public interface BookMapper {

	/**
	 * find book by book category
	 * @param bookCategory
	 * @return
	 */
	List<Book> findBookByCategory(BookCategory bookCategory);
	
}
