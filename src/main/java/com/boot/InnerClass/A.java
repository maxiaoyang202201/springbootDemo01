package com.boot.InnerClass;

public class A {
    {
        System.out.println("A的对象初始化");
    }
    public A(){
        System.out.println("a无参构造");
    }
    static {
        System.out.println("A的static代码块");
    }
}
