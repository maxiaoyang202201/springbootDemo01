package com.boot.adapted;

public class Adapter extends USBImpl implements PS2{
    @Override
    public void isPS2(USB i) {
        isUSB();
    }
    protected void aaa(int i){}
}
