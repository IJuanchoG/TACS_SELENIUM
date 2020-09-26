package com.eci.demo;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import static org.junit.Assert.assertEquals;

public class EscuelaIngTest {
    private WebDriver webDriver;

    @Before
    public void setUp () {
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        webDriver =  new ChromeDriver();
    }

    @Test
    public void writeFormInformationMaster(){
        webDriver.get("https://www.escuelaing.edu.co/es/");
        webDriver.manage().window().maximize();
        WebElement element = webDriver.findElement(By.xpath("/html/body/header/div/div/div[2]/nav[2]/ul/li[1]/span/span"));
        element.click();
        WebElement elementMaster = webDriver.findElement(By.xpath("/html/body/header/div/div/div[2]/nav[2]/ul/li[1]/div/div[1]/div/nav[3]/ul/li[5]/a"));
        elementMaster.click();
        WebElement solicitaInfo = webDriver.findElement(By.xpath("/html/body/div[1]/div/div/div/a[2]"));
        solicitaInfo.click();
        //Escribir en inputs form
        webDriver.findElement(By.xpath("//*[@id=\"id_first_name\"]")).sendKeys("Daniel Felipe");
        webDriver.findElement(By.xpath("//*[@id=\"id_last_name\"]")).sendKeys("Alfonso Bueno");
        webDriver.findElement(By.xpath("//*[@id=\"id_email1\"]")).sendKeys("daniel.alfonso@gmail.com");
        webDriver.findElement(By.xpath("//*[@id=\"id_phone_mobile\"]")).sendKeys("3193979144");
        //select
        Select selectCity =  new Select(webDriver.findElement(By.xpath("//*[@id=\"id_d_ciudad_c\"]")));
        selectCity.selectByVisibleText("MEDELLIN");
        //Select
        Select documentType = new Select(webDriver.findElement(By.xpath("//*[@id=\"id_d_tipo_identificacion_c\"]")));
        documentType.selectByVisibleText("Cedula de Ciudadania");
        webDriver.findElement(By.xpath("//*[@id=\"id_d_identificacion_c\"]")).sendKeys("10192547985");
        String urlTest = "https://www.escuelaing.edu.co/es/programas/maestria-en-informatica/#scrolling-form";
        assertEquals(urlTest, webDriver.getCurrentUrl());
    }

    @Test
    public void shouldPlayVideoCampus(){
        webDriver.get("https://www.escuelaing.edu.co/es/");
        webDriver.manage().window().maximize();
        WebElement campus = webDriver.findElement(By.xpath("/html/body/header/div/div/div[2]/nav[2]/ul/li[2]/a/span"));
        campus.click();
        webDriver.findElement(By.xpath("/html/body/div/div/main/div[1]/div/div[1]/div/p")).click();
        String urlTest = "https://www.escuelaing.edu.co/es/campus/";
        assertEquals(urlTest, webDriver.getCurrentUrl());

    }


    @After
    public void close() {
        webDriver.close();
    }


}
