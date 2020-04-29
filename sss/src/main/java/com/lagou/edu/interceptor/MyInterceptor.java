package com.lagou.edu.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String username = (String) request.getSession().getAttribute("username");
        String passport = (String) request.getSession().getAttribute("password");
        if(username != null && username.equals("admin") && passport != null && passport.equals("admin"))
            return true;
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/index.jsp");
        response.sendRedirect("/index.jsp");
        return false;
    }
}
