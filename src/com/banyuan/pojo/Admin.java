package com.banyuan.pojo;

/**
 * @author 陈浩
 * @date Created on 2019/11/17
 */
public class Admin {
    private Integer admNum;
    private String  admName;
    private String  admPassword;

    public Admin() {
    }

    public Admin(String admName, String admPassword) {
        this.admName = admName;
        this.admPassword = admPassword;
    }

    public Integer getAdmNum() {
        return admNum;
    }

    public void setAdmNum(Integer admNum) {
        this.admNum = admNum;
    }

    public String getAdmName() {
        return admName;
    }

    public void setAdmName(String admName) {
        this.admName = admName;
    }

    public String getAdmPassword() {
        return admPassword;
    }

    public void setAdmPassword(String admPassword) {
        this.admPassword = admPassword;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "admNum=" + admNum +
                ", admName='" + admName + '\'' +
                '}';
    }
}
