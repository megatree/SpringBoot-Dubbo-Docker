docker run --name zookeeper-debug -p 2182:2181 -p 10000:8080 chaimm/zookeeper-dubbo:1.0
# 进去启动tomcat，访问
http://127.0.0.1:10000/dubbo-admin-2.8.4

mysql
docker run --name master-mysql -p 3308:3306 -e MYSQL_ROOT_PASSWORD=123 -d mysql:5.7
mysql -h127.0.0.1 -P3308 -uroot -p123