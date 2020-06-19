package com.userregistration;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    @Test
    public void givenFirstName_WhenProper_ShouldReturn_True() {
        UserValidater userValidater = new UserValidater();
        boolean result = userValidater.validateFirstName("Shubham");
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenFirstName_WhenNotProper_ShouldReturn_False() {
        UserValidater userValidater = new UserValidater();
        boolean result = userValidater.validateFirstName("Sh");
        Assert.assertEquals(false,result);
    }
    @Test
    public void givenLastName_WhenProper_ShouldReturn_True() {
        UserValidater userValidater = new UserValidater();
        boolean result = userValidater.validateLastName("Pattar");
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenLastName_WhenNotProper_ShouldReturn_False() {
        UserValidater userValidater = new UserValidater();
        boolean result = userValidater.validateLastName("Pa");
        Assert.assertEquals(false,result);
    }
    @Test
    public void givenEmail_WhenProper_ShouldReturn_True() {
        UserValidater userValidater = new UserValidater();
        boolean result = userValidater.validateEmail("abc.xyz@bl.co.in");
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenEmail_WhenNotProper_ShouldReturn_False() {
        UserValidater userValidater = new UserValidater();
        boolean result = userValidater.validateEmail("shubham@.com");
        Assert.assertEquals(false,result);
    }
    @Test
    public void givenPhone_WhenProper_ShouldReturn_True() {
        UserValidater userValidater = new UserValidater();
        boolean result = userValidater.validatePhone("918105215414");
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenPhone_WhenNotProper_ShouldReturn_False() {
        UserValidater userValidater = new UserValidater();
        boolean result = userValidater.validatePhone("8105215414");
        Assert.assertEquals(false,result);
    }
}
