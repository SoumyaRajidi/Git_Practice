package Elementidentification;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UsingID2 {

	public static void main(String[] args) throws InterruptedException{
		String url="https://www.royalmail.com/user/register/personal";
		String driverpath="C:\\lib\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",driverpath );
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().fullscreen();
		Select dropTitle =new Select(driver.findElement(By.name("title_of_person")));
        //dropTitle.selectByVisibleText("Mrs");
        dropTitle.selectByIndex(3);
        WebElement Firstname = driver.findElement(By.name("first_name"));
        Firstname.sendKeys("Soumya");
        WebElement lastname = driver.findElement(By.id("edit-last-name"));
        lastname.sendKeys("Rajidi");
        WebElement email = driver.findElement(By.xpath("//input[@id='edit-mail']"));
        email.sendKeys("rajidi.rajidi@gmail.com");
        
        

	}

}
