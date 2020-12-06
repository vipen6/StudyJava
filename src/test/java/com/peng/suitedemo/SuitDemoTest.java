package com.peng.suitedemo;

import com.peng.testcase.BuyTest;
import com.peng.testcase.LoginTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        LoginTest.class,
        BuyTest.class
})
public class SuitDemoTest {
}
