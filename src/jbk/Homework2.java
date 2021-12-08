package jbk;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Test
public class Homework2 {
	 WebDriver driver = null;
		
	 @BeforeTest
	     public void openBrowser() {
		 System.setProperty("webdriver.chrome.driver", "chromedriver.exe"); 
		 driver =  new ChromeDriver();
		 driver.get( "file:///E:/Selenium%20Softwares/Offline%20Website/Offline%20Website/index.html");
	 }
      @Test
       public void login() {
         @SuppressWarnings("unused")
		WebElement email = driver.findElement(By.id("email"));
		 driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		 driver.findElement(By.id("password")).sendKeys("123456");
		 driver.findElement(By.xpath("/html/body/div/div[2]/form/div[3]/div/button")).click();
		
         }
	 @Test
	 public void verifywrongpassword() {
	 String Wrongepassword =driver.findElement(By.xpath("/html/body/div/div[2]/form/div[1]/div")).getText();
	 System.out.println("password_error="+Wrongepassword); 
	 String exp = ""; 
	 Assert.assertEquals(Wrongepassword,exp);
	 }	
     @Test
     public void singtext() { 
     String actTitle=driver.findElement(By.xpath("/html/body/div/div[2]/p")).getText();
     System.out.println("acttilte="+actTitle);
     Assert.assertEquals(actTitle,"Register a new membership");
     }
		
	@Test
	public void checktext() {
    String actText=driver.findElement(By.xpath("/html/body/div/div[1]/a/b")).getText();
    System.out.println("acttext="+actText);
	Assert.assertEquals(actText,"Java By Kiran"); 
	 }
	@Test
	public void imagecheck() {
		String actimage = driver.findElement(By.xpath("/html/body/div/center/img")).getText();
		String exp ="";
		Assert.assertEquals(actimage,exp);
		System.out.println(actimage);
	}
		@Test
	public void registerdata() {
	 driver.get("file:///C:/Users/User/Downloads/Selenium%20Softwares/Offline%20Website/Offline%20Website/pages/examples/register.html");
	 driver.findElement(By.id("name")).sendKeys("kiran");
	 driver.findElement(By.id("mobile")).sendKeys("123456789");
	 driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
	 driver.findElement(By.id("password")).sendKeys("123456");
	
	}
		@Test
		public void checkemailname() {
			String checkemailname = driver.findElement(By.xpath("/html/body/div/div[2]/form/div[1]/div")).getText();
			String exp ="";
			Assert.assertEquals(checkemailname,exp);
			System.out.println("email_error="+checkemailname );
		}
	@AfterTest
	public void closedriver() {
		driver.get("file:///C:/Users/User/Downloads/Selenium%20Softwares/Offline%20Website/Offline%20Website/index.html");
		driver.close();
		
	}
}
