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

 Date: 25/11/2019 09:10:18
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for Student
-- ----------------------------
DROP TABLE IF EXISTS `Student`;
CREATE TABLE `Student` (
  `StuNum` int(3) NOT NULL AUTO_INCREMENT,
  `StuName` varchar(255) NOT NULL,
  `StuPassword` varchar(255) NOT NULL,
  `StuScore` int(255) NOT NULL,
  `StuUseTime` int(4) DEFAULT NULL,
  PRIMARY KEY (`StuNum`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of Student
-- ----------------------------
BEGIN;
INSERT INTO `Student` VALUES (1, '刘国泰', '111111', 25, NULL);
INSERT INTO `Student` VALUES (2, '崔稼稼', '222222', 0, NULL);
INSERT INTO `Student` VALUES (3, '王宏', '333333', 0, NULL);
INSERT INTO `Student` VALUES (4, '张宇', '444444', 0, NULL);
INSERT INTO `Student` VALUES (5, '李文东', '555555', 0, NULL);
INSERT INTO `Student` VALUES (6, '张伟', '666666', 0, NULL);
INSERT INTO `Student` VALUES (7, '余思笳', '777777', 0, NULL);
INSERT INTO `Student` VALUES (8, '左小凡', '123456', 100, NULL);
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
