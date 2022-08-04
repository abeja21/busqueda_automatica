package com.company;

import com.sun.tools.jconsole.JConsoleContext;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
private static WebDriver driver;
    public static void main(String[] args)  {
        Scanner sc= new Scanner(System.in);
        System.out.println("dime la marca y el modelo de telefono deseas bucar");
        String modelo=sc.nextLine();
amazon(modelo);
pccomponentes(modelo);
        }


public static void amazon(String modelo){
    Scanner sc= new Scanner(System.in);
    String exePath = "chromedriver.exe";
    System.setProperty("webdriver.chrome.driver",exePath);
    ChromeOptions options = new ChromeOptions();
    options.addArguments("--start-maximized");
    driver = new ChromeDriver(options);
    driver.get("https://www.amazon.es/gp/browse.html?node=931491031&ref_=nav_em__tele_0_2_13_3");
    WebElement element= driver.findElement(By.id("twotabsearchtextbox"));

    element.sendKeys(modelo);
    element.submit();
    System.out.println("--------AMAZON--------------");
    for (int i = 2; i <8; i++) {

        try {

sdasdasd


            String telefono = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[2]/div/span[3]/div[2]/div[" + i + "]/div/span/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/h2/a/span")).getText();
            String precio = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[2]/div/span[3]/div[2]/div[" + i + "]/div/span/div/div/div[2]/div[2]/div/div[2]/div[1]/div/div[1]/div/div/div/a/span[1]/span[2]/span[1]")).getText();
            System.out.println(telefono);
            System.out.println(precio + "€");
            guardaDatos(telefono,precio);
        }catch (Exception e){

        }

    }
    System.out.println("----------------------------");
driver.quit();
}

public static void pccomponentes(String modelo)  {
    Scanner sc= new Scanner(System.in);
    String exePath = "chromedriver.exe";
    System.setProperty("webdriver.chrome.driver",exePath);
    ChromeOptions options = new ChromeOptions();
    options.addArguments("--start-maximized");
    driver = new ChromeDriver(options);
    driver.get("https://www.pccomponentes.com/smartphone-moviles");
    WebElement element= driver.findElement(By.name("query"));
    try {
        Thread.sleep(2000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    element.sendKeys(modelo);
    element.sendKeys(Keys.ENTER);



    WebElement boton=driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[1]/div[2]/div/div/div[4]/div/ul/li[1]/a"));
    boton.click();
    try {
        Thread.sleep(2000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    System.out.println("--------PCCOMPONENTES--------------");
    for (int i = 2; i <8; i++) {

        try {
            String telefono = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div[2]/div[3]/div/div["+i+"]/article/div/div/header/h3/a")).getText();
            String precio = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div[2]/div[3]/div/div["+i+"]/article/div/div/div[2]/div/span")).getText();
            System.out.println(telefono);
            System.out.println(precio + "€");
            guardaDatos(telefono,precio);
        }catch (Exception e){

        }

    }
    System.out.println("-----------------------------------");
    driver.quit();
}

public static void guardaDatos(String modelo,String precio) {
    try {
        FileWriter fichero = new FileWriter("guardaprecios.txt",true);
        PrintWriter pw = new PrintWriter(fichero);
pw.println(modelo);
pw.println(precio);
pw.close();
    } catch (IOException e) {
        e.printStackTrace();
    }
}

    }
    
