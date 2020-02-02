package com.youdozi.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableDiscoveryClient
@EnableConfigServer
public class SpringBootCloudConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCloudConfigServerApplication.class, args);
	}

}
