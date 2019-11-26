package cn.banyuan.abc;

import java.util.Scanner;

/**
 * @author 陈浩
 * @date Created on 2019/11/10
 */
public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("请选择要登陆的系统\n" +
                    "A.学员系统\n" +
                    "B.管理员系统\n" +
                    "Q.退出\n");

            String input = in.next();
            if (input.equals("A")) {
                System.out.println("请登陆！！！\n请输入姓名：");
                String name = in.next();
                System.out.println("请输入密码：");
                String password = in.next();
                for (Student s : AdministerTools.set) {
                    if (name.equals(s.getStuName()) && password.equals(s.getStuPassword())) {
                        StudentTools.menu();
                    }
                }

            }
           // AdministerTools.menu();
            if (input.equals("B")) {
                AdministerTools.menu();
            }
            if (input.equals("Q")) {
                break;
            }

        }
    }
}
