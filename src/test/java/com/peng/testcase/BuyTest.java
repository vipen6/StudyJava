package com.peng.testcase;

import org.junit.Test;

public class BuyTest extends BaseTest{
    @Test
    public void buy(){
        if(datamap.get("login").equals("登陆成功")){
            System.out.println("登陆成功，可以购买");
        }else {
            System.out.println("登陆失败，需要登陆才能购买");
        }
    }
}
