package com.aop.service.Impl;

import com.aop.service.IAccountservice;

/**
 * @author: cdf
 * @create: 2020-02-20 01:09
 **/
public class AccountService implements IAccountservice {
	public void saveAccount() {
		System.out.println("执行了保存账户");
	}

	public void updateAccount(int i) {
		System.out.println("执行了更新账户"+i);
	}

	public int deleteAccount() {
		System.out.println("执行了删除账户");
		return 0;
	}
}
