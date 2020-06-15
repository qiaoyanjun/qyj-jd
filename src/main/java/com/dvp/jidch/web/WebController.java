package com.dvp.jidch.web;

import com.dvp.jidch.model.DongTaiGuanLi;
import com.dvp.jidch.service.impl.DongTaiGuanLiRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;
import java.util.List;

@Controller
public class WebController {


    @RequestMapping(value = "/login")
    public String welcome(ModelMap model) {
        model.addAttribute("time", new Date());
        model.addAttribute("message", "hello world");
        return "login";
    }

    @RequestMapping(value = "/mainHtml")
    public String mainHtml(ModelMap model) {
        model.addAttribute("time", new Date());
        model.addAttribute("message", "hello world");
        return "contacts";
    }
    @RequestMapping(value = "/mainHtmlWaiG")
    public String mainHtmlWaiG(ModelMap model) {
        model.addAttribute("time", new Date());
        model.addAttribute("message", "hello world");
        return "contacts-waig";
    }

    @RequestMapping(value = "/mainHtmlDynProject")
    public String mainHtmlDynProject(ModelMap model) {
        model.addAttribute("time", new Date());
        model.addAttribute("message", "hello world");
        return "contacts-DynProject";
    }

    @RequestMapping(value = "/mainHtmlDynWaiG")
    public String mainHtmlDynWaiG(ModelMap model) {
        model.addAttribute("time", new Date());
        model.addAttribute("message", "hello world");
        return "contacts-DynWaiG";
    }
}
