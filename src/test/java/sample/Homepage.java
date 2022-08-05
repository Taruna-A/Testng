package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Homepage {
	WebDriver driver;

	@BeforeClass(groups = { "smoke" })
	public void beforeClass() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.demoblaze.com/index.html");

	}

	@Test(groups = { "smoke" })
	public void z() {
		System.out.println(driver.getTitle());

	}

	@Test(groups = { "smoke" })
	public void gettext() {
		System.out.println(driver.findElement(By.xpath("//*[@id='fotcont']/div[2]/div/div/p[1]")).getText());

	}

	@Test(groups = { "regression" })
	public void clickonsigin() {
		driver.findElement(By.id("signin2")).click();
	}

	@Test(groups = { "smoke" })
	public void geturl() {
		System.out.println(driver.getCurrentUrl());

	}

	@Test(groups = { "smoke" })
	@Parameters({ "username", "password" })

	public void login(String username, String password) {
		driver.findElement(By.id("login2")).click();
		driver.findElement(By.id("loginusername")).sendKeys(username);
		driver.findElement(By.id("loginpassword")).sendKeys(password);
	}

	@AfterClass
	public void afterClass() {
		driver.close();

	}
}
