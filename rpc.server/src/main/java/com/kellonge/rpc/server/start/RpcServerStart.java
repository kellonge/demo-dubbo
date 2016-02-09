package com.kellonge.rpc.server.start;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RpcServerStart {
	public static void main(String[] args) throws Exception { 
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "applicationContext.xml", "applicationContext-dubbo.xml" });
		while(true){
			Thread.sleep(1000L);
		}
	}
}
