# alibaba-sentinel-dashboard-nacos

## 阿里sentinel后台面板规则（包括gateway模式）持久化-推模式（nacos），基于版本v1.7.0改造

##新增配置说明
> application.properties
```
spring.cloud.sentinel.datasource.nacos.server-addr=http://10.11.83.115:8848
spring.cloud.sentinel.datasource.nacos.groupId=DEFAULT_GROUP
spring.cloud.sentinel.datasource.nacos.namespace=f1cefad3-d653-4079-8ee8-16d0b6598ade
```
spring.cloud.sentinel.datasource.nacos.server-addr: nacos地址
spring.cloud.sentinel.datasource.nacos.groupId: nacos组id
spring.cloud.sentinel.datasource.nacos.namespace： nacos命名空间，可不设,默认为public