package com.woniu.mybatis.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.woniu.mybatis.domian.Book;
import com.woniu.mybatis.domian.Category;
import com.woniu.mybatis.domian.User;
import com.woniu.mybatis.pojo.BookInfo;
import com.woniu.mybatis.pojo.QueryVo;

public interface BookMapper {
	
	Book selectBookById(int bid);
	
	Category selectCategoryByid(int cid);
	
	
	//��ѯ ͼ������  ��ͼ������ ���۸�   type����    cate���� 
	List<BookInfo> selectBookInfo();
	
}
