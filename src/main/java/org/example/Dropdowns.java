package org.example;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Dropdowns {
    public static void main (String [] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/vanit/OneDrive/Documents/SeleniumFiles/New folder/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

//       // StaticDropdown
//            Dropdowns obj = new Dropdowns();
//            obj.staticDropdown(driver);
//
            Dropdowns obj1 = new Dropdowns();
            obj1.updateDropdown(driver);
//
//         // ChormeVersion is Version 129.0.6668.71
//
//           // AutoSuggestive Dropdown
//            Dropdowns obj2 = new Dropdowns();
//            obj2.AutoSuggestiveDropdown(driver);
//
//                Dropdowns obj3 = new Dropdowns();
//                obj3.dynamicDropdown(driver);
//
//            Dropdowns obj4 = new Dropdowns();
//            obj4.checkboxes(driver);
//
//               Dropdowns obj5 = new Dropdowns();
//               obj5.UIElement(driver);


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

//          driver.findElement(By.id("divpaxinfo")).click();
//          Thread.sleep(2000);
//          for (int i=1; i<5; i++){
//              driver.findElement(By.id("hrefIncAdt")).click();
//          }
//          driver.findElement(By.id("hrefIncChd")).click();
//          driver.findElement(By.id("btnclosepaxoption"));
//          System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

    }
    public void AutoSuggestiveDropdown(WebDriver driver) throws InterruptedException {

        driver.findElement(By.id("autosuggest")).sendKeys("ind");
        Thread.sleep(2000);
        List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
        for (WebElement option : options) {

            if (option.getText().equalsIgnoreCase("India")){
                option.click();
                break;
            }
        }
    }
    public void dynamicDropdown(WebDriver driver) throws InterruptedException {
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
        driver.findElement(By.xpath("//a[@value='PNQ']")).click();
        Thread.sleep(3000);
        //This code may not approve
       // driver.findElement(By.xpath("(//a[@value='BLR'])[2]")).click();
        //How to use parent-child relationship locator to identify the object uniquely
        driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='BLR']")).click();

        //Calender Dropdown Handling
        driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
    }


    public void checkboxes(WebDriver driver) throws InterruptedException {

        System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());

        System.out.println(driver.findElement(By.id("ctl00_mainContent_SeniorCitizenDiv")).isSelected());
        driver.findElement(By.id("ctl00_mainContent_SeniorCitizenDiv")).click();
    }
    public void UIElement(WebDriver driver){
        System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
        System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));

        if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1")){
            System.out.println("It's Enable");
            Assert.assertTrue(true);
        }else {
            Assert.assertTrue(false);
        }

    }
}
