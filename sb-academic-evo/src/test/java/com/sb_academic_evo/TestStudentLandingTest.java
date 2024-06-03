package com.sb_academic_evo;

import java.util.Map;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
@Disabled("Due to Testing Purpose")
@Deprecated()
@DisplayName("Verify the Student Landing Page Working or Not")
class TestStudentLandingTest {

	private static WebDriver driver;
	private static Map<String, Object> vars;
	JavascriptExecutor js;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		driver = new ChromeDriver();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		driver.close();
	}

//	@Test
//	@Disabled("Due to Testing Purpose")
//	@Deprecated()
//	@DisplayName("Verify the Student Landing Page Working or Not")
//	public void studentLanding() throws InterruptedException {
//		driver.get("http://localhost:3000/");
//		driver.manage().window().maximize();
//		{
//			WebElement element = driver.findElement(By.cssSelector(".MuiSvgIcon-root"));
//			Actions builder = new Actions(driver);
//			builder.moveToElement(element).perform();
//		}
//		{
//			WebElement element = driver.findElement(By.tagName("body"));
//			Actions builder = new Actions(driver);
//			builder.moveToElement(element, 0, 0).perform();
//		}
//		driver.findElement(By.cssSelector(".MuiSvgIcon-root")).click();
//		driver.findElement(By.cssSelector(".MuiButtonBase-root:nth-child(3) > .MuiTypography-root")).click();
//		driver.findElement(By.id(":r3:")).click();
//		driver.findElement(By.id(":r3:")).sendKeys("thavasinarayanan@gmail.com");
//		driver.findElement(By.id(":r5:")).click();
//		driver.findElement(By.id(":r5:")).sendKeys("$MHAPOY@8$");
//		Thread.sleep(2000);
//		driver.findElement(By.cssSelector(".MuiButtonBase-root")).click();
//		Thread.sleep(2000);
//		{
//			WebElement element = driver.findElement(By.cssSelector(".MuiAvatar-img"));
//			Actions builder = new Actions(driver);
//			builder.moveToElement(element).perform();
//			Thread.sleep(2000);
//		}
//		{
//			WebElement element = driver.findElement(By.tagName("body"));
//			Actions builder = new Actions(driver);
//			builder.moveToElement(element, 0, 0).perform();
//			Thread.sleep(2000);
//		}
//		{
//			WebElement element = driver.findElement(By.cssSelector(".MuiAvatar-img"));
//			Actions builder = new Actions(driver);
//			builder.moveToElement(element).perform();
//			Thread.sleep(2000);
//		}
//		driver.findElement(By.cssSelector(".MuiAvatar-img")).click();
//		{
//			WebElement element = driver.findElement(By.tagName("body"));
//			Actions builder = new Actions(driver);
//			builder.moveToElement(element, 0, 0).perform();
//			Thread.sleep(2000);
//		}
//		driver.findElement(By.xpath("(//div[@id=\'menu-appbar\']/div[3]/ul/li/p)[3]")).click();
//		{
//			WebElement element = driver.findElement(By.cssSelector(".MuiAvatar-img"));
//			Actions builder = new Actions(driver);
//			builder.moveToElement(element).perform();
//			Thread.sleep(2000);
//		}
//		driver.findElement(By.cssSelector(".MuiAvatar-img")).click();
//		{
//			WebElement element = driver.findElement(By.tagName("body"));
//			Actions builder = new Actions(driver);
//			builder.moveToElement(element, 0, 0).perform();
//			Thread.sleep(2000);
//		}
//		driver.findElement(By.xpath("(//div[@id=\'menu-appbar\']/div[3]/ul/li[2]/p)[2]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.cssSelector(".MuiButton-text:nth-child(1)")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.cssSelector(".MuiButton-root:nth-child(2)")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.linkText("Back")).click();
//		{
//			WebElement element = driver.findElement(By.cssSelector(".MuiAvatar-img"));
//			Actions builder = new Actions(driver);
//			builder.moveToElement(element).perform();
//			Thread.sleep(2000);
//		}
//		{
//			WebElement element = driver.findElement(By.tagName("body"));
//			Actions builder = new Actions(driver);
//			builder.moveToElement(element, 0, 0).perform();
//		}
//		driver.findElement(By.cssSelector(".MuiAvatar-img")).click();
//		driver.findElement(By.cssSelector(".MuiButtonBase-root:nth-child(3) > .MuiTypography-root")).click();
//	}

}
