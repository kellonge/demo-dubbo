package com.kellonge.rpc.service.demo;


public interface DemoService {

	/**
	 * 打印传入的值
	 */
	public void print(String name);
	
	/**
	 * 返回当前时间
	 * @return
	 */
	public String getDate();
}
