package it.millsoft.ms.users.client;

import it.millsoft.ms.users.client.dto.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Set;

/**
 * Created by a.benvenuto on 24/03/2017.
 */

@FeignClient("users-microservice")
public interface IUsersMSClient
{

    @RequestMapping(method = RequestMethod.GET, value = "/getUser")
    String getUser(@RequestParam("email") String email);

    @RequestMapping(method = RequestMethod.GET, value = "/getUser")
    User getUserAsObject(@RequestParam("email") String email);

    @RequestMapping(method = RequestMethod.GET, value = "/getUsers")
    Set<User> getUsers();

    @RequestMapping(method = RequestMethod.GET, value = "/ping")
    String ping();
}
