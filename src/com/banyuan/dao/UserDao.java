package com.banyuan.dao;

import com.banyuan.pojo.Questions;
import com.banyuan.pojo.Student;

/**
 * @author 陈浩
 * @date Created on 2019/11/17
 */

public interface UserDao {
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
    public boolean updateStu(Student student, Integer stuNum);

    /**
     * 管理员通过编号查询学生
     */
    String selStu(Integer stuNum);

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
    public boolean updateQus(Questions question, Integer qusNum);

    /**
     * 管理员通过编号查询试题
     */
    String selQus(Integer qusNum);

    /**
     * 学生登陆
     *
     * @return
     */
    boolean stuLoad(String stuName, String stuPassword);

    /**
     * 管理员登陆
     */
    boolean admLoad(String admName, String admPassword);

    /**
     * 根据学号查询成绩
     */
    String selScore(int stuNum);

    /**
     * 对学生成绩进行添加，修改
     */

    public boolean updateStuScore(Student student);

    /**
     * 修改学生密码
     */
    public boolean updateStuPassword(Student student);
    /**
     * 按时间降序对学生 成绩进行排序
     */

    String sort(Integer i);
}
