package org.sriramya;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.DriverManager;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.setProperty("webdriver.chrome.driver","C:\\WebDrivers\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://web.whatsapp.com/");
        waitTillLoad();
        driver.manage().window().maximize();
        try{
            Thread.sleep(30000);
        }
        catch (InterruptedException e){
            System.out.println(e.toString());
        }
        WebElement ele=driver.findElement(By.xpath("//div[@class='x1hx0egp" +
                " x6ikm8r x1odjw0f x6prxxf x1k6rcq7 x1whj5v' and @contenteditable='true' and @role='textbox' " +
                "and @aria-label='Search input textbox' and @tabindex='3']"));
        ele.click();
        ele.sendKeys("8125361825");
        ele.sendKeys(Keys.ENTER);
        for(int i=0;i<10;i++) {
            WebElement element = driver.findElement(By.xpath("//div[@class='x1hx0egp x6ikm8r x1odjw0f x1k6rcq7 x6prxxf' and @contenteditable='true' and @role='textbox' and @aria-label='Type a message']"));
            element.click();
            element.sendKeys("hi");
            element.sendKeys(Keys.ENTER);
        }
        waitTillLoad();
        driver.findElement(By.xpath("//span[@data-icon='menu']")).click();waitTillLoad();
        driver.findElement(By.xpath("//div[@class='_aj-z _aj-t _alxo' and @role='button' and @aria-label='Log out'] ")).click();
        waitTillLoad();
        driver.findElement(By.xpath("//button[@class='x889kno x1a8lsjc xbbxn1n xxbr6pl x1n2onr6 x1rg5ohu xk50ysn x1f6kntn xyesn5m x1z11no5 xjy5m1g x1mnwbp6 x4pb5v6 x178xt8z xm81vs4 xso031l xy80clv x13fuv20 xu3j5b3 x1q0q8m5 x26u7qi x1v8p93f xogb00i x16stqrj x1ftr3km x1hl8ikr xfagghw x9dyr19 x9lcvmn xbtce8p x14v0smp xo8ufso xcjl5na x1k3x3db xuxw1ft xv52azi']")).click();
        waitTillLoad();
        waitTillLoad();
        driver.close();

    }
    private static void waitTillLoad(){
        try{
            Thread.sleep(2000);
        }
        catch (InterruptedException e){
            System.out.println(e.toString());
        }
    }
}
