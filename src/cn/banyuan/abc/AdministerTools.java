package cn.banyuan.abc;

import java.util.*;

/**
 * @author 陈浩
 * @date Created on 2019/11/10
 */
public class AdministerTools {

    /**
     * 对学生的增、删、改、查操作
     */
    public static void menu() {
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
                add();
                print();
            }
            if (input.equals("B2")) {
                System.out.println("请输入要查找的学生编号：");
                int a1 = in.nextInt();
                search(a1);
            }
            if (input.equals("B3")) {
                System.out.println("请输入要修改的学生编号：");
                int a2 = in.nextInt();
                update(a2);
                print();
            }
            if (input.equals("B4")) {
                System.out.println("请输入要删除的学生编号：");
                int a3 = in.nextInt();
                delete(a3);
                print();
            }
            if (input.equals("B5")) {
                TestQuestionsTools.add();

            }
            if (input.equals("B6")) {
                System.out.println("请输入要修改的试题编号：");
                int a2 = in.nextInt();
                TestQuestionsTools.update(a2);

            }
            if (input.equals("B7")) {

                System.out.println("请输入要删除的试题编号：");
                int a3 = in.nextInt();
                TestQuestionsTools.delete(a3);
            }
            if (input.equals("B8")) {
                System.out.println("请输入要查找的试题编号：");
                int a1 = in.nextInt();
                TestQuestionsTools.search(a1);


            }
            if (input.equals("B9")) {

            }


            if (input.equals("Q")) {
                break;
            }
        }
    }

    static Set<Student> set = new TreeSet<Student>();

    static {
        set.add(new Student(001, "赵一", "123451"));
        set.add(new Student(002, "钱二", "123452"));
        set.add(new Student(003, "孙三", "123453"));
        set.add(new Student(004, "李四", "123454"));
        set.add(new Student(005, "周五", "123455"));
        set.add(new Student(006, "吴六", "123456"));
    }


    /**
     * 增加考试学员
     */
    public static void add() {
        Scanner in = new Scanner(System.in);

        System.out.println("请输入添加的编号：");
        int input1 = in.nextInt();

        System.out.println("请输入添加的姓名：");
        String input2 = in.next();

        System.out.println("请输入添加的密码：");
        String input3 = in.next();
        set.add(new Student(input1, input2, input3));

    }

    /**
     * 删除考试学员
     */
    public static void delete(int stuNum) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (((Student) it.next()).getStuNum() == stuNum) {
                it.remove();
            }
        }
    }

    /**
     * 修改考试学员
     */
    public static void update(int stuNum) {
        Object[] obj = set.toArray();
        for (int i = 0; i < obj.length; i++) {
            Student stu = (Student) obj[i];
            if (stuNum == stu.getStuNum()) {
                Scanner in = new Scanner(System.in);

                System.out.println("请输入更改后的姓名：");
                String input1 = in.next();

                System.out.println("请输入更改后的密码：");
                String input2 = in.next();

                stu.setStuName(input1);
                stu.setStuPassword(input2);
            }
        }


    }

    /**
     * 查询考试成员
     */
    public static void search(int stuNum) {
        Object[] obj = set.toArray();
        for (int i = 0; i < obj.length; i++) {
            Student stu = (Student) obj[i];
            if (stuNum == stu.getStuNum()) {
                System.out.println(stu.toString());
            }
        }

    }

    /**
     * 打印所有学生的信息
     */
    public static void print() {
        for (Student s : set) {
            System.out.println(s);
        }

    }

}
