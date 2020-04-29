# SpringMVC
用户zhangsan和用户lisi都有访问以下两个请求的权限，
请求一：localhost:8080/demo/getUsername?username=lisi，权限验证后回返回当前用户名，
请求二：http://localhost:8080/demo/query?username=zhangsan,权限验证后回返回当前服务器时间，
如果username不等于zhangsan或者lisi，回返回请登录
