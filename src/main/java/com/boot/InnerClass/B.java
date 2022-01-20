package com.boot.InnerClass;

public class B extends A {
//    final int i;
    {
        System.out.println("B的对象初始化");
    }
    public B(){
        System.out.println("B无参构造");
    }
    static {
        System.out.println("B的static代码块");
    }
    public void f(){
        C c=new C();
    }
}
