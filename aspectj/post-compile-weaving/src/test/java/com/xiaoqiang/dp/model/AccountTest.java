package com.xiaoqiang.dp.model;

import org.junit.Test;

public class AccountTest {
    //Post-Compile Weaving
    @Test
    public void pay() {
        System.err.println("===========Post compile weaving============");
        Account account = new Account();
        account.pay(8);
        account.pay(19);
    }
}
