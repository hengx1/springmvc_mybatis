package com.hengx.util;

public class Page {
    int start = 0;//起始数据位置
    int count = 5;//每页展示的数据个数
    int last = 0;//最后一页的位置

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getLast() {
        return last;
    }

    public void setLast(int last) {
        this.last = last;
    }

    public void caculateLast(int total){
        if(0 == total % count){
            last = total - count;
        }else{
            last = total - total % count;
        }
    }
}
