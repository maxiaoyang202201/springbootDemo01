package com.boot.InnerClass;

public class TestParcel {
    public static void main(String[] args) {
        Parcel4 p4=new Parcel4();
        Contents contents = p4.contents();
        Destination destination = p4.destination("shijiazhuang");

    }
}
