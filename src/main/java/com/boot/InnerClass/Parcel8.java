package com.boot.InnerClass;

public class Parcel8 {
    public Wrapping wrapping(int x){
        return new Wrapping(x){
            public int value(){
                return super.value()*2;
            }
        };
    }

    public static void main(String[] args) {
        Parcel8 p=new Parcel8();
        Wrapping wrapping = p.wrapping(2);
        int value = wrapping.value();
        System.out.println(value);
    }
}
