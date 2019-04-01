package com.bruno.data_provider_testing;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@Test (dataProvider = "logInData")
public class LogIn1 {
    public void logIn (String email, String password, boolean success)
    {
        System.out.println("Log In Credentials: " + "\n" +
                "  Email = " + email + "\n" +
                "  Password = " + password + "\n" +
                "  Successful Log In = " + success + "\n" );
    }

    @DataProvider
    public Object [] [] logInData ()
    {
        Object [][] data = new Object [3][3];

        data [0][0] = "TestNG@Framework.com";		data [0][1] = "TestNG1234";		data [0][2] = true;
        data [1][0] = "Joe@Doe.com";			    data [1][1] = "DoeDoe34";		data [1][2] = false;
        data [2][0] = "Test@AutomationU.com";		data [2][1] = "TAU1234";		data [2][2] = true;

        return data;
    }
}