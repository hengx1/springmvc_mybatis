package com.hengx.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hengx.dto.HengxDto;
import com.hengx.model.HengxUser;
import com.hengx.service.HengxUserService;
import com.hengx.util.Page;
import com.hengx.validator.HengxUserValidator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author xcp
 * @date 2020/11/22 12:09
 */
@Controller
@RequestMapping("/user")
public class HengxUserController {

    @Resource
    private HengxUserService hengxUserService;

    @Resource
    private HengxUserValidator hengxUserValidator;

    @GetMapping("/findAll")
    public String findAll(Model model){
        List<HengxUser> hengxUserList = hengxUserService.findAll();
//        for(HengxUser hengxUser:hengxUserList){
//            System.out.println("id: "+hengxUser.getId());
//            System.out.println("age:"+hengxUser.getAge());
//            System.out.println("Name: "+hengxUser.getName());
//            System.out.println("password: "+hengxUser.getPassword());
//        }
        model.addAttribute("cs",hengxUserList);
        model.addAttribute("cs1","hello,hengx");
        System.out.println("model="+model.toString());
        return  "hello";
    }

    //分页查询
    @GetMapping("/list")
    public String list(Model model, Page page){
        List<HengxUser> userList = hengxUserService.list(page);
        int total = hengxUserService.total();
        page.caculateLast(total);
        model.addAttribute("userList",userList);
        return "userList";
    }

    //分页查询 PageHelper
    @RequestMapping("/list1")
    public String list1(Model model,Page page){
        PageHelper.offsetPage(page.getStart(),5);
        List<HengxUser> userList = hengxUserService.list1();
        int total = (int) new PageInfo<>(userList).getTotal();
        page.caculateLast(total);
        model.addAttribute("userList",userList);
        return "userList";
    }

    @RequestMapping("/findone")
    public String findOne(Model model){
        HengxUser hengxUser = new HengxUser();
        hengxUser.setId(2);
        hengxUser.setAge(20);
        String str="admin desc,(if(1=1,sleep(6),1))--";
        hengxUser.setName(str);
        List<HengxUser> user1 = hengxUserService.findOne(hengxUser);
        for (HengxUser user:user1) {
            System.out.println(user.toString());
        }

        return "success";
    }

    @RequestMapping("/save")
    public String save() {

        return "saveUser";
    }
    @PostMapping("/insert")
    public String insert(@ModelAttribute HengxUser hengxUser, Model model, Errors errors){
        hengxUserValidator.validate(hengxUser,errors);
        if(errors.hasErrors()){
            model.addAttribute("errors",errors);
            return "error";
        }
        System.out.println("前台传入的数据：="+hengxUser.toString());
        int count = hengxUserService.insert(hengxUser);
        System.out.println("count="+count);
        return "success";

    }

    @GetMapping("/update")
    public String update(Model model){
        HengxUser hengxUser = new HengxUser();
        hengxUser.setId(1);
        hengxUser.setName("aaaaa");
        hengxUser.setAge(22);
        hengxUser.setPassword("123456");
        int count =hengxUserService.update(hengxUser);
        return "success";
    }

    @RequestMapping("/edit/{id}")
    public String edit(@PathVariable int id,Model model){
        HengxUser user = hengxUserService.findById(id);
        model.addAttribute("user",user);
        return "edit";
    }
    @RequestMapping("/update")
    public String update(@ModelAttribute HengxUser hengxUser,Model model){
        System.out.println("henguser="+hengxUser.toString());
            hengxUserService.update(hengxUser);
        return "forward:/user/list1";
    }

    @GetMapping("/in")
    public String userIn(Model model){
        return "userIn";
    }
    @GetMapping("/out")
    public String userOut(@RequestParam("id") Integer id, Model model){
        HengxUser user = hengxUserService.findById(id);
        model.addAttribute("user", convertToDTO(user));
        return "userOut";
    }

    @GetMapping("/updateInfo")
    public String updateInfo(@RequestParam("id") Integer id, Model model){
        HengxUser user = hengxUserService.findById(id);
        model.addAttribute("user", convertToDTO(user));
        return "updateUser";
    }
    private HengxDto convertToDTO(HengxUser user){
        HengxDto userDTO = new HengxDto();
        userDTO.setId(user.getId());
        userDTO.setName(user.getName());
        userDTO.setPassword(user.getPassword());
        return userDTO;
    }

    @RequestMapping("/json")
    public String testjson(){
        return "json";
    }

    @RequestMapping("/testJson")
    @ResponseBody
    public HengxUser testJson(@RequestBody HengxUser user){
        //打印接受的json数据
        System.out.println(user);
        return user;
    }

}
