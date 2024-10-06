package org.example;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class e2e {
    public static <list> void main (String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/vanit/OneDrive/Documents/SeleniumFiles/New folder/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://spicejet.com");
        driver.manage().window().maximize();
        //From pune to Kolkata
        driver.findElement(By.cssSelector(".css-1cwyjr8.r-homxoj.r-ubezar.r-10paoce.r-13qz1uu")).sendKeys("Pun");
        driver.findElement(By.xpath("(//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu'])[2]")).sendKeys("Kolkata");
        // Thread.sleep(2000);
        //Departure Date to return Date
        driver.findElement(By.cssSelector(".css-1dbjc4n.r-1awozwy.r-19m6qjp.r-156aje7.r-y47klf.r-1phboty.r-1d6rzhh.r-1pi2tsx.r-1777fci.r-13qz1uu")).click();
        //Select the Passangers
        driver.findElement(By.xpath("(//div[@class='css-76zvg2 css-bfa6kz r-1862ga2 r-1gkfh8e']) [2]")).click();
        int i = 1;
        while (i<5){
            driver.findElement(By.xpath("(//div[@data-testid='Adult-testID-plus-one-cta'])")).click();
            i++;
        }
        driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-y47klf r-1loqt21 r-eu3ka r-1777fci r-1otgn73 r-eafdt9 r-1i6wzkk r-lrvibr r-1aockid']) [2]")).click();
        driver.findElement(By.xpath("//div[@data-testid='home-page-travellers-done-cta']")).click();

        List<WebElement> Options = driver.findElements(By.cssSelector(".css-76zvg2.r-cqee49.r-1enofrn.r-1ozqkpa"));
        System.out.println(Options.size());
        driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-1awozwy r-1loqt21 r-18u37iz r-15d164r r-1otgn73']) [5]")).click();

        //Search the Flight
        driver.findElement(By.xpath("//div[@data-testid='home-page-flight-cta']")).click();
        Assert.assertTrue(driver.findElement(By.xpath("//div[@data-testid='home-page-flight-cta']")).isSelected());
        System.out.println(driver.findElement(By.xpath("//div[@data-testid='home-page-flight-cta']")));
    }
}
