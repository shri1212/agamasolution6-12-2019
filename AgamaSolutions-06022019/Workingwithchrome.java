package dayy1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Workingwithchrome {

	
	ChromeDriver driver;
	
	public void invokeBroser(){
		driver =  new  ChromeDriver();
		
		System.setProperty("webdriver.chrome.driver", "C:\\libs\\ChromeDriver.exe");	
		
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

}
