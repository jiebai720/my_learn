package com.bb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by admin on 2016/12/9.
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {

//        System.out.println("aaaa");
//        SpringApplication.run( Application.class, args );

        SpringApplication springApplication = new SpringApplication();
        springApplication.setAddCommandLineProperties(false);
        springApplication.run( Application.class, args );
    }


}
