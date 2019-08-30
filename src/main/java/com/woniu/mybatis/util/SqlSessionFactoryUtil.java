package com.woniu.mybatis.util;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlSessionFactoryUtil {
	
	private static SqlSessionFactory ssf  ;
	
	//���������ļ�
	static {
		// �����ļ�
		String resource = "SqlMapConfig.xml";
		try {
			InputStream inputStream = Resources.getResourceAsStream(resource);
			// ʹ��SqlSessionFactoryBuilder��xml�����ļ��д���SqlSessionFactory
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
