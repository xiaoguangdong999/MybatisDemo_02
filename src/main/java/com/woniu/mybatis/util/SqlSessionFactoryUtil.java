package com.woniu.mybatis.util;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlSessionFactoryUtil {
	
	private static SqlSessionFactory ssf  ;
	
	//加载配置文件
	static {
		// 配置文件
		String resource = "SqlMapConfig.xml";
		try {
			InputStream inputStream = Resources.getResourceAsStream(resource);
			// 使用SqlSessionFactoryBuilder从xml配置文件中创建SqlSessionFactory
			ssf = new SqlSessionFactoryBuilder()
					.build(inputStream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static SqlSessionFactory getSqlSessionFactory(){
		
		return ssf ;
	}
	
	
}
