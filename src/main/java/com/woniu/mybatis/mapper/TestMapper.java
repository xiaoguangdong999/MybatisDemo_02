package com.woniu.mybatis.mapper;

import com.woniu.mybatis.pojo.Test;

/**
 * @author z.chenbin
 * @date : 2019/8/31
 * @describe:
 */
public interface TestMapper {

    Test findTestById(int id);
}
