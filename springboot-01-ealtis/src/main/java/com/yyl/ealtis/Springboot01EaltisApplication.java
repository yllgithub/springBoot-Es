package com.yyl.ealtis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 默认两种技术 支持elastic
 * 1、Jest 默认不生效  urs
 *      需要导入Jest包
 * 2、Spring Data elasticearch clusterNodes clusterName 两个配置
 *    elasticsearchTemplate 模板操作
 *    elasticsearchRepository 操作es
 */
@SpringBootApplication
public class Springboot01EaltisApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot01EaltisApplication.class, args);
    }
}
