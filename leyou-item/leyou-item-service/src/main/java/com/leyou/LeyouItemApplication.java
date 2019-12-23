package com.leyou;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName:LeyouItemApplication
 * @Description:
 * @author:chenyun
 * @Date:2019/12/23 17:09
 */
//springboot启动类，其中包含了@EnableAutoConfiguration  @SpringBootConfiguration  @ComponentScan
@SpringBootApplication
//eureka的客户端启动注解
@EnableDiscoveryClient
public class LeyouItemApplication {
}
