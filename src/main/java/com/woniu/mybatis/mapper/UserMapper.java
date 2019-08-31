package com.woniu.mybatis.mapper;

import com.woniu.mybatis.domian.User;

/**
 * @author z.chenbin
 * @date : 2019/8/31
 * @describe:
 */
public interface UserMapper {

    /**
     * add user
     * @param user
     * @return
     */
    Integer addUser(User user);

    /**
     * find user by username and password
     * @param username
     * @param password
     * @return
     */
    User findUser(String username , String password );

}
