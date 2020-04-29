package com.lagou.edu.controller;

import com.lagou.edu.pojo.Resume;
import com.lagou.edu.service.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("resume")
public class ResumeController {

    @Autowired
    private ResumeService resumeService;

    @RequestMapping("login")
    public ModelAndView login(HttpServletRequest request, HttpServletResponse response, String name,String password){
        ModelAndView modelAndView = new ModelAndView();
        if(name.equals("admin") & password.equals("admin")){
            request.getSession().setAttribute("username",name);
            request.getSession().setAttribute("password",password);
            List<Resume> resumes = resumeService.queryAll();
            modelAndView.addObject("resumes",resumes);
            modelAndView. setViewName("success");
        }else{
            modelAndView. setViewName("/index.jsp");
        }
        return modelAndView;
    }

    @RequestMapping("delete")
    public ModelAndView delete(Resume resume){
        ModelAndView modelAndView = new ModelAndView();
        resumeService.delete(resume);
        List<Resume> resumes = resumeService.queryAll();
        modelAndView.addObject("resumes",resumes);
        modelAndView. setViewName("success");
        return modelAndView;
    }

    @RequestMapping("save")
    public ModelAndView save(Resume resume){
        if(resume.getId() == null){
            resumeService.saveOne(resume);
        }else {
            resumeService.saveById(resume);
        }
        ModelAndView modelAndView = new ModelAndView();
        List<Resume> resumes = resumeService.queryAll();
        modelAndView.addObject("resumes",resumes);
        modelAndView. setViewName("success");
        return modelAndView;
    }

}
