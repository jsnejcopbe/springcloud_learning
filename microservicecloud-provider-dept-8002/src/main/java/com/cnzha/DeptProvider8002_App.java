package com.cnzha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
//启动eureka客户端
@EnableEurekaClient
//启动服务发现
@EnableDiscoveryClient
public class DeptProvider8002_App
{
	public static void main(String[] args)
	{
		SpringApplication.run(DeptProvider8002_App.class, args);
	}
}
