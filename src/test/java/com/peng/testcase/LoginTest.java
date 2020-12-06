package com.peng.testcase;

import org.junit.Test;

public class LoginTest extends BaseTest{
    @Test
    public void login(){
        datamap.put("login","登陆成功");
        System.out.println(datamap.get("login"));
    }
}
