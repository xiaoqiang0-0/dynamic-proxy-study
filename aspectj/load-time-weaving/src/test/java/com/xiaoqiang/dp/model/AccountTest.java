package com.xiaoqiang.dp.model;

import org.junit.Test;

public class AccountTest {
    //Compile-Time Weaving
    //
    //-javaagent:/Users/hongjie/.m2/repository/org/aspectj/aspectjweaver/1.9.6/aspectjweaver-1.9.6.jar
    //
    @Test
    public void pay() {
        System.err.println("===========Load time weaving============");

        Account account = new Account();
        account.pay(8);
        account.pay(19);
    }
}
