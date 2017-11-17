package com.hongfu.jvmtest;

public class JvmTest {

    public static int add(int a, int b){
        return  a + b;
    }

    public static void main(String[] args){
            int a = 1,b = 2;
        System.out.println("执行参数是 a={}，b={}"+a +","+b);
        try {
            System.out.println("我要开始睡觉了，我要睡"+1*60*60*1000+"毫秒");
            Thread.sleep(1*60*60*1000);
            System.out.println("我醒了");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        add(a,b);
            System.out.println("执行的结果是 a + b = "+add(a,b));
    }
}
