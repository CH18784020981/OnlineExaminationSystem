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

 Date: 25/11/2019 09:09:32
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for Admin
-- ----------------------------
DROP TABLE IF EXISTS `Admin`;
CREATE TABLE `Admin` (
  `AdmNum` int(255) NOT NULL AUTO_INCREMENT,
  `AdmName` varchar(255) DEFAULT NULL,
  `AdmPassword` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`AdmNum`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of Admin
-- ----------------------------
BEGIN;
INSERT INTO `Admin` VALUES (1, '三爷', '999999');
INSERT INTO `Admin` VALUES (2, '班主任', '101010');
INSERT INTO `Admin` VALUES (3, '总经理', '000000');
INSERT INTO `Admin` VALUES (4, '刘国泰', '111111');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
