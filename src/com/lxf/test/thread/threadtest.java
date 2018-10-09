package com.lxf.test.thread;

public class threadtest {
    public static void main(String[] args){
        new MyThread().start();
        new MyThread().start();
        new MyThread().start();
    }
}
class MyThread extends Thread{
    private   static int num;
    private final Object obj = new Object();
    public  void run(){

        for(int i = 0; i<100;i++ ){
            synchronized (obj){
            System.out.println(getName()+ ":"+ num++);
        }}
    }
}