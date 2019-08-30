package com.woniu.mybatis;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import com.woniu.mybatis.domian.Book;
import com.woniu.mybatis.mapper.BookMapper;
import com.woniu.mybatis.util.SqlSessionFactoryUtil;

public class TestCache {
	SqlSessionFactory ssf = SqlSessionFactoryUtil.getSqlSessionFactory();
	
	@Test
	public void testSelectById(){
		SqlSession sqlSession = ssf.openSession();
		BookMapper bm = sqlSession.getMapper(BookMapper.class);
		Book b = bm.selectBookById(1);
		System.out.println(b);
		
		sqlSession.clearCache();//Çå¿Õ»º´æ
		System.out.println("=====================================");
		Book b1 = bm.selectBookById(1);
		System.out.println(b1);
		sqlSession.close();
	}
	
	@Test
	public void testSecondCache(){
		SqlSession sqlSession = ssf.openSession();
		BookMapper bm = sqlSession.getMapper(BookMapper.class);
		Book b = bm.selectBookById(1);
		System.out.println(b);
		sqlSession.close();
		System.out.println("=====================================");
		SqlSession sqlSession1 = ssf.openSession();
		BookMapper bm1 = sqlSession1.getMapper(BookMapper.class);
		Book b1 = bm1.selectBookById(1);
		System.out.println(b1);
		sqlSession1.close();
	}
	
	
}
