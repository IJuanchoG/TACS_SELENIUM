package com.eci.demo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class YouTubeTest {
    private WebDriver webDriver;

    @Before
    public void setUp () {
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        webDriver =  new ChromeDriver();
    }

    //shouldOpenTendences
    @Test
    public void shouldOpenTendences () {
        webDriver.get("https://www.youtube.com");
        webDriver.manage().window().maximize();
        WebElement element = webDriver.findElement(By.xpath("/html/body/ytd-app/div/app-drawer/div[2]/div/div[2]/div[2]/ytd-guide-renderer/div[1]/ytd-guide-section-renderer[1]/div/ytd-guide-entry-renderer[2]/a"));
        element.click();
        String urlGet = "https://www.youtube.com/feed/trending";
        assertEquals(urlGet, webDriver.getCurrentUrl());
    }

    //shouldWrite-Search-OpenVideo
    @Test
    public void shouldOpenVideotoSearch () {
        webDriver.get("https://www.youtube.com");
        webDriver.manage().window().maximize();
        WebElement element = webDriver.findElement(By.xpath("/html/body/ytd-app/div/div/ytd-masthead/div[3]/div[2]/ytd-searchbox/form/div/div[1]/input"));
        element.click();
        element.sendKeys("Top 50 Colombia");
        element.submit();
        element = webDriver.findElement(By.xpath("/html/body/ytd-app/div/ytd-page-manager/ytd-search/div[1]/ytd-two-column-search-results-renderer/div/ytd-section-list-renderer/div[2]/ytd-item-section-renderer/div[3]/ytd-playlist-renderer[1]/ytd-playlist-thumbnail/a/div[2]/ytd-thumbnail-overlay-side-panel-renderer"));
        element.click();
        System.out.println(webDriver.getCurrentUrl());
        String urlGet = "https://www.youtube.com/watch?v=pK060iUFWXg&list=PLDzVECoc2lpTyRIa1w_mtm3j_qgz21AlI";
        assertEquals(urlGet, webDriver.getCurrentUrl());
    }

    @After
    public void close() {
        webDriver.close();
    }
}
