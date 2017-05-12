package it.millsoft.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by a.benvenuto on 23/03/2017.
 */

@EnableEurekaServer
@SpringBootApplication
public class Application {

    public static void main(String[] args)
    {
        SpringApplication.run(Application.class,args);
    }
}
