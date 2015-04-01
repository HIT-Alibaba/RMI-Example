 中间件技术 RMI 实验示例代码
=========================

生成 stub 和 skeleton:

    rmic HelloImpl -vcompat
    
先运行 Server

    javac HelloServer.java
    java HelloServer
    
再运行 Client:

    javac HelloClient.java
    java HelloClient
    

参考资料：

* https://github.com/sorenchiron/RmiDemo
* http://lavasoft.blog.51cto.com/62575/91679/
* http://www.blogjava.net/zhenyu33154/articles/320245.html