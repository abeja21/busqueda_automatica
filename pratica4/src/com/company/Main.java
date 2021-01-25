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
        String exePath = "chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",exePath);
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
        driver.get("https://www.amazon.es/gp/browse.html?node=931491031&ref_=nav_em__tele_0_2_13_3");
     WebElement element= driver.findElement(By.id("twotabsearchtextbox"));
     System.out.println("Dime el modelo que deseas buscar");
     String modelo=sc.nextLine();
     element.sendKeys(modelo);
    element.submit();
        System.out.println("dime la cantidad de modelos quiere que imprima");
        int cantidad=2;

  driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[2]/div/span[3]/div[2]/div["+cantidad+"]"+"/div/span/div/div/div[4]/div/div/div/a/span/span[2]/span[1]"));
            System.out.println(1+"--"+driver.getTitle());
driver.quit();
        }



    }

