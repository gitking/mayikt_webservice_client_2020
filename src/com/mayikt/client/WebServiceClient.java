package com.mayikt.client;

import com.mayikt.service.UserService;
import com.mayikt.service.UserServiceService;

public class WebServiceClient {
	public static void main(String[] args) {
		UserServiceService userServiceService = new UserServiceService();
		UserService userService = userServiceService.getUserServicePort();
		String result = userService.getUser(1001);
		System.out.println("WebService客户端调用成功:" + result);
	}
}
