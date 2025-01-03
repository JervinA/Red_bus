package Sample_automation;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Red_bus   {
	
	//WebDriver driver;

	@Test
	
	
	public void Bookingbus() throws InterruptedException, FindFailed, IOException {
		
	/*	System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver-win64\\msedgedriver.exe");
		driver = new EdgeDriver(); */
		
        WebDriverManager.edgedriver().setup();
		
		EdgeDriver driver = new EdgeDriver();
		
		Screen s= new Screen();
		
		driver.get("https://www.redbus.in/");
    	driver.manage().window().maximize();
		Thread.sleep(15000);

		driver.findElement(By.xpath("(//*[@class='sc-bxivhb dsDRlf'])[1]")).sendKeys("coimbatore");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//*[@class='placeHolderMainText'])[2]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id='dest']")).sendKeys("chennai");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//*[@class='placeHolderMainText'])[3]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@class='dateText']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//span[normalize-space()='28']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("search_button")).click();
		Thread.sleep(2000); 
		
		By imageLocator = By.xpath("(//*[@class='searchBannerOip'])[1]");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(imageLocator));
						
		driver.findElement(By.xpath("//*[@class='icon-close coach-close']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//*[contains(text(),'After 6 pm')])[1]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[contains(text(),'NONAC')]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@placeholder='BOARDING POINT']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='inpFilter']")).sendKeys("gandhi");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//*[contains(text(),'Gandhipuram')])[6]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//*[contains(text(),'APPLY')])[1]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@placeholder='DROPPING POINT']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='inpFilter']")).sendKeys("koyambedu");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//*[contains(text(),'Koyambedu')])[5]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//*[contains(text(),'APPLY')])[1]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[normalize-space()='Fare']")).click();
		Thread.sleep(2000);
						
		driver.findElement(By.xpath("//*[@class='button view-seats fr']")).click();
		Thread.sleep(5000);
		
		try {
		WebElement cl_loginpg = driver.findElement(By.xpath("//i[@class='icon-close closepopupbtn']"));
		if(cl_loginpg.isDisplayed()) {
			cl_loginpg.click();
		}
		else
		{
			System.out.println("login page not displayed");
		}
		} catch(NoSuchElementException e) {
			System.out.println("no loginpg close element displayed");
		}
		Thread.sleep(3000);
		
		try {
		Pattern birth_select_1 = new Pattern("C:\\Users\\c.JERVIN\\Documents\\Red_bus\\Birth_SL.PNG");
		Pattern birth_select_2 = new Pattern("C:\\Users\\c.JERVIN\\Documents\\Red_bus\\Birth_SS.PNG");
		
		if(s.exists(birth_select_1) != null) {
		s.click(birth_select_1);
		}
		else
		{
			s.click(birth_select_2);
		}
		}
		catch(NoSuchElementException e) {
			System.out.println("Unable to select any birth");
		}
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//div[@class='radio-unchecked'])[1]")).click();
		
		System.out.println("verifying_1");
		
		WebElement scroll1 = driver.findElement(By.xpath("(//*[contains(text(),'Koyambedu')])[8]"));
		JavascriptExecutor sc_dw1 = (JavascriptExecutor) driver;
		sc_dw1.executeScript("arguments[0].scrollIntoView(true);", scroll1);
        Thread.sleep(3000);
        
        System.out.println("verifying_2");
                
        JavascriptExecutor sc_dw2 = (JavascriptExecutor) driver;
        sc_dw2.executeScript("window.scrollTo(0, -150);");
        
        System.out.println("verifying_3");
        
        scroll1.click();
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//button[@class='button continue inactive']")).click();
        Thread.sleep(4000);
		
        driver.findElement(By.xpath("(//input[@class='input_box '])[1]")).sendKeys("Jervin");
        Thread.sleep(1000);
        
        driver.findElement(By.xpath("//div[@id='div_22_0']")).click();
        
        driver.findElement(By.xpath("(//input[@type='number'])[1]")).sendKeys("23");
        
        driver.findElement(By.xpath("(//input[@type='text'])[6]")).sendKeys("Tamil");
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//li[@value='Tamil Nadu']")).click();
        
        driver.findElement(By.xpath("(//input[@class='input_box '])[3]")).sendKeys("jervinit120@gmail.com");
        
        driver.findElement(By.xpath("(//input[@class='input_box '])[4]")).sendKeys("6385734750");
        Thread.sleep(1000);
        
        WebElement scroll2 = driver.findElement(By.xpath("//label[@id='addOnFeatureCheckBox']"));
		JavascriptExecutor sc_dw3 = (JavascriptExecutor) driver;
		sc_dw3.executeScript("arguments[0].scrollIntoView(true);", scroll2);
        Thread.sleep(2000);
        
        try {
        WebElement cancellation = driver.findElement(By.xpath("(//input[@class='refundCheckBox'])[2]"));
        if(cancellation.isDisplayed()) {
        	cancellation.click();
        }
        else
        {
        	System.out.println("Cancellation option is not avaiable");
        }
        } catch (NoSuchElementException e) {
            System.out.println("Cancellation option is not available (element not found)");
        }
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("(//span[@class='checkmark-radio'])[1]")).click();
        Thread.sleep(1000);
        
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        Thread.sleep(9000);
        
        driver.findElement(By.xpath("//input[@id='Pay through QR code']")).click();
        Thread.sleep(1000);
        
        driver.findElement(By.xpath("//div[@class='sc-EHOje dOzAPo']")).click();
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//*[@alt='QR Code']")).isDisplayed();
        Thread.sleep(1000);
        System.out.println("QR code has been generated");
        
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File sourceFile = screenshot.getScreenshotAs(OutputType.FILE);
        String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        File destination1=new File("F:\\Screenshots\\Red_bus\\screenshots"+ timestamp + ".jpeg");
        FileHandler.copy(sourceFile, destination1);
	}
	
     /*   @AfterMethod
        
        public void teardown() {
        	if(driver !=null) {
        		driver.quit();
        	}  
        }  */
        
        
	}


