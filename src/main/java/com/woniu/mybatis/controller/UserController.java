package com.woniu.mybatis.controller;

import com.woniu.mybatis.domian.User;
import com.woniu.mybatis.entity.Result;
import com.woniu.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * @author z.chenbin
 * @date : 2019/8/31
 * @describe: 用户相关
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * add user  ----------register
     * @param user
     * @return
     */
    @RequestMapping("/addUser")
    public Result<Integer> addUser(@RequestBody User user) {
        Integer id = userService.addUser(user);
        if (user == null ) {
            return new Result<Integer>(false,"user can not be null");
        }
        if(user != null && id == 0){
            return new Result<Integer>(false,"add user failed");
        }
        return new Result<Integer>(true,id);
    }

    /**
     * find user controller ----login
     * @param username
     * @param password
     * @return
     */
    public Result<User> findUser(@RequestBody String username, @RequestBody String password , HttpSession session ){
        User user = userService.findUser(username,password);
        if (user == null ) {
            return new Result<User>(false,"user not found");
        }
        session.setAttribute("user",user);
        return new Result<User>(true,user);
    }

    /**
     * find user info in session -----personal center
     * @param session
     * @return
     */
    @RequestMapping("/findUserInfo")
    public User findUserInfo(HttpSession session){
        return (User) session.getAttribute("user");
    }

}
