package com.hengx.controller;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hengx.model.DirList;
import com.hengx.model.UrlList;
import com.hengx.service.DirListService;
import com.hengx.service.UrlListService;
import com.hengx.util.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/sec")
public class SecController {

    @Resource
    private UrlListService urlListService;

    @Resource
    private DirListService dirListService;

    @GetMapping("/index")
    public String index(Model model){
        return  "dirscan";
    }

    @RequestMapping("/scaning")
    public String dirscan(Model model, @ModelAttribute UrlList urlList){
        String urlname = urlList.getUrlname();
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String tmpdate = sdf.format(date);
        urlList.setCreatedate(tmpdate);
        urlListService.insert(urlList);
        System.out.println("返回的主键ID为："+urlList.getId());
//        Runner1 runner1 = new Runner1(urlList.getId(),urlname);
//        Thread t = new Thread(runner1);
//        t.start();
        urlListService.runThread(urlList.getId(),urlname);
        model.addAttribute("url1",urlname);
        return "showdir";
    }

    @RequestMapping("/urllist")
    public String urllist(Model model, Page page){
        PageHelper.offsetPage(page.getStart(),5);
        List<UrlList> urlList = urlListService.list();
        int total = (int) new PageInfo<>(urlList).getTotal();
        page.caculateLast(total);
        model.addAttribute("urllist",urlList);
        return "urlList";
    }

    @RequestMapping("/scanresult/{urlid}")
    public String scanresult(@PathVariable int urlid,Model model){
        DirList dirList = new DirList();
        dirList.setUrlid(urlid);
        List<DirList> dirlist = dirListService.list(dirList);
        model.addAttribute("dirlist",dirlist);
        return "scanresult";
    }

    @RequestMapping("del/{id}")
    public String del(@PathVariable int id,Model model){
        urlListService.delete(id);
        Page page = new Page();
        PageHelper.offsetPage(page.getStart(),5);
        List<UrlList> urlList = urlListService.list();
        int total = (int) new PageInfo<>(urlList).getTotal();
        page.caculateLast(total);
        model.addAttribute("urllist",urlList);
        return "urlList";
    }
//    class Runner1 implements  Runnable{
//        private int id;
//        private String url;
//        public Runner1(int id,String name){
//            this.id = id;
//            this.url = url;
//        }
//        @Override
//        public void run() {
//            urlListService.runThread(id,url);
//        }
//    }


}
