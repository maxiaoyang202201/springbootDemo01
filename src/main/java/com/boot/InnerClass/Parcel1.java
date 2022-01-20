package com.boot.InnerClass;

public class Parcel1 {
    class Contents{
        private int i=11;
        public int value(){
            return 1;
        }
    }
    class Destination{
        private String lable;
        Destination(String whereTo){
            lable=whereTo;
        }
        String readLable(){
            return lable;
        }
    }
    public void ship(String dest){
        Contents c=new Contents();
        Destination d=new Destination(dest);
        System.out.println(d.readLable());
    }

    public static void main(String[] args) {
        Parcel1 p=new Parcel1();
        p.ship("beijing");
    }
}
