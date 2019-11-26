package com.banyuan.theClient;


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.*;

/**
 * @author 陈浩
 * @date Created on 2019/11/17
 */
public class Client {
    public static Socket socket = null;
    public static DataOutputStream dos = null;
    public static DataInputStream dis = null;


    static {
        try {
            socket = new Socket("192.168.11.7", 1111);
            dos = new DataOutputStream(socket.getOutputStream());
            // dos.flush();
            dis = new DataInputStream(socket.getInputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    /**
     * 登陆方法
     */
    public static void login() throws IOException {
        dos.writeUTF("12,34");


        String[] str = dis.readUTF().split(",");
        for (String s : str) {
            System.out.println(s);
        }
    }

    public static List list = new ArrayList();
    public static List list2 = new ArrayList();

    /**
     * 将试题从服务器导入到客户端的方法
     */
    public static void getQuestions() throws IOException {
        //设置一个服务器识别标签 1
        dos.writeUTF("1,");
        String[] str = dis.readUTF().split("·");
        for (String s : str) {
            list.add(s);
        }
        Collections.shuffle(list);
    }

    /**
     * 排序
     * @throws IOException
     */
    public static void sort() throws IOException {
        //设置一个服务器识别标签 13
        dos.writeUTF("13,");
        String[] str = dis.readUTF().split("·");
        for (String s : str) {
            list2.add(s);
        }
    }
}
