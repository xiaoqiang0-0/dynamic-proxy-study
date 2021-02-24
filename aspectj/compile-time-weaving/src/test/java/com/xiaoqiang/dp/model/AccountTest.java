package com.xiaoqiang.dp.model;

import org.junit.Test;

public class AccountTest {
    //Compile-Time Weaving
    @Test
    public void pay() {
        System.err.println("===========Compile compile weaving============");

        Account account = new Account();
        account.pay(8);
        account.pay(19);
    }
}
