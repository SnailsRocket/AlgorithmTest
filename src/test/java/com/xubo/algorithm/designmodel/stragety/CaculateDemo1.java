package com.xubo.algorithm.designmodel.stragety;

/**
 * @Author Druid
 * @Date 2023/2/14 20:19
 * @Des 策略模式
 */
public class CaculateDemo1 {
    private StragetyImpl stragety;

    public void setStragety(StragetyImpl stragety) {
        this.stragety = stragety;
    }

    public int getResult(int a, int b) {
        return this.stragety.caculate(a, b);
    }
}
