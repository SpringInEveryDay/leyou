package com.leyou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @ClassName:LeyouResgistryApplication
 * @Description:
 * @author:chenyun
 * @Date:2019/12/20 20:07
 */
//springboot的启动器，其中包含了@ComponentScan包扫描注解、@EnableAutoConfiguration自动配置注解、@SpringBootConfiguration  springboot的注册注解
@SpringBootApplication
//开启eureka注册中心服务的注解
@EnableEurekaServer
public class LeyouResgistryApplication {
    public static void main(String[] args) {
        SpringApplication.run(LeyouResgistryApplication.class,args);
    }

}
