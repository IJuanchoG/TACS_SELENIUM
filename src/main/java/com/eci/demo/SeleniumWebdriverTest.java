package com.eci.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWebdriverTest {

    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        WebDriver driver =  new ChromeDriver();
        driver.get("https://www.wikipedia.org/");
        WebElement elem = driver.findElement(By.xpath("//*[@id=\"searchInput\"]"));
        elem.click();
        elem.sendKeys("Tensei Shitara Slime Datta Ken");
        elem.submit();
        String text = driver.findElement(By.xpath("//*[@id=\"firstHeading\"]")).getText();
        System.out.println("Resultado --->: "+text);
        driver.close();



        //driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
    }
}


