package org.example;

//import com.sun.org.apache.bcel.internal.generic.SWAP;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
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
        driver.quit();



        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

       //** IncrementOperators

//      //*** AllOperators inc = new AllOperators();
//        inc.incrementOperators();
//
//        //** DecrementOperators
//        AllOperators dec = new AllOperators();
//        dec.decrementOperators();
//
//        //inc & dec Operators
//        AllOperators incdec = new AllOperators();
//        incdec.incdecoperators();
//
//        AllOperators swapValue = new AllOperators();
//        swapValue.swap();
//
       // IFElse ch1 = new IFElse();
       // ch1.challenge1();

       // IFElse ch2 = new IFElse();
      //  ch2.challenge3();

       // IFElse egwhileloop = new IFElse();
       // egwhileloop.whileloop();
//
//        IFElse ch4 = new IFElse();
//        ch4.challenge4();

//        IFElse ch5 = new IFElse();
//        ch5.challenge5();

//         IFElse ch6 = new IFElse();
//         ch6.challenge6();
//        QuizandFacts ex1 = new QuizandFacts();
//        ex1.Swich();
//
//            Arrays Pr1 = new Arrays();
//            Pr1.practice1();

//            Arrays pr2 = new Arrays();
//            pr2.Practice2();
//
//            Arrays pr3 = new Arrays();
//            pr3.Practice3();
    }
}