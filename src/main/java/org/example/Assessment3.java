package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.sql.Statement;

public class Assessment3 {
    public static void main (String [] args){
        System.setProperty("webdriver.chrome.driver", "C:/Users/vanit/OneDrive/Documents/SeleniumFiles/New folder/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://rahulshettyacademy.com/loginpagePractise");

        Assessment3 obj = new Assessment3();
        obj.practice1(driver);
    }
    public void practice1 (WebDriver driver){
        driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
        //learning
        driver.findElement(By.id("password")).sendKeys("learning");
        driver.findElement(By.className("checkmark")).click();

        WebElement dropdown =driver.findElement(By.cssSelector("select[data-style='btn-info']"));
        Select S = new Select(dropdown);
        S.selectByValue("consult");

        driver.findElement(By.cssSelector("input[value='user'] ")).click();

    }
}
