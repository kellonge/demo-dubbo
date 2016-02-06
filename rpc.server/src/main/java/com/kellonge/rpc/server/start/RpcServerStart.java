package com.kellonge.rpc.server.start;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RpcServerStart {
	public static void main(String[] args) throws Exception {
		System.out.println(1);
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "applicationContext.xml", "applicationContext-dubbo.xml" });
		System.in.read();
	}
}
