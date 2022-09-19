package com.jay.spring.boot;

import com.jay.spring.boot.controller.SampleController;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author xiang.wei
 * @create 2018/4/4 11:31
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) throws Exception {
        System.out.println("Application:main=======111111==================");
        SpringApplication app = new SpringApplication(Application.class);
        System.out.println("Application:main===222222222222===========");
        app.setBannerMode(Banner.Mode.OFF);
        app.run(args);
    }
}
