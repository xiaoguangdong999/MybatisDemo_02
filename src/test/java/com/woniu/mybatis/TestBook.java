package com.woniu.mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import com.woniu.mybatis.domian.Book;
import com.woniu.mybatis.domian.Category;
import com.woniu.mybatis.mapper.BookMapper;
import com.woniu.mybatis.pojo.BookInfo;
import com.woniu.mybatis.util.SqlSessionFactoryUtil;

public class TestBook {
	SqlSessionFactory ssf = SqlSessionFactoryUtil.getSqlSessionFactory();
	
	@Test
	public void testSelectById(){
		SqlSession sqlSession = ssf.openSession();
		
		BookMapper bm = sqlSession.getMapper(BookMapper.class);
		
		Book book = bm.selectBookById(1);
		
		System.out.println(book);
		sqlSession.close();
		
	}
	
	@Test
	public void testSelectByOneToMany(){
		SqlSession sqlSession = ssf.openSession();
		
		BookMapper bm = sqlSession.getMapper(BookMapper.class);
		
		Category c = bm.selectCategoryByid(3);
		
		System.out.println(c);
		sqlSession.close();
		
	}
	
	@Test
	public void testSelectBookInfo(){
		SqlSession sqlSession = ssf.openSession();
		
		BookMapper bm = sqlSession.getMapper(BookMapper.class);
		
		List<BookInfo> infos = bm.selectBookInfo();
		
		System.out.println(infos);
		sqlSession.close();
		
	}
	
	
}
