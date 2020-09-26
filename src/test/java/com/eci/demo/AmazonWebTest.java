package com.eci.demo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class AmazonWebTest {
    private WebDriver webDriver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        webDriver =  new ChromeDriver();
    }
    //shouldBeAddToCart
    @Test
    public void shouldShowGiftCards() {
        webDriver.get("https://www.amazon.com/");
        webDriver.manage().window().maximize();
        WebElement element = webDriver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[3]"));
        element.click();
        element = webDriver.findElement(By.xpath("//*[@id=\"asv-gclp-balance-widget-desktop\"]/ul/li[1]/span/a"));
        String text = element.getText();
        assertEquals(text.split(" ")[3],"tarjeta");
    }


    /*@After
    public void close() {
        webDriver.close();
    }*/
}
