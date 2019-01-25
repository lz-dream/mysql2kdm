> 概述

    本工具是一个spring boot项目，使用@EnableScheduling（定时任务）功能周期性执行任务。
    用于读取mysql的点值和波形数据，然后根据kdm接口写入kdm平台。

> 使用说明

    1. 执行sql目录下的sql创建两个表
    
    2. oge_kkscode表没有初始化数据，需要将原编码和kks编码对应关系导入表
    
    3. 根目录下的startup.bat是启动快捷方式，放到jar包同目录双击启动；
    
    4.  startup.bat可以右键修改一些配置。