package com.woniu.mybatis.service;

import com.woniu.mybatis.domian.User;
import com.woniu.mybatis.mapper.UserMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author z.chenbin
 * @date : 2019/8/31
 * @describe:
 */
@Service
public class UserService {

    private static  final Logger log = LoggerFactory.getLogger(UserService.class);

    @Autowired
    private UserMapper userMapper;

    /**
     * add user service
     * @param user
     * @return
     */
    public Integer addUser(User user) {
        try {
            return userMapper.addUser(user);
        }catch (Exception e) {
            e.printStackTrace();
            log.error("add user failed!" , e);
            return 0;
        }
    }

    /**
     * find user service
     * @param username
     * @param password
     * @return
     */
    public User findUser(String username,String password) {
        try {
            return userMapper.findUser(username,password);
        }catch (Exception e) {
            e.printStackTrace();
            log.error("find user failed!", e);
            return null;
        }
    }
}
