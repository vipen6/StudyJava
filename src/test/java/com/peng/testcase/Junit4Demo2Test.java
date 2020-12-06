package com.peng.testcase;
import org.junit.*;


public class Junit4Demo2Test {

    @Test//Test注解，标记一个方法可以作为一个测试用例
    public void fun4(){
        System.out.println("fun4 test4");
    }

    @Test
    public void fun5(){
        System.out.println("fun5 test5");
    }

    @Test
    //@Ignore//整体执行时，忽略该用例
    public void fun6(){
        System.out.println("fun6 test6");
    }


}
