/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50621
Source Host           : localhost:3306
Source Database       : project

Target Server Type    : MYSQL
Target Server Version : 50621
File Encoding         : 65001

Date: 2018-10-28 22:13:11
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `product`
-- ----------------------------
DROP TABLE IF EXISTS `product`;
CREATE TABLE `product` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `number` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of product
-- ----------------------------
INSERT INTO `product` VALUES ('1', '袜子', '100');
INSERT INTO `product` VALUES ('2', '衬衫', '50');
INSERT INTO `product` VALUES ('3', '羊毛衫', '45');
INSERT INTO `product` VALUES ('4', '雪纺衫', '35');
INSERT INTO `product` VALUES ('5', '裤子', '28');
INSERT INTO `product` VALUES ('6', '高跟鞋', '68');

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `sex` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '张一', '22', '男');
INSERT INTO `user` VALUES ('2', '张二', '29', '女');
INSERT INTO `user` VALUES ('3', '张三', '18', '女');
INSERT INTO `user` VALUES ('4', '张四', '16', '男');
INSERT INTO `user` VALUES ('5', '张五', '29', '女');
INSERT INTO `user` VALUES ('6', '张六', '25', '男');
INSERT INTO `user` VALUES ('7', '张七', '31', '女');
INSERT INTO `user` VALUES ('8', '张八', '18', '男');
INSERT INTO `user` VALUES ('9', '张九', '16', '女');
INSERT INTO `user` VALUES ('10', '张十', '19', '男');
INSERT INTO `user` VALUES ('11', '老十一', '30', '女');
INSERT INTO `user` VALUES ('12', '老十二', '23', '男');
