package com.bruno.cross_browser_testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestAutomationU {
    WebDriver driver;

    @Test
    @Parameters( {"URL", "BrowserType"} )
    public void verifyTAU (String url, String browserType)
    {
        if (browserType.equalsIgnoreCase("Internet Explorer"))
        {
            System.setProperty("webdriver.ie.driver", "/Users/bruno/Projects/TestAutomtionUniversityTestNG/src/driver/IEDriverServer.exe");
            driver = new InternetExplorerDriver();
        }
        else if (browserType.equalsIgnoreCase("Firefox"))
        {
            driver = new FirefoxDriver();
        }
        else if (browserType.equalsIgnoreCase("Chrome"))
        {
            System.setProperty("webdriver.chrome.driver", "/Users/bruno/Projects/TestAutomtionUniversityTestNG/src/driver/chromedriver.exe");
            driver = new ChromeDriver();
        }

        driver.manage().window().maximize();
        driver.get(url);

        System.out.println("\n" + "Open " + browserType);
        System.out.println("   " +  driver.getTitle());
        System.out.println("Close " + browserType + "\n");

        driver.quit();
    }
}
