import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

class Locators2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/vanit/OneDrive/Documents/SeleniumFiles/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/locatorspractice");
        driver.findElement(By.id("inputUsername")).sendKeys("rahul");
        driver.findElement(By.name("inputPassword")).sendKeys("rahul");
        driver.findElement(By.className("submit")).click();
        System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
        driver.findElement(By.linkText("Forgot your password?")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Vanita");
        driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("vanita.xyz@gmail.com");
        driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
        driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("vanita.patil@gmail.com");
        driver.findElement(By.xpath("//form/input[3]")).sendKeys("00000000");
        driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
        System.out.println(driver.findElement(By.cssSelector("form p")).getText());
        driver.findElement(By.cssSelector(".go-to-login-btn")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("inputUsername")).sendKeys("Vanita");
        driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
        driver.findElement(By.id("chkboxOne")).click();
        driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
        driver.quit();
    }
}