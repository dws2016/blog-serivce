package org.study.robot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author dongws
 * @date 2018/7/29.
 * @description
 */
@SpringBootApplication
@EnableDiscoveryClient
public class RobotApplication {

    public static void main(String[] args) {
        SpringApplication.run(RobotApplication.class,args);
    }
}
