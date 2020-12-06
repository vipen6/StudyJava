package com.peng.testcase;
import org.junit.*;
public class Junit4Demo1Test {

    @BeforeClass
    public static void beforeclass(){
        System.out.println("before class");
    }
    //添加before和after注解后，在执行test用例时，都会把before和after执行一次
    @Before
    public void before(){
        System.out.println("before");
    }

    @Test//Test注解，标记一个方法可以作为一个测试用例
    public void fun1(){
        System.out.println("fun1 test1");
    }

    @Test
    public void fun2(){
        System.out.println("fun1 test2");
    }

    @Test
    @Ignore//整体执行时，忽略该用例
    public void fun3(){
        System.out.println("fun3 test3");
    }

    @After
    public void after(){
        System.out.println("after");
    }

    @AfterClass
    public static void afterclass(){
        System.out.println("after class");
    }
}
