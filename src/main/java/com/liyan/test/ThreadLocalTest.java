package com.liyan.test;


public class ThreadLocalTest {
    public static void main(String[] args) {
        final ThreadLocal<String> threadLocal=new ThreadLocal<>();
        threadLocal.set("测试");
        new Thread(){
            @Override
            public void run() {
                System.out.println(threadLocal.get());
            }
        }.start();
    }
}
