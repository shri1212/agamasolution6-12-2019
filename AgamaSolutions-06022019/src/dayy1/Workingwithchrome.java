package dayy1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Workingwithchrome {

	
	ChromeDriver driver;
	
	public void invokeBroser(){
		System.setProperty("webdriver.chrome.driver", "C:\\libs\\ChromeDriver.exe");	
		
		driver =  new  ChromeDriver();
		
		
	 driver.manage().window(). maximize();
	 
	 driver.manage().deleteAllCookies();
	 
	 driver.get("http://qatechhub.com ");
	 
	
		 
		 
	 }
	
	 public void getTitleOfThePage(){
		 System.out.println("Title of the page"+ driver.getTitle());
		 driver.close(); 
		// driver.quit();
	 
	
}
	
	 public void closeBrowser(){
		 
		 driver.close();
	}

	public void  navigateCommand(){
		driver.navigate().to("http://facebook.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}
	 
}
