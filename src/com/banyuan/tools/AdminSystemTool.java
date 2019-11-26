package com.banyuan.tools;


import java.util.Scanner;

/**
 * @author 陈浩
 * @date Created on 2019/11/17
 */
public class AdminSystemTool {
    public static String menu() {
        Scanner in = new Scanner(System.in);
        while (1 == 1) {
            System.out.println("欢迎来到管理员系统," +
                    "\n请选择你要进行的操作\n" +
                    "B1.添加学生,注意学生编号与已有的不能相同\n" +
                    "B2.根据编号查找一个学生\n" +
                    "B3.根据编号更新学生基本信息\n" +
                    "B4.根据编号删除学生\n" +
                    "B5增加考题(选做)\n" +
                    "B6修改考题(选做)\n" +
                    "B7删除考题(选做)\n" +
                    "B8查询考题 按照id 或者 查询所有的(选做)\n" +
                    "B9批量导入考题(选做)\n" +
                    "Q.退出系统\n");
            String input = in.next();
            if (input.equals("B1")) {

            }
            if (input.equals("B2")) {
                System.out.println("请输入要查找的学生编号：");
                int a1 = in.nextInt();

            }
            if (input.equals("B3")) {
                System.out.println("请输入要修改的学生编号：");
                int a2 = in.nextInt();

            }
            if (input.equals("B4")) {
                System.out.println("请输入要删除的学生编号：");
                int a3 = in.nextInt();

            }
            if (input.equals("B5")) {


            }
            if (input.equals("B6")) {
                System.out.println("请输入要修改的试题编号：");
                int a2 = in.nextInt();


            }
            if (input.equals("B7")) {

                System.out.println("请输入要删除的试题编号：");
                int a3 = in.nextInt();

            }
            if (input.equals("B8")) {
                System.out.println("请输入要查找的试题编号：");
                int a1 = in.nextInt();


            }
            if (input.equals("B9")) {

            }


            if (input.equals("Q")) {
                break;
            }
        }
        return menu();
    }
}
