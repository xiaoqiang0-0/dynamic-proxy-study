package com.xiaoqiang.dp.service;

import com.xiaoqiang.dp.model.Account;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class AccountService {

    private final Map<Integer, Account> reposistory = new ConcurrentHashMap<>();

    public Account getAccountInfo() {
        return new Account();
    }

    public void recharge(int id, int amount) {
        Account account = reposistory.get(id);
        account.setBalance(account.getBalance() + amount);
    }

    public void pay(int id, int price){
        Account account = reposistory.get(id);
        account.pay(price);
    }
}
