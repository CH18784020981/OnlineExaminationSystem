package com.banyuan.service;

import com.banyuan.pojo.Questions;
import com.banyuan.pojo.Student;

/**
 * @author 陈浩
 * @date Created on 2019/11/17
 */
public interface UserService {
    /**
     * 管理员可以添加学生
     */
    boolean addStu(Student student);
    /**
     * 管理员可以根据编号删除学生
     */
    boolean delStu(Integer stuNum);
    /**
     * 管理员通过编号修改学生
     */
    boolean updateStu(Integer stuNum);

    /**
     * 管理员通过编号查询学生
     */
    void selStu(Integer stuNum);

    /**
     * 管理员可以添加试题
     */
    boolean addQus(Questions question);
    /**
     * 管理员可以根据编号删除试题
     */
    boolean delQus(Integer qusNum);
    /**
     * 管理员通过编号修改学生
     */
    boolean updateQus(Integer qusNum);

    /**
     * 管理员通过编号查询试题
     */
    void selQus(Integer qusNum);
    /**
     * 学生登陆
     * @return
     */
    boolean stuLoad(String stuName,String stuPassword);
    /**
     * 管理员登陆
     */
    boolean admLoad(String admName,String admPassword);

}
