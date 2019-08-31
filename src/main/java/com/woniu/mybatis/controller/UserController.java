package com.woniu.mybatis.controller;

import com.woniu.mybatis.domian.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author z.chenbin
 * @date : 2019/8/31
 * @describe: 用户相关
 */
@RestController
public class UserController {

    /**
     * 添加用户
     * @param user
     * @return
     */
    @RequestMapping("/addUser")
    public Integer addUser(@RequestBody User user) {
        return 0;
    }



}
