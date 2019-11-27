package com.banyuan.test;


import com.banyuan.dao.daolmpl.UserDaolmpl;
import com.banyuan.gui.Questions;
import com.banyuan.theClient.Client;
import com.banyuan.theServer.Thread1;

import java.io.IOException;

/**
 * @author 陈浩
 * @date Created on 2019/11/17
 */
public class TestUser {
    public static void main(String[] args) throws IOException {
       // Client client = new Client();
        //Client.login();
        // Client.getQuestions();
//        for (int i = 1; i < Client.list.size(); i++) {
//            System.out.println(i + "." + Client.list.get(i));
//        }
        //System.out.println(Client.getSelQus());
       // System.out.println(Client.getStuScore());
        new Questions();
//        Thread1 thread1=new Thread1();
//        Thread thread=new Thread(thread1);
//        thread.start();
//        Thread1 thread2=new Thread1();
//        Thread threa=new Thread(thread2);
//        threa.start();
    }
}

