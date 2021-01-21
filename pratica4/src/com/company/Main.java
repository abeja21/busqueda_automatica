package com.company;

import com.sun.tools.jconsole.JConsoleContext;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Main {
private static WebDriver driver;
    public static void main(String[] args) {
        String exePath = "C:\\Users\\angel\\IdeaProjects\\pratica4\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",exePath);
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
        driver.get("http://www.google.es");
     WebElement element= driver.findElement(By.name("q"));
     element.sendKeys("amazon");
    element.submit();
       WebDriverWait waiting= new WebDriverWait(driver,10);

    }
}
