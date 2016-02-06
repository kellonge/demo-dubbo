package com.kellonge.rpc.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alibaba.dubbo.config.annotation.Reference;
import com.kellonge.rpc.service.demo.DemoService;

public class RpcCilentStart {

	@Reference
	static DemoService demoService;

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext*.xml");

		DemoService demoService = (DemoService) context.getBean("demoService");
		while (true) {
			try {
				Thread.sleep(1000);
				System.out.println("begine invoke");
				System.out.println(demoService.getDate());

			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}
