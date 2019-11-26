package com.banyuan.pojo;

/**
 * @author 陈浩
 * @date Created on 2019/11/17
 */


public class Student {
    private Integer stuNum;
    private String stuName;
    private String stuPassword;
    private Integer stuScore;

    public Integer getStuUseTime() {
        return stuUseTime;
    }

    public void setStuUseTime(Integer stuUseTime) {
        this.stuUseTime = stuUseTime;
    }

    private Integer stuUseTime;

    public String getStuPassword2() {
        return stuPassword2;
    }

    public void setStuPassword2(String stuPassword2) {
        this.stuPassword2 = stuPassword2;
    }

    private String stuPassword2;

    public Student() {
    }

    public Student(String stuName, String stuPassword) {
        this.stuName = stuName;
        this.stuPassword = stuPassword;
    }

    public Integer getStuNum() {
        return stuNum;
    }

    public void setStuNum(Integer stuNum) {
        this.stuNum = stuNum;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getStuPassword() {
        return stuPassword;
    }

    public void setStuPassword(String stuPassword) {
        this.stuPassword = stuPassword;
    }

    public Integer getStuScore() {
        return stuScore;
    }

    public void setStuScore(Integer stuScore) {
        this.stuScore = stuScore;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuNum=" + stuNum +
                ", stuName='" + stuName + '\'' +
                ", stuScore=" + stuScore +
                '}';
    }
}
