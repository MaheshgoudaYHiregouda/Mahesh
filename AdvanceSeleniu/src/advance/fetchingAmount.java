package advance;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class fetchingAmount {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://www.flipkart.com/");
		
		
		Flip_pom page =new Flip_pom(driver);
		
		page.getAvoidpopup().click();
		//driver.findElement(By.xpath("//button[text()=\"✕\"]")).click();
		//driver.findElement(By.xpath("//input[@class=\"_2IX_2- VJZDxU\"]")).sendKeys("8546862502");
		//driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("******");
		//driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2HKlqd _3AWRsL\"]")).submit();
		Thread.sleep(2000);
		page.getClick_product().click();
		//driver.findElement(By.xpath("//div[text()='Mobiles']")).click();
		Thread.sleep(3000);
		
		WebElement dropdown = page.getDropdown();
		//WebElement dropdown = driver.findElement(By.xpath("(//select[@class=\"_2YxCDZ\"])[2]"));
		dropdown.click();
		
		Select select = new Select(dropdown);
		Thread.sleep(2000);
		select.selectByIndex(2);
		WebElement element = page.getSlectprice();
		//WebElement element = driver.findElement(By.xpath("//option[@value=\"20000\"]"));
		String amount = element.getText().substring(1).replace(",", "");
		System.out.println(amount);
		//String subs = amount.substring(0);
		int val = Integer.parseInt(amount);
		if (val<=20000) {
			System.out.println("product is inn range");
		}else {
			System.out.println("test case failed");
		}
		
	}

}
