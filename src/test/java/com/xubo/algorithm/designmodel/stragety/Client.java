package com.xubo.algorithm.designmodel.stragety;

/**
 * @Author Druid
 * @Date 2023/2/14 20:22
 * @Des 策略模式 可以继续优化 AddAction放入map中，并根据type获取
 */
public class Client {

    public static void main(String[] args) {
        CaculateDemo1 caculateDemo = new CaculateDemo1();
        caculateDemo.setStragety(new AddAction());
        int result = caculateDemo.getResult(4, 5);
        System.out.println("result = " + result);

        caculateDemo.setStragety(new Subtraction());
        int result1 = caculateDemo.getResult(8, 3);
        System.out.println("result1 = " + result1);
    }
}
