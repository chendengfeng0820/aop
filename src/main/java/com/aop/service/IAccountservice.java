package com.aop.service;

public interface IAccountservice {
	/**
	 * 模拟保存账户
	 */
	void saveAccount();


	/**
	 * 模拟更新账户
	 */
	void updateAccount(int i);


	/**
	 * 模拟删除账户
	 */
	int deleteAccount();
}
