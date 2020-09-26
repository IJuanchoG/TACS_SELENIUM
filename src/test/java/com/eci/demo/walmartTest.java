package com.eci.demo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class walmartTest {
    private WebDriver webDriver;

    @Before
    public void setUp () {
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        webDriver =  new ChromeDriver();
    }

    //shouldOpenSignIn
    @Test
    public void shouldOpensignIn()  {
        webDriver.get("https://www.walmart.com/");
        webDriver.manage().window().maximize();
        WebElement element = webDriver.findElement(By.xpath("//*[@id=\"hf-account-flyout\"]/span/span/span[2]"));
        element.click();
        WebElement element2 = webDriver.findElement(By.xpath("//*[@id=\"vh-account-menu-root\"]/div[2]/div/a[1]/div/span/div"));
        element2.click();
        String urlGet = "https://www.walmart.com/account/login?tid=0&returnUrl=%2F";
        assertEquals(urlGet, webDriver.getCurrentUrl());
    }

    //shouldWrite-Search-OpenVideo
    @Test
    public void shouldSearchItem () {
        webDriver.get("https://www.walmart.com/");
        webDriver.manage().window().maximize();
        WebElement element = webDriver.findElement(By.xpath("//*[@id=\"global-search-input\"]"));
        element.click();
        element.sendKeys("halloween");
        element.submit();
        String urlGet = "https://www.walmart.com/cp/615760?search_redirect=true&redirect_query=halloween&redirectQuery=halloween";
        assertEquals(urlGet, webDriver.getCurrentUrl());
    }
    @After
    public void close() {
        webDriver.close();
    }
}