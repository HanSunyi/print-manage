package com.wuniu.printmanage.config;

import org.springframework.context.annotation.Configuration;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author Yan
 */
@Configuration
@MapperScan(basePackages = "com.wuniu.printmanage.mapper")
public class MybatisConfig {
}
