package myPack;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
public class Manoj {
@Test
public static void verifyLogin(){
	WebDriver driver=new ChromeDriver();
	
	//open the qahrm application...
	driver.get("http://apps.qaplanet.in/qahrm");
	
	driver.findElement(By.name("txtUserName")).sendKeys("qaplanet1");
	driver.findElement(By.name("txtPassword")).sendKeys("lab1");
	driver.findElement(By.name("Submit")).click(); 
	
	//check the page title ....OrangeHRM and the welcome message....welcome qaplanet1
	String welMessage=driver.findElement(By.xpath(".//*[@id='option-menu']"
			+ "/li[1]")).getText();
	if((driver.getTitle().equals("OrangeHRM"))&&(welMessage.equals("Welcome qaplanet1"))){
		System.out.println("VerifyLogin successful, TC passed!");
	}else{
		System.out.println("Login failed, TC failed!");
	}
	driver.findElement(By.linkText("Logout")).click();
	
	driver.close();
}
@Test
public static void addEmp() {
	System.out.println("Add Emp Passed!");
}
@Test
public static void editEmp(){
	System.out.println("Edit Emp passed!");
}
@Test
public static void deleteEmp(){
	System.out.println("Delete Emp Passed!");
}
@Test
public static void addLocation(){
	System.out.println("Add location Passed!");
}
@Test
public static  void editLocation(){
	System.out.println("Edit location Passed!");
}
}
