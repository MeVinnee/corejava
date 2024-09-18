package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Invoking Browser
        //chrome - ChromeDriver - method methods close get
        //firefox - firefoxDriver - methods close get
        //safari SafariDriver - methods close get
        System.setProperty("Webdriver.chrome.driver", "C:/Users/vanit/OneDrive/Documents/SeleniumFiles/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
    }
}