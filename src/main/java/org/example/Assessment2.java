package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.sql.Driver;

public class Assessment2 {
    public static void main( String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/Users/vanit/OneDrive/Documents/SeleniumFiles/New folder/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/angularpractice/");

            driver.findElement(By.cssSelector("input[name='name']")).sendKeys("Vanita");
            driver.findElement(By.cssSelector("input[name='email']")).sendKeys("vanita.patil@outlook.com");
            driver.findElement(By.id("exampleInputPassword1")).sendKeys("Test123");
            driver.findElement(By.id("exampleCheck1")).click();
            WebElement staticDropdown = driver.findElement(By.id("exampleFormControlSelect1"));
            Select dropdown = new Select(staticDropdown);
            dropdown.selectByVisibleText("Female");
            System.out.println(dropdown.getFirstSelectedOption().getText());
            driver.findElement(By.id("inlineRadio1")).click();
            driver.findElement(By.cssSelector("input[type='date']")).sendKeys("21-07-1991");
            driver.findElement(By.cssSelector("input[value='Submit']")).click();
            System.out.println(driver.findElement(By.cssSelector(".alert.alert-success.alert-dismissible")).getText());
    }
}
