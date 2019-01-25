package com.hpi.mysql2kdm.conf;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("oge")
@Data
public class MyConfig {
    private String apiUrl;
    private long fixedDelay;
}
