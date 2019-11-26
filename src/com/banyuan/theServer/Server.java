package com.banyuan.theServer;

import com.banyuan.pojo.Questions;
import com.banyuan.pojo.Student;
import com.banyuan.dao.daolmpl.UserDaolmpl;
import com.banyuan.tools.AdminSystemTool;
import com.sun.xml.internal.ws.api.ha.StickyFeature;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author 陈浩
 * @date Created on 2019/11/17
 */
public class Server {
    static ServerSocket se;
    static String read[];

    static {
        try {
            se = new ServerSocket(1111);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static String name = null;
    static String password = null;
    static Socket so = null;
    static DataInputStream dis = null;
    static DataOutputStream dos = null;

    public static void main(String[] args) throws IOException, IOException {
        UserDaolmpl ud = new UserDaolmpl();
        so = se.accept();
        while (true) {

            dis = new DataInputStream(so.getInputStream());
            read = dis.readUTF().split(",");
            if (read[0].equals("L")) {
                login();
            }
            if (read[0].equals("1")) {
                sendQuestion();
            }
            if (read[0].equals("2")) {
                sendSelQus();
            }
            if (read[0].equals("3")) {
                sendSelStu();
            }
            if (read[0].equals("4")) {
                sendStuScore();
            }
            if (read[0].equals("5")) {
                sendDelStu();
            }
            if (read[0].equals("6")) {
                sendDelQus();
            }
            if (read[0].equals("7")) {
                addStu();
            }
            if (read[0].equals("8")) {
                addQus();
            }
            if (read[0].equals("9")) {
                updateStu();
            }
            if (read[0].equals("10")) {
                updateQus();
            }
            if (read[0].equals("11")) {
                updateStuScore();
            }
            if (read[0].equals("12")) {
                updatePassword();
            }
            if (read[0].equals("13")) {
                sort();
            }
        }
    }

    /**
     * 登陆
     */

    public static void login() throws IOException {
        UserDaolmpl ud = new UserDaolmpl();
        boolean flag = ud.stuLoad(read[1], read[2]);
        boolean flag2 = ud.admLoad(read[1], read[2]);
        name = read[1];
        password = read[2];
        dos = new DataOutputStream(so.getOutputStream());

        dos.writeUTF("" + flag + "," + flag2);
        dos.flush();

    }

    /**
     * 将题目批量从服务器发到客户端
     *
     * @throws IOException
     */
    public static void sendQuestion() throws IOException {
        UserDaolmpl ud = new UserDaolmpl();
        String qus = "";
        for (int i = 1; i <= 23; i++) {
            qus = qus + ud.selQus(i) + "·";
        }
        dos = new DataOutputStream(so.getOutputStream());
        dos.writeUTF(qus);
    }

    /**
     * 将查询到的试题信息发送到客户端
     */
    public static void sendSelQus() throws IOException {
        UserDaolmpl ud = new UserDaolmpl();
        String result = ud.selQus(new Integer(read[1]));
        dos = new DataOutputStream(so.getOutputStream());
        if (!result.equals(null)) {
            dos.writeUTF("" + result);
        } else {
            dos.writeUTF("你查询的题号不存在！！！");
        }
    }

    /**
     * 将查询到的学生信息发送到客户端
     */
    public static void sendSelStu() throws IOException {
        UserDaolmpl ud = new UserDaolmpl();
        String result = ud.selStu(new Integer(read[1]));
        dos = new DataOutputStream(so.getOutputStream());
        if (result != null) {
            dos.writeUTF("" + result);
        } else {
            dos.writeUTF("你查询的学号不存在！！！");
        }
    }


    /**
     * 将查询到的学生成绩发送到客户端
     */
    public static void sendStuScore() throws IOException {
        UserDaolmpl ud = new UserDaolmpl();
        String result = ud.selScore(new Integer(read[1]));
        dos = new DataOutputStream(so.getOutputStream());
        if (result != null) {
            dos.writeUTF("" + result);
        } else {
            dos.writeUTF("你查询的学号不存在！！！");
        }
    }

    /**
     * 将删除学生成功失败的信息发送到客户端
     */
    public static void sendDelStu() throws IOException {
        UserDaolmpl ud = new UserDaolmpl();
        boolean result = ud.delStu(new Integer(read[1]));
        dos = new DataOutputStream(so.getOutputStream());
        if (result == true) {
            dos.writeUTF("删除成功！！！");
        } else {
            dos.writeUTF("没有学生该编号，删除失败！！！");
        }
    }

    /**
     * 将删除试题成功失败的信息发送到客户端
     */
    public static void sendDelQus() throws IOException {
        UserDaolmpl ud = new UserDaolmpl();
        boolean result = ud.delQus(new Integer(read[1]));
        dos = new DataOutputStream(so.getOutputStream());
        if (result == true) {
            dos.writeUTF("删除成功！！！");
        } else {
            dos.writeUTF("没有该试题编号，删除失败！！！");
        }

    }

    /**
     * 添加学生成功或失败的信息发送到客户端
     */
    public static void addStu() throws IOException {
        UserDaolmpl ud = new UserDaolmpl();
        Student student = new Student();
        student.setStuName(read[1]);
        student.setStuPassword(read[2]);
        student.setStuScore(new Integer(read[3]));
        boolean result = ud.addStu(student);
        dos = new DataOutputStream(so.getOutputStream());
        if (result == true) {
            dos.writeUTF("添加学生成功！！！");
        } else {
            dos.writeUTF("添加学生失败！！！");
        }
    }

    /**
     * 添加试题成功或失败的信息发送到客户端
     */
    public static void addQus() throws IOException {
        UserDaolmpl ud = new UserDaolmpl();
        Questions question = new Questions();
        question.setQuestion(read[1]);
        question.setChooseA(read[2]);
        question.setChooseB(read[3]);
        question.setChooseC(read[4]);
        question.setChooseD(read[5]);
        question.setAnswer(read[6]);
        boolean result = ud.addQus(question);
        dos = new DataOutputStream(so.getOutputStream());
        if (result == true) {
            dos.writeUTF("添加试题成功！！！");
        } else {
            dos.writeUTF("添加试题失败！！！");
        }
    }

    /**
     * 修改学生成功或失败的信息发送到客户端
     */
    public static void updateStu() throws IOException {
        UserDaolmpl ud = new UserDaolmpl();
        Student student = new Student();
        student.setStuName(read[2]);
        student.setStuPassword(read[3]);
        student.setStuScore(new Integer(read[4]));
        boolean result = ud.updateStu(student, new Integer(read[1]));
        dos = new DataOutputStream(so.getOutputStream());
        if (result == true) {
            dos.writeUTF("修改学生成功！！！");
        } else {
            dos.writeUTF("修改学生失败！！！");
        }

    }

    /**
     * 修改学生成功或失败的信息发送到客户端
     */
    public static void updateQus() throws IOException {
        UserDaolmpl ud = new UserDaolmpl();
        Questions question = new Questions();
        question.setQuestion(read[2]);
        question.setChooseA(read[3]);
        question.setChooseB(read[4]);
        question.setChooseC(read[5]);
        question.setChooseD(read[6]);
        question.setAnswer(read[7]);
        boolean result = ud.updateQus(question, new Integer(read[1]));
        dos = new DataOutputStream(so.getOutputStream());
        if (result == true) {
            dos.writeUTF("修改试题成功！！！");
        } else {
            dos.writeUTF("修改试题失败！！！");
        }
    }

    /**
     * 成绩导入数据库的声明
     */
    public static void updateStuScore() throws IOException {
        UserDaolmpl ud = new UserDaolmpl();
        Student student = new Student();
        student.setStuName(name);
        student.setStuPassword(password);

        student.setStuScore(new Integer(read[1]));
        student.setStuUseTime(new Integer(read[2]));
        boolean result = ud.updateStuScore(student);
        dos = new DataOutputStream(so.getOutputStream());
        if (result == true) {
            dos.writeUTF("成绩导入成功！！！");
        } else {
            dos.writeUTF("成绩导入失败！！！");
        }

    }

    /**
     * 修改密码
     */
    public static void updatePassword() throws IOException {
        UserDaolmpl ud = new UserDaolmpl();
        Student student = new Student();
        student.setStuName(name);
        student.setStuPassword(password);
        student.setStuPassword2(read[1]);
        boolean result = ud.updateStuPassword(student);
        dos = new DataOutputStream(so.getOutputStream());
        if (result == true) {
            dos.writeUTF("修改密码成功！！！");
        } else {
            dos.writeUTF("修改密码失败！！！");
        }

    }

    /**
     * 排序
     */
    public static void sort() throws IOException {
        UserDaolmpl ud = new UserDaolmpl();
        String qus = "";
        //for (int i = 1; i <= 23; i++) {
        qus = ud.sort(1);
        // }
        dos = new DataOutputStream(so.getOutputStream());
        dos.writeUTF(qus);
    }
}
