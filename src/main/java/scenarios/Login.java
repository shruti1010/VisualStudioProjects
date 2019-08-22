package scenarios;


import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Login {
	
	WebDriver driver;

	@BeforeTest
	public void setUp() throws MalformedURLException{
		//Set up desired capabilities and pass the Android app-activity and app-package to Appium
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName","emulator-5554");
		capabilities.setCapability("platformName","Android");
	    capabilities.setCapability("appPackage", "com.savorly.dev");
		capabilities.setCapability("appActivity","com.savorly.SplashScreen"); 
		capabilities.setCapability("unicodeKeyboard", true);
		capabilities.setCapability("resetKeyboard", true);
		//capabilities.setCapability("autoAcceptAlerts", true);
		capabilities.setCapability("autoGrantPermissions", true); 
		//capabilities.setCapability("noReset", true);
		driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	}

	@Test
	public void login() throws Exception {

		 WebElement loginbtn =driver.findElement(By.id("com.savorly.dev:id/login_button"));
		 loginbtn.click();
		 WebElement email=driver.findElement(By.id("com.savorly.dev:id/email_edit_text"));
		 email.sendKeys("shivani@koder.com");
		 WebElement pwd=driver.findElement(By.id("com.savorly.dev:id/password_edit_text"));
		 pwd.sendKeys("123456789");
		 WebElement btn=driver.findElement(By.id("com.savorly.dev:id/signin_button"));
		 btn.click();
		// Thread.sleep(3000);
//		 WebDriverWait wait = new WebDriverWait(driver,1000);
//		 wait.until(ExpectedConditions.alertIsPresent());
//		 allowLocatioPopUp();
		// driver.switchTo().activeElement();
		
		 
//		 WebElement element;
//		 WebDriverWait wait = new WebDriverWait(driver, 3000);
//		 element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(“desired xpath”)));
//		 Alert alert = driver.switchTo().alert();
//		 alert.accept();
		 WebElement img1= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.ImageView[1]"));
		 img1.click();	
		 WebElement addtocart1= driver.findElement(By.id("com.savorly.dev:id/add_to_cart"));
		 addtocart1.click(); 
		 Thread.sleep(2000);
//		 WebElement img2= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ImageView[1]"));
//		 img2.click(); 
//		 WebElement addtocart2= driver.findElement(By.id("com.savorly.dev:id/add_to_cart"));
//		 addtocart2.click();
		 
		 WebElement chkoutbtn= driver.findElement(By.id("com.savorly.dev:id/continue_to_checkout"));
		 chkoutbtn.click();
		Thread.sleep(3000);
		 WebElement ccdetails=driver.findElement(By.id("com.savorly.dev:id/imageView5"));
		 ccdetails.click();
		 
//		 List <WebElement>  ele=driver.findElements(By.className("android.widget.EditText"));
//		 ele.get(0).sendKeys("test");
//		 ele.get(1).sendKeys("5555555555554444");
		
		 
		// driver.switchTo().frame(0);
		 WebElement holdername= driver.findElement(By.id("com.savorly.dev:id/cardHolderName"));
		 holdername.clear();
		 holdername.sendKeys("test");
		 driver.findElement(By.id("com.savorly.dev:id/cardNumberEditText")).clear();
		 driver.findElement(By.id("com.savorly.dev:id/cardNumberEditText")).sendKeys("5555555555554444");
		 WebElement cvvno =driver.findElement(By.id("com.savorly.dev:id/cardCVCEditText"));
		 cvvno.sendKeys("345");
		 WebElement savebtn=driver.findElement(By.id("com.savorly.dev:id/add_card_btn"));
		 savebtn.click();
		 WebElement plcorder=driver.findElement(By.id("com.savorly.dev:id/place_order"));
		 plcorder.click();
		 
	}
	

	}

