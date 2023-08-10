# poplar-blog（白杨树博客，正在开发中...）

## 项目技术栈

- Spring Boot 3.1.2(M1) 单体架构
- JDK 17

## 项目模块概览：

- 公共模块 poplar-framework
- 后台模块 poplar-admin
- 前台模块 poplar-index

## 项目亮点

1. 使用Jasypt给配置文件中的密码加密，加密算法为默认的PBEWithMD5AndDES，解决密码明文不安全问题
2. 使用EasyCode插件自动生成entity,dao,service,serviceImpl，解决写重复代码问题