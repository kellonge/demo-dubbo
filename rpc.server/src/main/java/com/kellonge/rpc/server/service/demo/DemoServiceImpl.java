package com.kellonge.rpc.server.service.demo;

import java.util.Date;

import com.alibaba.dubbo.config.annotation.Service;
import com.kellonge.rpc.service.demo.DemoService;

@Service(version = "1.0")
public class DemoServiceImpl implements DemoService {

	public void print(String name) {
		System.out.println("hello" + name);
	}

	public String getDate() {
		return new Date().toString();
	}

}
