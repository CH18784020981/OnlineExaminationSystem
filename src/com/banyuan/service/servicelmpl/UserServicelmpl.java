//package com.banyuan.service.servicelmpl;
//
//import com.banyuan.dao.UserDao;
//import com.banyuan.dao.daolmpl.UserDaolmpl;
//import com.banyuan.pojo.Questions;
//import com.banyuan.pojo.Student;
//import com.banyuan.service.UserService;
//
///**
// * @author 陈浩
// * @date Created on 2019/11/17
// */
//public class UserServicelmpl implements UserService {
//    UserDao ud = new UserDaolmpl();
//
//    @Override
//    /**
//     * 增加学生
//     */
//    public boolean addStu(Student student) {
//        if (ud.addStu(student)) {
//            return true;
//        }
//        return false;
//    }
//
//    /**
//     * 删除学生
//     *
//     * @param stuNum
//     * @return
//     */
//    @Override
//    public boolean delStu(Integer stuNum) {
//        if (ud.delStu(stuNum)) {
//            return true;
//        }
//        return false;
//    }
//
//    /**
//     * 修改学生
//     *
//     * @param stuNum
//     * @return
//     */
//    @Override
//    public boolean updateStu(Integer stuNum) {
//        if (ud.delStu(stuNum)) {
//            return true;
//        }
//        return false;
//    }
//
//    /**
//     * 查询学生
//     *
//     * @param stuNum
//     */
//    @Override
//    public void selStu(Integer stuNum) {
//        ud.selStu(stuNum);
//    }
//
//    /**
//     * 增加试题
//     *
//     * @param question
//     * @return
//     */
//    @Override
//    public boolean addQus(Questions question) {
//        if (ud.addQus(question)) {
//            return true;
//        }
//        return false;
//    }
//
//    /**
//     * 删除试题
//     *
//     * @param qusNum
//     * @return
//     */
//    @Override
//    public boolean delQus(Integer qusNum) {
//        if (ud.delQus(qusNum)) {
//            return true;
//        }
//        return false;
//    }
//
//    /**
//     * 更新试题
//     *
//     * @param qusNum
//     * @return
//     */
//    @Override
//    public boolean updateQus(Integer qusNum) {
//        if (ud.delQus(qusNum)) {
//            return true;
//        }
//        return false;
//    }
//
//    /**
//     * 查找试题
//     */
//
//    @Override
//    public void selQus(Integer qusNum) {
//        ud.selQus(qusNum);
//
//    }
//
//    /**
//     * 学生登陆
//     *
//     * @param stuName
//     * @param stuPassword
//     * @return
//     */
//   // @Override
////    public String[] stuLoad(String stuName, String stuPassword) {
////        if (ud.stuLoad(stuName, stuPassword)) {
////
////        }
////        return false;
////    }
//
//    /**
//     * 管理员登陆
//     *
//     * @param admName
//     * @param admPassword
//     * @return
//     */
////    @Override
////    public boolean admLoad(String admName, String admPassword) {
////        if (ud.admLoad(admName, admPassword)) {
////            return true;
////        }
////        return false;
////    }
//}
