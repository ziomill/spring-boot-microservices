package it.millsoft.ms.users.client.test;

import it.millsoft.ms.users.client.IUsersMSClient;
import it.millsoft.ms.users.client.dto.User;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Set;

/**
 * Created by a.benvenuto on 27/03/2017.
 */

@RunWith(SpringRunner.class)
@SpringBootTest(properties = {"feign.hystrix.enabled=false" })
@DirtiesContext
public class UsersMSClient_Test
{
    @Autowired
    private IUsersMSClient client;

    @Before
    public void init()
    {
        String response = client.ping();
        System.out.print(response);
    }

    @Test
    public void getUser_Test()
    {
        try
        {
            String email = "ant.benvenuto@gmail.com";
            String response = client.getUser(email);
            Assert.assertNotNull(response);
        }
        catch(Exception ex)
        {
            Assert.fail(ex.getMessage());
        }
    }

    @Test
    public void getUserAsObject_Test()
    {
        try
        {
            String email = "ant.benvenuto@gmail.com";
            User response = client.getUserAsObject(email);
            Assert.assertNotNull(response);
        }
        catch(Exception ex)
        {
            Assert.fail(ex.getMessage());
        }
    }

    @Test
    public void getUsers_Test()
    {
        try
        {
            String email = "ant.benvenuto@gmail.com";
            User response = client.getUserAsObject(email);

            Set<User> response1 = client.getUsers();
            Assert.assertNotNull(response1);

        }
        catch(Exception ex)
        {
            Assert.fail(ex.getMessage());
        }
    }
}
