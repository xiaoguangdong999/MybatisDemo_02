package com.woniu.mybatis.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * @author z.chenbin
 * @date : 2019/8/31
 * @describe:
 */
public class User implements Serializable {

    private Long id;
    private String username;
    private String password;
    private String address;
    private int age;
    private String sex;
    private Long phone;
    private Date birthday;
    private String idcard;
    private String email;
    private int degree;
    private int status;
    private int attentionCount;
    private String headerImage;
    private int userLevel;

    public User(Long id, String username, String password, String address, int age, String sex, Long phone, Date birthday, String idcard, String email, int degree, int status, int attentionCount, String headerImage, int userLevel) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.address = address;
        this.age = age;
        this.sex = sex;
        this.phone = phone;
        this.birthday = birthday;
        this.idcard = idcard;
        this.email = email;
        this.degree = degree;
        this.status = status;
        this.attentionCount = attentionCount;
        this.headerImage = headerImage;
        this.userLevel = userLevel;
    }

    public User() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getDegree() {
        return degree;
    }

    public void setDegree(int degree) {
        this.degree = degree;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getAttentionCount() {
        return attentionCount;
    }

    public void setAttentionCount(int attentionCount) {
        this.attentionCount = attentionCount;
    }

    public String getheaderImage() {
        return headerImage;
    }

    public void setheaderImage(String headerImage) {
        this.headerImage = headerImage;
    }

    public int getuserLevel() {
        return userLevel;
    }

    public void setuserLevel(int userLevel) {
        this.userLevel = userLevel;
    }
}
