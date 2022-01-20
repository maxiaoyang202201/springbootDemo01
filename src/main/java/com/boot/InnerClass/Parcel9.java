package com.boot.InnerClass;

public class Parcel9 {
    {
        System.out.println("对象初始化代码块");
    }
    public Parcel9(){
        System.out.println("无参构造方法");
    }
    public Destination destination(String dest){
        return new Destination() {
            {
                System.out.println("aaa");
            }
            private String label= dest;
            @Override
            public String readLable() {
                return label;
            }
        };
    }

    public static void main(String[] args) {
        Parcel9 p=new Parcel9();
        Destination d = p.destination("beijing");
        String s = d.readLable();
        System.out.println(s);

    }
}
