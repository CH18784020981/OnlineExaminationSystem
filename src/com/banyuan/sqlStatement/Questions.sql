/*
 Navicat Premium Data Transfer

 Source Server         : root
 Source Server Type    : MySQL
 Source Server Version : 50727
 Source Host           : localhost:3306
 Source Schema         : project

 Target Server Type    : MySQL
 Target Server Version : 50727
 File Encoding         : 65001

 Date: 25/11/2019 09:09:48
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for Questions
-- ----------------------------
DROP TABLE IF EXISTS `Questions`;
CREATE TABLE `Questions` (
  `QusNum` int(3) NOT NULL AUTO_INCREMENT,
  `Question` text,
  `ChooseA` varchar(255) DEFAULT NULL,
  `ChooseB` varchar(255) DEFAULT NULL,
  `ChooseC` varchar(255) DEFAULT NULL,
  `ChooseD` varchar(255) DEFAULT NULL,
  `Answer` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`QusNum`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of Questions
-- ----------------------------
BEGIN;
INSERT INTO `Questions` VALUES (1, ' 假定AB为一个类，则执行 “AB ab = new AB(a,5);”语句时将自动调用该类的( )', 'A.带参构造函数 ', 'B.无参构造函数', 'C.拷贝构造函数', 'D.重载赋值运算', 'A');
INSERT INTO `Questions` VALUES (2, '为Test类的一个无形式参数无返回值的方法method书写方法头，使得使用类名Test作为前缀就可以调用它，该方法头的形式为( ) ', 'A.static void method（）', 'B.public void method ', 'C.protected void method（） ', 'D.abstract void method（）', 'A');
INSERT INTO `Questions` VALUES (3, '关键字super的作用是? ', 'A.用来访问父类被隐藏的非私有成员变量 ', 'B.用来调用父类中被重写的方法 ', 'C.用来调用父类的构造函数 ', 'D.以上都是 ', 'D');
INSERT INTO `Questions` VALUES (4, '关于AWT和Swing说法正确的是？ ', 'A.Swing是AWT的子类 ', 'B.AWT在不同操作系统中显示相同的风格 ', 'C.AWT不支持事件类型，Swing支持事件模型 ', 'D.Swing在不同的操作系统中显示相同的风格 ', 'D');
INSERT INTO `Questions` VALUES (5, 'Java语言中，int类型在内存中所占的位数为 ( )', 'A.8   ', 'B.16', ' C.32 ', 'D.64', 'C');
INSERT INTO `Questions` VALUES (6, '下列哪个字符串是合法的类标识符？ （ ）', 'A.implements', 'B._implements  ', 'C.-implements  ', 'D.implements-1 ', 'B');
INSERT INTO `Questions` VALUES (7, 'AWT中创建一个标识有“确定”按钮的语句是 ( )', 'A.TextField b = new TextField(“确定”);', 'B.Checkbox b = new Checkbox(“确定”);', 'C.Buttn b = new Button(“确定”);', 'D.Label b = new Label(“确定”);', 'C');
INSERT INTO `Questions` VALUES (8, '下列哪个命令中，用来编译Java程序的是： ( )', 'A.java   ', 'B.javadoc   ', 'C.jar  ', ' D.javac  ', 'D');
INSERT INTO `Questions` VALUES (9, '下列有关一个Java文件的叙述，正确的是？ （ ）', 'A.可以有2个以上package语句', 'B.可以有2个以上import语句   ', 'C.可以有2个以上public类  ', 'D.只能有1个类定义  ', 'B');
INSERT INTO `Questions` VALUES (10, '一个Unicode字符占用 （ ） ', 'A.8位 ', 'B.16位 ', 'C.32位   ', 'D.一个字节', 'A');
INSERT INTO `Questions` VALUES (11, '类声明中，声明抽象类的关键字是 ( ) ', 'A.public ', 'B.abstract  ', ' C.final', 'D.class  ', 'B');
INSERT INTO `Questions` VALUES (12, 'Java语言中，byte类型在内存中所占的位数为 ( )', 'A.8 ', 'B.16 ', 'C.32 ', 'D.64 ', 'A');
INSERT INTO `Questions` VALUES (13, 'AWT中用来表示文本框的类是 ( ) ', 'A.TextField ', ' B.Menu  ', ' C.Label  ', 'D.List', 'A');
INSERT INTO `Questions` VALUES (14, '下列哪个字符串不能作为类标识符？ （ ） ', 'A.HelloWorld ', 'B.helloworld  ', 'C.J2EE', 'D.Hello-World', 'D');
INSERT INTO `Questions` VALUES (15, ' 将长整型(long)数据转换为较短的整数类型(int)数据，要进行 ( ) ', 'A.类型的自动转换 ', 'B.类型的强制转换 ', 'C.无需转换', 'D.无法实现', 'B');
INSERT INTO `Questions` VALUES (16, '下列哪个不是合法的标识符  ', 'A.hello ', 'B.i', 'C.123', 'D._good', 'C');
INSERT INTO `Questions` VALUES (17, '下列哪个语句语法正确？', 'A.byte y = 11; byte x = y +y; ', 'B.String x = new Object();', 'C.Object x = new String(“Hellow”);', 'D.int a [11] = new int [11];', 'C');
INSERT INTO `Questions` VALUES (18, '以下选项中哪一个不是Java的特点：', 'A.自动垃圾回收  ', 'B.跨平台', 'C.面向对象', 'D.多重继承', 'D');
INSERT INTO `Questions` VALUES (19, '下面哪些不是JAVA的基本数据类型()', 'A.long ', 'B.float ', 'C.String', 'D.double', 'C');
INSERT INTO `Questions` VALUES (20, '在java中，由java编译器自动导入，而无需在程序中用import导入的包是', 'A. java.applet', 'B. java.lang', 'C. java.util', 'D. java.awt', 'B');
INSERT INTO `Questions` VALUES (21, 'Socket通信使用的底层协议是', 'A.UDP协议', 'B.TCP/IP协议\n\nB．TCP/IP协议\n\n\n\n', 'C.FTP协议', 'D.TELNET协议', 'B');
INSERT INTO `Questions` VALUES (22, '下列叙述中，正确的是', 'A.java语言的标识符是区分小写的', 'B.源文件名与public类名可以不相同', 'C.源文件名其扩展为.jar', 'D.源文件中public类的数目不限', 'D');
INSERT INTO `Questions` VALUES (23, '下列属于合法的java标识符的是', 'A._cat', 'B.5books', 'C.+static', 'D.-3.14159', 'A');
INSERT INTO `Questions` VALUES (24, '陈浩', 'A', 'B', 'C', 'D', 'A');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
