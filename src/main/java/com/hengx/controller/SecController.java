package com.hengx.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.websocket.server.PathParam;

@Controller
@RequestMapping("/sec")
public class SecController {


    @GetMapping("/index")
    public String index(Model model){
        return  "dirscan";
    }

    @RequestMapping("/scaning")
    public String dirscan(Model model, @RequestParam String url){

        model.addAttribute("url1",url);
        return "showdir";
    }

}
