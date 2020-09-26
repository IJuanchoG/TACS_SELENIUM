package com.eci.demo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CrunchyrollTest {
    private WebDriver webDriver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        webDriver =  new ChromeDriver();
    }

    @Test
    public void shouldSeeLastNews(){
        webDriver.get("https://www.crunchyroll.com/es");
        webDriver.manage().window().maximize();
        WebElement elem = webDriver.findElement(By.xpath("//*[@id=\"welcome_left\"]/div[2]/h1/a"));
        System.out.println("Info-> "+elem.getText());
    }

    @Test
    public void shouldSeeFirstNew(){
        webDriver.get("https://www.crunchyroll.com/es");
        webDriver.manage().window().maximize();
        WebElement elem = webDriver.findElement(By.xpath("//*[@id=\"welcome_left\"]/div[2]/div[1]/div[1]/div/a"));
        System.out.println("Info-> "+elem.getText());
        elem.click();
    }

    @Test
    public void shouldSeePremiumOptions(){
        webDriver.get("https://www.crunchyroll.com/es");
        webDriver.manage().window().maximize();
        WebElement elem = webDriver.findElement(By.xpath("//*[@id=\"header_try_premium_free\"]"));
        elem.click();
    }

    @After
    public void close() {
        webDriver.close();
    }
}
