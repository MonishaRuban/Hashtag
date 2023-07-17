package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Home {
	By name=By.xpath("//*[@id=\"contact-form\"]/div/div[2]/input");
	By mail=By.xpath("//*[@id=\"contact-form\"]/div/div[3]/input");
	By phone=By.xpath("//*[@id=\"contact-form\"]/div/div[4]/input");
	By notice=By.xpath("//*[@id=\"contact-form\"]/div/div[5]/input");
	By experience=By.xpath("//*[@id=\"contact-form\"]/div/div[6]/input");
	By resume=By.xpath("//input[@id='inputFile']");
	By desc=By.xpath("//*[@id='contact-form']/div/div[8]/textarea");
    By apply=By.xpath("//*[@class='form-btn-arrow btn-right-arrow']");
    WebDriver driver;
	public Home(WebDriver driver) {
		this.driver=driver;
//		 wait = new WebDriverWait(driver,10);
	}
	public void typeUsername(String username) { 
		driver.findElement(name).clear();
		driver.findElement(name).sendKeys(username);
	}
	public void typemail(String usermail) { 
		driver.findElement(mail).clear();
		driver.findElement(mail).sendKeys(usermail);
	}
	public void typephone(String userphone) { 
		driver.findElement(phone).clear();
		driver.findElement(phone).sendKeys(userphone);
	}
	public void typenotice(String usernotice) { 
		driver.findElement(notice).clear();
		driver.findElement(notice).sendKeys(usernotice);
	}
	public void typeexperience(String userexperience) { 
		driver.findElement(experience).clear();
		driver.findElement(experience).sendKeys(userexperience);
	}
	public void typeresume(String userresume) { 
		
		driver.findElement(resume).sendKeys(userresume);
	}
	public void typedesc(String userdesc) { 
		driver.findElement(desc).clear();
		driver.findElement(desc).sendKeys(userdesc);
	}
	public void clickapply() {
		WebElement element = driver.findElement(apply);
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
		}
		}
	

