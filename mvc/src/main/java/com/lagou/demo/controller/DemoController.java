package com.lagou.demo.controller;

import com.lagou.demo.service.IDemoService;
import com.lagou.edu.mvcframework.annotations.LagouAutowired;
import com.lagou.edu.mvcframework.annotations.LagouController;
import com.lagou.edu.mvcframework.annotations.LagouRequestMapping;
import com.lagou.edu.mvcframework.annotations.LagouSecurity;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

@LagouController
@LagouRequestMapping("/demo")
public class DemoController {


    @LagouAutowired
    private IDemoService demoService;


    /**
     * URL: /demo/query?name=lisi
     * @param request
     * @param response
     * @param username
     */
    @LagouRequestMapping("/query")
    @LagouSecurity({"zhangsan","lisi"})
    public void query(HttpServletRequest request, HttpServletResponse response, String username) throws IOException {
        response.getWriter().println(new Date().toString());
    }


    @LagouRequestMapping("/getUsername")
    @LagouSecurity({"zhangsan","lisi"})
    public void getUsername(HttpServletRequest request, HttpServletResponse response, String username) throws IOException {
        response.getWriter().println(username);
    }



}
