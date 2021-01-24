package com.company;

import com.sun.tools.jconsole.JConsoleContext;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Scanner;

public class Main {
private static WebDriver driver;
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String exePath = "C:\\Users\\Mario Beltran Garcia\\IdeaProjects\\pratica4\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",exePath);
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
        driver.get("http://www.amazon.es");
     WebElement element= driver.findElement(By.id("twotabsearchtextbox"));
     System.out.println("Dime el modelo que deseas buscar");
     String modelo=sc.nextLine();
     element.sendKeys("telefono"+" "+modelo);
    element.submit();
       WebDriverWait waiting= new WebDriverWait(driver,10);

    }
}
