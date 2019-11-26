package cn.banyuan.abc;

import java.io.File;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author 陈浩
 * @date Created on 2019/11/8
 */
public class Administer {
    /**
     * 存储学生信息的文档
     */
    static File file1 = new File("StudentInformation.txt");
    /**
     * 存储试题的文档
     */
    static File file2 = new File("Questions.txt");


    static {
        if (!file1.exists()) {
            try {
                file1.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (!file2.exists()) {
            try {
                file2.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(1111);
        Socket s=ss.accept();

    }


}
