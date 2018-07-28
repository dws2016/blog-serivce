package org.study.plan;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@SpringBootApplication
@Slf4j
@EnableDiscoveryClient
public class PlanApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlanApplication.class,args);
		log.info("-----------------项目已经成功启动--------------------");
	}
}
