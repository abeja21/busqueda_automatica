package com.company;

import com.sun.tools.jconsole.JConsoleContext;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Scanner;

public class Main {
private static WebDriver driver;
    public static void main(String[] args)  {

//amazon();
pccomponentes();
        }


public static void amazon(){
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
    for (int i = 2; i <6; i++) {

        try {




            String telefono = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[2]/div/span[3]/div[2]/div[" + i + "]/div/span/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/h2/a/span")).getText();
            String precio = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[2]/div/span[3]/div[2]/div[" + i + "]/div/span/div/div/div[2]/div[2]/div/div[2]/div[1]/div/div[1]/div/div/div/a/span[1]/span[2]/span[1]")).getText();
            System.out.println(telefono);
            System.out.println(precio + "€");
        }catch (Exception e){

        }

    }
}




public static void pccomponentes()  {
    Scanner sc= new Scanner(System.in);
    String exePath = "chromedriver.exe";
    System.setProperty("webdriver.chrome.driver",exePath);
    ChromeOptions options = new ChromeOptions();
    options.addArguments("--start-maximized");
    driver = new ChromeDriver(options);
    driver.get("https://www.pccomponentes.com/smartphone-moviles");
    WebElement element= driver.findElement(By.name("query"));
    System.out.println("Dime el modelo que deseas buscar");
    String modelo=sc.nextLine();
    element.sendKeys(modelo);
    element.sendKeys(Keys.ENTER);

    WebElement boton=driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[1]/div[2]/div/div/div[4]/div/ul/li[1]/a"));
    boton.click();

    for (int i = 2; i <6; i++) {

        try {




            String telefono = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div[2]/div[3]/div/div["+i+"]/article/div/div/header/h3/a")).getText();
            String precio = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div[2]/div[3]/div/div["+i+"]/article/div/div/div[2]/div/span")).getText();
            System.out.println(telefono);
            System.out.println(precio + "€");
        }catch (Exception e){

        }

    }
}
    }

