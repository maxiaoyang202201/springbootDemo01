package com.boot.adapted;

public class Adapter2 implements PS2{
    private USB usb;
    public Adapter2(USBImpl usb){
        this.usb=usb;
    }
    public Adapter2(USB usb){
        this.usb=usb;
    }
    @Override
    public void isPS2(USB i) {
        usb.isUSB();
        System.out.println(this.getClass());
    }
}
