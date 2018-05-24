package com.winterchen.model;

/**
 * Created by jinyugai on 2018/5/24.
 * 创建实体类UserDomain
 */
public class UserDomain {
    private Integer userId;

    private  String userName;
    private  String password;
    private  String phone;

    public UserDomain(Integer userId, String userName, String password, String phone) {
        this.userId = userId;
        this.userName = userName;
        this.password = password;
        this.phone = phone;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return "userName: "+this.userName +",userPhone: "+this.phone;
    }
}
