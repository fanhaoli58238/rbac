package com.bjsxt.controller;

import com.bjsxt.service.UrlService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class UrlController {
    @Resource
    private UrlService urlService;

    @RequestMapping("showAllUrl")
    public String showAll(){
        return "redirect:/main.jsp";
    }
}
