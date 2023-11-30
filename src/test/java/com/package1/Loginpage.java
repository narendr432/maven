package com.package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Loginpage {

    @Test
     void logintest(){
        System.setProperty("webdriver.chrome.driver","C://Users//user//IdeaProjects//MavenProject//Drivers//chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.facebook.com/");
        driver.findElement(By.name("email")).sendKeys("8297153460");
        driver.findElement(By.name("pass")).sendKeys("narendra123");
        driver.findElement(By.name("login")).click();
        driver.close();

    }
}
