package com.hengx.service.impl;

import com.hengx.dao.DirListDao;
import com.hengx.dao.UrlListDao;
import com.hengx.model.DirList;
import com.hengx.model.UrlList;
import com.hengx.service.UrlListService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Logger;

@Service
public class UrlListServiceImpl implements UrlListService {

    @Resource
    private UrlListDao urlListDao;

    @Resource
    private DirListDao dirListDao;

    @Override
    public int insert(UrlList urlList) {
        return urlListDao.insert(urlList);
    }

    @Override
    public List<UrlList> findOne(UrlList urlList) {
        return urlListDao.findOne(urlList);
    }

    @Override
    public List<UrlList> list() {
        return urlListDao.list();
    }

    @Override
    public int total() {
        return urlListDao.total();
    }

    @Override
    public void runThread(int id, String url)  {

        LinkedList<String> sites = new LinkedList<String>();
        File f = new File("D:\\upload\\dicc.txt");

        try {
            FileInputStream fip = new FileInputStream(f);
            InputStreamReader reader = new InputStreamReader(fip, "UTF-8");
            BufferedReader br = new BufferedReader(reader);
            String linestr;//按行读取 将每次读取一行的结果赋值给linestr
            while ((linestr = br.readLine()) != null) {
                linestr = url+"/"+linestr;
                sites.add(linestr);
            }
            br.close();//关闭IO
            fip.close();
        } catch (FileNotFoundException | UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        ExecutorService executor = Executors.newFixedThreadPool(15);
        DirList dirList =new DirList();
        for(int i=0;i<sites.size();i++){
            final int j = i;
            executor.execute(new Runnable() {
                @Override
                public void run() {
                    final String urlName = sites.get(j);

                        if(getStatus(urlName).startsWith("200 "))
                        {
                            dirList.setUrlid(id);
                            dirList.setDirurl(getStatus(urlName));
                            dirListDao.insert(dirList);
                        }
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });

        }
        executor.shutdown();
        while (true) {
            if (executor.isTerminated()) {
                System.out.println("探测结束"+url);
                break;
            }
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
    public String getStatus(String urlName){
        String result ="";
        try{
            URL url = new URL(urlName);
            URLConnection connection = url.openConnection();
            connection.setConnectTimeout(3000);
            connection.connect();
            String[] status = connection.getHeaderField(0).split(" ");
            String server = connection.getHeaderField(1);
            result = status[1]+" "+connection.getContentLength()+"B"+" "+urlName;
        }catch (Exception e) {
//			e.printStackTrace();
        }
        return result;
    }

}
