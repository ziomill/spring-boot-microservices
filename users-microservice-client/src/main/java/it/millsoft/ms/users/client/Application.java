package it.millsoft.ms.users.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * Created by a.benvenuto on 27/03/2017.
 */

@SpringBootApplication
@EnableFeignClients
public class Application
{
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
