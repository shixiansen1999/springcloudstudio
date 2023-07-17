package org.example.sbx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author : sbx
 * @Classname : SentinelMainApp8401
 * @Description : TODO
 * @Date : 2023/7/13 17:14
 */
@SpringBootApplication
@EnableDiscoveryClient
public class SentinelMainApp8401 {
    public static void main(String[] args) {
        SpringApplication.run(SentinelMainApp8401.class, args);
    }
}
