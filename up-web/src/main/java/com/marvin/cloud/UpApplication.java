package com.marvin.cloud;

import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
/**
 *
 * @author wuyujian
 * @date 2020-08-27
 */
@SpringBootApplication
public class UpApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder()
                .bannerMode(Banner.Mode.LOG)
                .sources(UpApplication.class)
                .build()
                .run(args);
    }
}
