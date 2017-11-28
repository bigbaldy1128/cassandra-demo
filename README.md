* [下载](http://cassandra.apache.org/download/)
* [官网](http://cassandra.apache.org/doc/latest/getting_started/index.html)
## 修改配置
/etc/cassandra/default.conf/cassandra.yaml
* seeds: "172.24.62.181" //节点配置
* listen_address: "172.24.62.181"
## 启动
service cassandra start
## 命令行
cqlsh --request-timeout=60 172.24.62.181 //连接