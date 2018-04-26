package tests;

import cucumber.api.java.en.Given;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Ali on 03/12/2017.
 */
public class FirstAttemptTest {

    WebDriver driver;



    @Given("^i go to google$")
    public void i_go_to_google() throws Throwable {
//        System.setProperty("webdriver.gecko.driver","C:\\Selenium\\selenium3\\Drivers\\geckodriver-v0.19.0-win64\\geckodriver.exe");
//        driver = new FirefoxDriver();
        driver =  new ChromeDriver();
        driver.get("http://www.google.com");
        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("se bikes");
        driver.findElement(By.name("q")).submit();
//        driver.findElement(By.name("q")).clear();
//        driver.findElement(By.name("q")).sendKeys("se Bikes");
//        driver.findElement(By.name("q")).submit();
        driver.close();
    }







//    @After
//    public void tearDown(){
//        driver.close();
//    }

}
