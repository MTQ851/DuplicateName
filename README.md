王者荣耀改重复名
项目简介
“王者荣耀改重复名”是一个基于 Spring Boot 的应用程序，用于生成王者荣耀游戏中的唯一名称。通过简单的接口和前端页面，用户可以输入旧名称并获得一个新的、不重复的名称。

功能特点
生成新名称：提供一个接口来生成新的带特殊符号名称。
用户友好界面：开箱即用，无需额外配置即可使用。

技术栈
Spring Boot：用于构建应用程序的核心框架。
前端技术：HTML, CSS, JavaScript（无数据库使用）。
环境要求
Java 8 或更高版本
Maven：用于构建和管理项目依赖
快速开始

克隆项目
git clone https://github.com/MTQ851/DuplicateName.git
进入项目目录

cd DuplicateName
构建和运行应用

使用 Maven 构建项目并运行：
mvn spring-boot:run

或者，你可以先构建 JAR 文件，然后运行：
mvn package
java -jar DuplicateName.jar

打开浏览器并访问以下 URL 以使用应用：
http://localhost:8080

使用指南
生成新名称：在主页上输入旧名称并点击“生成新名称”按钮，系统将返回一个新的、不重复的名称。
