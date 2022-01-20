package com.boot.string;

import java.util.Arrays;
import java.util.Scanner;

import com.boot.string.A;

public class StrTest {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
//        String s1=new String();
//
//        char[] chars={'a','b','c'};
//        String s2=new String(chars);
        Class<?> aClass = Class.forName("com.boot.string.A");
        A a = (A) aClass.newInstance();
        final int[] ints={0,1,2,3};
        ints[1]=11;
        System.out.println(Arrays.toString(ints));
        Scanner scanner=new Scanner(System.in);
    }

}
