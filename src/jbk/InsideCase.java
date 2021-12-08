package jbk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class InsideCase {
	WebDriver driver = null;
	@BeforeTest
    public void login() {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe"); 
		driver =  new ChromeDriver();
	    driver.get( "file:///E:/Selenium%20Softwares/Offline%20Website/Offline%20Website/index.html");
	    driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
	    driver.findElement(By.id("password")).sendKeys("123456");
	    driver.findElement(By.xpath("/html/body/div/div[2]/form/div[3]/div/button")).click();
		driver.get("file:///E:/Selenium%20Softwares/Offline%20Website/Offline%20Website/pages/examples/dashboard.html");
	}
	@Test
	public void ondashboard() {
		String text = driver.findElement(By.xpath("/html/body/div/div[1]/section[1]/h1")).getText();
		String exp = "Dashboard Courses Offered";
		Assert.assertEquals(text,exp);
		System.out.println(text);
	}
	@Test
	public void logout() {
		
		String text = driver.findElement(By.xpath("/html/body/div/header/nav/div/ul/li/a")).getText();
		String exp = "LOGOUT";
		Assert.assertEquals(text,"LOGOUT");
		System.out.println(text);
	}
	@Test
    public void downloadoption() {
		
		String text = driver.findElement(By.xpath("/html/body/div/aside/section/ul/li[6]/a/span")).getText();
		String exp = "Downloads";
		Assert.assertEquals(text,"Downloads");
		System.out.println(text);
}
	@Test
    public void Operator() {
		
		String text = driver.findElement(By.xpath("/html/body/div/aside/section/ul/li[4]/a/span")).getText();
		String exp = "Operators";
		Assert.assertEquals(text,"Operators");
		System.out.println(text);
}
	@Test
    public void Logout() {
		
		String text = driver.findElement(By.xpath("/html/body/div/aside/section/ul/li[7]/a/span")).getText();
		String exp = "Logout";
		Assert.assertEquals(text,"Logout");
		System.out.println(text);
}
	@Test
    public void Users() {
		
		String text = driver.findElement(By.xpath("/html/body/div/aside/section/ul/li[3]/a")).getText();
		String exp = "Users";
		Assert.assertEquals(text,"Users");
		System.out.println(text);
}
	@Test
    public void Jlogo() {
		
		String text = driver.findElement(By.xpath("/html/body/div/footer/strong/a")).getText();
		String exp = "JavaByKiran";
		Assert.assertEquals(text,exp);
		System.out.println(text);
}
	@Test
    public void Useful() {
		
		String text = driver.findElement(By.xpath("/html/body/div/aside/section/ul/li[5]/a/span")).getText();
		String exp = "Useful Links";
		Assert.assertEquals(text,exp);
		System.out.println(text);
}
	@Test
	public void coursepython() {
		String text = driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div[3]/div/div[1]/h3")).getText();
		String exp ="Python";
		Assert.assertEquals(text,exp);
		System.out.println(text);
	}
	@Test
	public void automationcourse() {
		String text = driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div[1]/div/div[1]/p")).getText();
		String exp = "Automation Testing";
		Assert.assertEquals(text,exp);
		System.out.println(text);
	}
	@Test 
	public void phpcheck() {
		String text = driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div[4]/div/div[1]/h3")).getText();
		String exp = "Php";
		Assert.assertEquals(text,exp);
		System.out.println(text);
	}
	@Test 
	public void javacourse() {
		String text = driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div[2]/div/div[1]/h3")).getText();
		String exp = "Java / J2EE";
		Assert.assertEquals(text,exp);
		System.out.println(text);
	}
	@Test 
	public void softwarecourse() {
		String text = driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div[2]/div/div[1]/p")).getText();
		String exp = "Software Development";
		Assert.assertEquals(text,exp);
		System.out.println(text);
	}
	@Test 
	public void webcourse() {
		String text = driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div[4]/div/div[1]/p")).getText();
		String exp = "Web Development";
		Assert.assertEquals(text,exp);
		System.out.println(text);
	}

	@Test 
	public void datacourse() {
		String text = driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div[3]/div/div[1]/p")).getText();
		String exp = "Data Science";
		Assert.assertEquals(text,exp);
		System.out.println(text);
	}
	@Test 
	public void maincourse() {
		String text = driver.findElement(By.xpath("/html/body/div/aside/section/ul/li[1]")).getText();
		String exp = "MAIN NAVIGATION";
		Assert.assertEquals(text,exp);
		System.out.println(text);
	}
	@Test 
	public void desingline() {
		String text = driver.findElement(By.xpath("/html/body/div/footer/div/b")).getText();
		String exp = "Design for Selenium Automation Test";
		Assert.assertEquals(text,exp);
		System.out.println(text);
	}
	@Test 
	public void logo() {
		String text = driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div[2]/div/div[2]/i")).getText();
		String exp = "";
		Assert.assertEquals(text,exp);
		System.out.println(text);
	}
	@AfterTest
	public void closedriver() {
		 driver.get("file:///E:/Selenium%20Softwares/Offline%20Website/Offline%20Website/index.html");
		 driver.close();
		
	}
	
}





