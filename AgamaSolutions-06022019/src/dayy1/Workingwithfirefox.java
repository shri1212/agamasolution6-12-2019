package dayy1;


import org.openqa.selenium.firefox.FirefoxDriver;

public class Workingwithfirefox {

	
	FirefoxDriver driver;
	
	public void invokeBroser(){
		System.setProperty("webdriver.Firefox.driver", "C:\\libs\\FirefoxDriver.exe");	
		
		driver =  new  FirefoxDriver();
		
		
	 driver.manage().window(). maximize();
	 
	 driver.manage().deleteAllCookies();
	 
	 driver.get("http://qatechhub.com ");
	 
	
		 
		 
	 }
	
	 public void getTitleOfThePage(){
		 System.out.println("Title of page"+ driver.getTitle());
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
