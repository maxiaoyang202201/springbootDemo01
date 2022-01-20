package com.boot.InnerClass;

public class Parcel4  {
    private class PContents implements Contents{
        private int i=11;
        @Override
        public int value() {
            return i;
        }
        public Parcel4 p4(){
            return Parcel4.this;
        }
    }
    private static class PDestination implements Destination{
        private String lable;
        private PDestination (String whereTo){
            lable=whereTo;
        }
        @Override
        public String readLable() {
            return lable;
        }
        private void aa(){
            PDestination a = new PDestination("a");
        }
        public Parcel4 p4(){
            return new Parcel4();
        }
    }
    public static Destination destination(String s){
        return new PDestination(s);
    }
    public Contents contents(){
        return new PContents();
    }
}
