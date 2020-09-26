package com.eci.demo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;

public class AmazonAlkostoWebTest {
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
        WebDriverWait wait = new WebDriverWait(webDriver, 150);
        element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"asv-gclp-balance-widget-desktop\"]/ul/li[1]/span/a")));
        String text = element.getText();
        assertEquals(text.split(" ")[3],"tarjeta");
    }

    @Test
    public void shouldBeCartEmpty() {
        webDriver.get("https://www.alkosto.com/");
        webDriver.manage().window().maximize();
        WebElement element = webDriver.findElement(By.xpath("/html/body/div[1]/div/div[6]/div[5]/div[2]/ul/li/a"));
        element.click();
        WebDriverWait wait = new WebDriverWait(webDriver, 150);
        element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div[7]/div[1]/div/div[1]/h1")));
        //element = webDriver.findElement(By.xpath("/html/body/div[1]/div/div[7]/div[1]/div/div[1]/h1"));
        String text = element.getText();
        assertEquals(text.split(" ")[1],"carrito");
    }

    @Test
    public void shouldUseSearchAlkosto(){
        // Configuración Web inicial
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        WebDriver driver =  new ChromeDriver();
        driver.get("https://www.alkosto.com/");

        // Prueba 1: Barra de Búsqueda
        WebElement elem = driver.findElement(By.xpath("//*[@id=\"search\"]"));
        elem.click();
        elem.sendKeys("Avion");
        elem.submit();
        driver.close();

    }
    @After
    public void close() {
        webDriver.close();
    }
}
