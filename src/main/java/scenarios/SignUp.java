package scenarios;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidKeyCode;

public class SignUp {
WebDriver driver;

@BeforeClass
public void setUp() throws MalformedURLException{
	//Set up desired capabilities and pass the Android app-activity and app-package to Appium
	
	DesiredCapabilities capabilities = new DesiredCapabilities();
	capabilities.setCapability("deviceName","emulator-5554");
	capabilities.setCapability("platformName","Android");
    capabilities.setCapability("appPackage", "com.savorly.dev");
	capabilities.setCapability("appActivity","com.savorly.SplashScreen"); 
	capabilities.setCapability("unicodeKeyboard", true);
	capabilities.setCapability("resetKeyboard", true);
	driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
}

@Test
public void signupform() throws Exception {

   WebElement signupbutton =driver.findElement(By.id("com.savorly.dev:id/signup_button"));
   signupbutton.click();
   WebElement fname=driver.findElement(By.id("com.savorly.dev:id/name_edit_text"));
   fname.sendKeys("Test");
   WebElement email=driver.findElement(By.id("com.savorly.dev:id/email_edit_text"));
   email.sendKeys("test@koder.com");
   driver.findElement(By.id("android:id/navigationBarBackground")).click();
   driver.findElement(By.id("com.savorly.dev:id/mobile_edit_text")).sendKeys("9960686925");
   WebElement pwd=driver.findElement(By.id("com.savorly.dev:id/password_edit_text"));
   pwd.sendKeys("testtest1");
   WebElement pwdv=driver.findElement(By.id("com.savorly.dev:id/verifypassword_edit_text"));
   pwdv.sendKeys("testtest1");
   WebElement chkbox=driver.findElement(By.id("com.savorly.dev:id/agree_to_terms_checbox"));
   chkbox.click();
   WebElement btn=driver.findElement(By.id("com.savorly.dev:id/signup_button"));
   btn.click();
}



//@AfterClass
//public void teardown(){
//	//close the app
//	driver.quit();
//}
}