package com.xubo.algorithm.designmodel.stragety;

/**
 * @Author Druid
 * @Date 2023/2/14 20:18
 * @Des
 */
public class AddAction implements StragetyImpl{
    @Override
    public int caculate(int a, int b) {
        return a + b;
    }
}
