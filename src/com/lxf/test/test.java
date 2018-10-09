package com.lxf.test;

public class test {
    private static void f(Letter y){
        y.c = 'z';
    }
    public static void main(String[] asgs){
        Letter x = new Letter();
        x.c = 'a';
        System.out.println(x.c);
        f(x);
        System.out.println(x.c);
        int a=0;
        System.out.println(a++);
        System.out.println(a);
        a = 0;
        System.out.println(++a);

    }
}
class Letter{
    char c;
}
