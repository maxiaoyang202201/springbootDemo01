package com.boot.InnerClass;

public class Parcel7 {
    static Integer a=10;
    public Contents contents(){
        return new Contents() {
            private Integer i=a;
            @Override
            public int value() {
                return i;
            }
        };
    }

    public static void main(String[] args) {
        Parcel7 p=new Parcel7();
        Contents contents = p.contents();
        System.out.println(contents.value());
        a=111;
        System.out.println("------");
        System.out.println(contents.value());
    }
}
