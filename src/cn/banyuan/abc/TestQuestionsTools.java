package cn.banyuan.abc;

import java.util.*;

/**
 * @author 陈浩
 * @date Created on 2019/11/10
 */
public class TestQuestionsTools {
    static Set<TestQuestions> set = new HashSet<>();

    static {
        set.add(new TestQuestions(1, "1.Java语言中提供了一个▁线程，自动回收动态分配的内存。 \n" +
                "A．异步\n" +
                "B．消费者\n" +
                "C．守护\n" +
                "D．垃圾收集", "D"));
        set.add(new TestQuestions(2, " 下列不可作为java语言修饰符的是:\n" +
                "A) a1 \n" +
                "B) $1 \n" +
                "C) _1  \n" +
                "D) 11\n", "D"));
        set.add(new TestQuestions(3, "2. 整型数据类型中，需要内存空间最少的是:\n" +
                "A) short\n" +
                "B) long\n" +
                "C) int\n" +
                "D) byte\n", "D"));
        set.add(new TestQuestions(4, "double数据类型的默认值是多少？\n" +
                "A) 0 \n" +
                "B) 0.0\n" +
                "C) null \n" +
                "D) 0.0d", "D"));
        set.add(new TestQuestions(5, " 对于变量int val = 0b11010，System.out.println(\"\" + val)输出是多少?（注：在Java7之后，可以用0b开头标识二进制数）\n" +
                "A) 26 \n" +
                "B) 64\n" +
                "C) 28 \n" +
                "D) 32", "A"));
        set.add(new TestQuestions(6, " String is a/an ___ .\n" +
                "A) Class   \n" +
                "B) Variable\n" +
                "C) Array   \n" +
                "D) Data type", "A"));
        set.add(new TestQuestions(7, "指出正确的表达式。\n" +
                "A) byte=128; \n" +
                "B) Boolean=null;\n" +
                "C) long l=0xfffL; \n" +
                "D) double=0.9239d;", "D"));
        set.add(new TestQuestions(8, " System类在哪个包中?\n" +
                "A) java.util                 \n" +
                "B) java.lang\n" +
                "C) java.awt                 \n" +
                "D) java.io\n", "B"));
        set.add(new TestQuestions(9, "下面哪种注释方法能够支持javadoc命令:\n" +
                "A) /**...**/  \n" +
                "B) /*...*/\n" +
                "C) //  \n" +
                "D) /**...*/\n", "D"));
        set.add(new TestQuestions(10, "若a = 8，则表达式 a >>> 2 的值是多少？\n" +
                "A)1 \n" +
                "B)4\n" +
                "C)3   \n" +
                "D)2", "B"));

    }


    /**
     * 增加试题
     */
    public static void add() {
        Scanner in = new Scanner(System.in);

        System.out.println("请输入添加的编号：");
        int input1 = in.nextInt();

        System.out.println("请输入添加的题目：");
        String input2 = in.next();

        System.out.println("请输入添加的答案：");
        String input3 = in.next();
        set.add(new TestQuestions(input1, input2, input3));

    }

    /**
     * 删除试题
     */
    public static void delete(int num) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (((TestQuestions) it.next()).getNum() == num) {
                it.remove();
            }
        }
    }

    /**
     * 修改试题
     */
    public static void update(int num) {
        Object[] obj = set.toArray();
        for (int i = 0; i < obj.length; i++) {
            TestQuestions test = (TestQuestions) obj[i];
            if (num == test.getNum()) {
                Scanner in = new Scanner(System.in);

                System.out.println("请输入更改后的题目：");
                String input1 = in.next();

                System.out.println("请输入更改后的答案：");
                String input2 = in.next();

                test.setQuestion(input1);
                test.setAnswer(input2);
            }
        }


    }

    /**
     * 查询试题
     */
    public static void search(int num) {
        Object[] obj = set.toArray();
        for (int i = 0; i < obj.length; i++) {
            TestQuestions test = (TestQuestions) obj[i];
            if (num == test.getNum()) {
                System.out.println(test.toString());
            }
        }

    }

}
