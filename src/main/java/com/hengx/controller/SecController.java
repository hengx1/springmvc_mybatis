package com.hengx.controller;


import com.hengx.model.UrlList;
import com.hengx.service.UrlListService;
import org.apache.jasper.tagplugins.jstl.core.Url;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.websocket.server.PathParam;
import java.util.Date;

@Controller
@RequestMapping("/sec")
public class SecController {

    @Resource
    private UrlListService urlListService;

    @GetMapping("/index")
    public String index(Model model){
        return  "dirscan";
    }

    @RequestMapping("/scaning")
    public String dirscan(Model model, @ModelAttribute UrlList urlList){
        String urlname = urlList.getUrlname();
        Date date = new Date();
        urlList.setCreatedate(date);
        int x = urlListService.insert(urlList);
        System.out.println("返回的主键ID为："+x);
        model.addAttribute("url1",urlname);
        return "showdir";
    }

}
