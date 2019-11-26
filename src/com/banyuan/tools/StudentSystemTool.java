package com.banyuan.tools;

import java.util.Scanner;

/**
 * @author 陈浩
 * @date Created on 2019/11/17
 */
public class StudentSystemTool {
    public static void menu() {
        Scanner in = new Scanner(System.in);
        while (1 == 1) {
            System.out.println("欢迎来到学生系统," +
                    "\n请选择你要进行的操作\n" +
                    "A1.修改密码\n" +
                    "A2.直接随机生成一套试题答题 \n" +
                    "A3.查询所有考试成绩(按时间降序排列）\n" +
                    "A4.导出所有考试成绩\n" +
                    "Q.退出系统\n");
            String input = in.next();
            if (input.equals("A1")) {


            }
            if (input.equals("A2")) {


            }
            if (input.equals("A3")) {


            }
            if (input.equals("A4")) {


            }


            if (input.equals("Q")) {
                break;
            }
        }

    }
}
