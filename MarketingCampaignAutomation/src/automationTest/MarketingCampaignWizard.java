package automationTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MarketingCampaignWizard {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\INDIA\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://216.48.184.249:5274/login");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("testuser@example.com");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Test@123");
        driver.findElement(By.xpath("//button[contains(text(),'Sign in')]")).click();

        Thread.sleep(3000);
        System.out.println("✅ Login Test Completed Successfully. Page Title: " + driver.getTitle());
        driver.quit();
    }
}
