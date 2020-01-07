package cn.itcast;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * 启动项目
 */
@SpringBootApplication
//这个地方需要引用通用mapper的扫描包
@MapperScan("cn.itcast.mapper")
public class BootDemo {
    public static void main(String[] args) {
        SpringApplication.run(BootDemo.class,args);
    }
}
