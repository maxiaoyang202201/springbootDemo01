package com.boot.adapted;

import com.boot.adapted.USB;

public class USBImpl implements USB {
    private String ss="ss";
    @Override
    public void isUSB() {
        System.out.println("usb");
    }
    public void a(){
        System.out.println("这是a方法");
        isUSB();
    }
    public void b(){
        System.out.println("这是b方法");
    }
    protected void c(){
        System.out.println("这是c方法");
    }
    protected void aaa(int i){}
}
