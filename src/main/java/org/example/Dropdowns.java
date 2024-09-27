package org.example;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdowns {
    public static void main (String [] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/vanit/OneDrive/Documents/SeleniumFiles/New folder/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        //StaticDropdown
//        Dropdowns obj = new Dropdowns();
//        obj.staticDropdown(driver);
        Dropdowns obj1 = new Dropdowns();
        obj1.updateDropdown(driver);
//      ChormeVersion is Version 129.0.6668.71
    }
    public void staticDropdown(WebDriver driver){

        WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        Select dropdown = new Select(staticDropdown);
        dropdown.selectByIndex(3);
        System.out.println(dropdown.getFirstSelectedOption().getText());
        dropdown.selectByVisibleText("AED");
        System.out.println(dropdown.getFirstSelectedOption().getText());
        dropdown.selectByValue("INR");
        System.out.println(dropdown.getFirstSelectedOption().getText());
        driver.close();
    } public void updateDropdown(WebDriver driver) throws InterruptedException {

        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(2000);
        int i = 1;
        while (i<5){
            driver.findElement(By.id("hrefIncAdt")).click();
            i++;
        }
        driver.findElement(By.id("hrefIncChd")).click();
        driver.findElement(By.id("btnclosepaxoption"));
        driver.close();
    }
}
