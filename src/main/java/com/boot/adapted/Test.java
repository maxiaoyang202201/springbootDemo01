package com.boot.adapted;

public class Test {

    public static void main(String[] args) {

    }
    public void test(){
        USBImpl usb = new USBImpl() {
            @Override
            public void isUSB() {
                b();
                c();
                d();
                System.out.println("123123");
            }
        };
        usb.a();
    }

    public void d() {
        System.out.println("这是d方法");
    }
}
