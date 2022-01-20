package com.boot.InnerClass;

public class DotThis {
    void f(){
        System.out.println("DotThis.f()");
    }
    class Inner{
        public DotThis outer(){
            return DotThis.this;
        }
    }
    public Inner inner(){
        new Inner().outer();
        return new Inner();
    }

    public static void main(String[] args) {
        DotThis dotThis=new DotThis();
        Inner inner = dotThis.inner();
        inner.outer().f();
        Inner inner1 = dotThis.new Inner();
        Inner inner2 = new DotThis().new Inner();
    }
}
