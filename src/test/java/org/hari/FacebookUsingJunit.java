package org.hari;



import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FacebookUsingJunit extends MasterBase {
	 static WebDriver driver;
	static MasterBase base=new MasterBase();
	@BeforeClass
	public static void beforeClass() {
		 driver= base.getDriver();
		base.loadurl("http://www.facebook.com/");
		base.browserMax();	
	}
	
	@Test
	public void tc0() {
		WebElement txtusername = driver.findElement(By.id("email"));
		base.type(txtusername, "hellojava");
		WebElement txtpassword = driver.findElement(By.id("pass"));
		base.type(txtpassword, "welcome java");
		WebElement btnclick = driver.findElement(By.name("login"));
		base.click(btnclick);
	}
	@AfterClass
	public static void after() {
		base.close();
	}

}
