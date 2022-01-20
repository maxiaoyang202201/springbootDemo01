package com.boot.InnerClass;

public class Parcel11 {
    static class P1{
        private P1(){
            System.out.println("p1");
        }
        public void f(){
            aa();
            System.out.println("f方法");
        }
    }
    private static void aa(){
        System.out.println("aaa");
    }

    public static void main(String[] args) {
        P1 p1=new P1();
        p1.f();
    }

}
