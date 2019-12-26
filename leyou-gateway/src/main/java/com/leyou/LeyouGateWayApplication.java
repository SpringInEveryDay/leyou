package com.leyou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @ClassName:LeyouGateWayApplication
 * @Description:
 * @author:chenyun
 * @Date:2019/12/23 10:29
 */
//加入SpringBoot的自动配置注解
@SpringBootApplication
//开启eureka的客户端
@EnableDiscoveryClient
//开启zuul网关
@EnableZuulProxy
public class LeyouGateWayApplication {
    public static void main(String[] args) {
        SpringApplication.run(LeyouGateWayApplication.class,args);
    }
}
