package com.boot.string;

public  class A {
    private final int i;
    private final static int j;
    static {
        j=1;
        System.out.println("sssssssaaaaaa");
    }
    public A(int i){
        this.i=i;
    }
    public A(){
        i=0;
    }
    public static void aa(){
        System.out.println("aa");
    }
    public static void aaa(){
        System.out.println("aaa");
    }
}

class B extends A{
//    public static void aa(){
//        System.out.println("bb");
//    }
}
