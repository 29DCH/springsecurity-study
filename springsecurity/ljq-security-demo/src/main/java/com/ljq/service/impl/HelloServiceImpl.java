package com.ljq.service.impl;

import org.springframework.stereotype.Service;

import com.ljq.service.HelloService;

/**
 * @author ljq
 *
 */
@Service
public class HelloServiceImpl implements HelloService {

	@Override
	public String greeting(String name) {
		System.out.println("greeting");
		return "hello "+name;
	}

}
