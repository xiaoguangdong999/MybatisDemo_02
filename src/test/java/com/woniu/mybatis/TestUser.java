package com.woniu.mybatis;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import com.woniu.mybatis.util.SqlSessionFactoryUtil;

public class TestUser {
	SqlSessionFactory ssf = SqlSessionFactoryUtil.getSqlSessionFactory();
	
	@Test
	public void testSelectById(){
		SqlSession sqlSession = ssf.openSession();
		//���UserMapper�ӿڵ�������
		//UserMapper um = sqlSession.getMapper(UserMapper.class);
		
		sqlSession.close();
		
	}
	
	
}
