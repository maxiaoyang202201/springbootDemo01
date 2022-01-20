package com.boot.InnerClass;

public class Parcel5 {
    public Destination destination(String s){
        class PDestination implements Destination{
            private String lable;
            private PDestination(String whereTo){
                lable=whereTo;
            }
            @Override
            public String readLable() {
                return lable;
            }
        }
        return new PDestination(s);
    }
    public void test(){
        class PDestination implements Destination{
            @Override
            public String readLable() {
                return null;
            }
        }
    }

    public static void main(String[] args) {
        Parcel5 parcel5=new Parcel5();
        Destination destination = parcel5.destination("beijing");
        String s = destination.readLable();
        System.out.println(s);

    }
}
