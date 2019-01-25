::数据库连接配置
set url="jdbc:mysql://localhost:3306/cmsdb?characterEncoding=utf8&useSSL=false"
set username=root
set password=root
::同步周期（毫秒）
set fixedDelay=15000 
::kdm接口地址
set api="http://192.168.12.6:8082/kdmService/rest/1.0/kksData?method=writeRTDataList"
::启动命令
java -jar  -Xms2048m -Xmx4096m mysql2kdm-0.0.1-SNAPSHOT.jar --spring.datasource.url=%url%^
 --spring.datasource.username=%username% --spring.datasource.password=%password%^
 --oge.apiUrl=%api% --oge.fixedDelay=%fixedDelay%
