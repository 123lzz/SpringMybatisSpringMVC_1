package com.hand.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {
    private int i = 0;
    private int k = 1;
    private int j = 1;

    // 拦截器测试
    @RequestMapping("/hello")
    public ModelAndView requestHello() {
        ModelAndView model = new ModelAndView("hello");
        //  ModelAndView model = new ModelAndView("/WEB-INF/jsp/hello.jsp");
        model.addObject("count", ++i);
        System.out.println("==========处理请求中=======");
        System.out.println(".........................");
        return model;
    }

}
