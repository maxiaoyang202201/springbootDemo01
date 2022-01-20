package com.boot.InnerClass;

public class Parcel2 {
    class Contents{
        private int i=11;
        public int value(){
            return 1;
        }
    }
   private class Destination{
        private String lable;
        Destination(String whereTo){
            lable=whereTo;
        }
        String readLable(){
            return lable;
        }
    }
    public Destination to(String s){
        return new Destination(s);
    }
    public Contents contents(){
        return new Contents();
    }
    public void ship(String dest){
        Contents c=new Contents();
        Destination d=new Destination(dest);
        System.out.println(d.readLable());
    }

    public static void main(String[] args) {
        Parcel2 p=new Parcel2();
        p.ship("beijing");
        Parcel2 q=new Parcel2();
        Destination shanghai = q.to("shanghai");
        Contents contents = q.contents();
    }
}
