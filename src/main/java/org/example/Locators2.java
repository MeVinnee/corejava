package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.junit.Assert.assertEquals;

public class Locators2 {
    public static void main (String[]args) throws InterruptedException {

        String name = "Vanita";
        System.setProperty("webdriver.chrome.driver", "C:/Users/vanit/OneDrive/Documents/SeleniumFiles/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String password = getPassword(driver);

        driver.get("https://rahulshettyacademy.com/locatorspractice");
        driver.findElement(By.id("inputUsername")).sendKeys(name);
        driver.findElement(By.name("inputPassword")).sendKeys(password);
        driver.findElement(By.className("submit")).click();
        Thread.sleep(1000);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        System.out.println(driver.findElement(By.tagName("p")).getText());
        assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
        assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(), "Hello "+name+",");
        driver.findElement(By.xpath("//button[text()='Log Out']")).click();
        driver.close();

    }
    public static String getPassword(WebDriver driver) throws InterruptedException {
        driver.get("https://rahulshettyacademy.com/locatorspractice");
        driver.findElement(By.linkText("Forgot your password?")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();

        String passwordText = driver.findElement(By.cssSelector("form p")).getText();
        //Please use temporary password 'rahulshettyacademy' to Login.
        String[] passwordArray1 = passwordText.split("'");
        //Please use temporary password [0]
        //rahulshettyacademy' to Login. [1]
//        String [] passwordArray2 = passwordArray1 [1].split("'");
//        String password = passwordArray2 [0]
          String password;
          password = passwordArray1 [1].split("'") [0];

        return password;
    }
}
