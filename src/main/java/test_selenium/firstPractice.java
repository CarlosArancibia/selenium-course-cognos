package test_selenium;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import 	org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class firstPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String exePath = "./driver/chromedriver.exe"; // especificamos la ruta del driver
		System.setProperty("webdriver.chrome.driver", exePath);
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com");
		
		driver.manage().window().maximize();
				
		// Scroll
		JavascriptExecutor js = (JavascriptExecutor) driver;		
		js.executeScript("window.scrollBy(0,350)", "");
		
		WebElement btnForm = driver.findElement(By.xpath("//h5[contains(.,'Forms')]"));
		btnForm.click();
		
		WebElement btnPracticeForms = driver.findElement(By.xpath("//span[contains(.,'Practice Form')]"));
		btnPracticeForms.click();
		
		WebElement firstName = driver.findElement(By.xpath("//input[@id='firstName']"));
		WebElement lastName = driver.findElement(By.xpath("//input[@id='lastName']"));
		WebElement userEmail = driver.findElement(By.xpath("//input[@id='userEmail']"));
		WebElement radioGender = driver.findElement(By.xpath("//label[@for='gender-radio-1']"));
		WebElement userNumber = driver.findElement(By.xpath("//input[@id='userNumber']"));
		WebElement dateOfBirth = driver.findElement(By.xpath("//input[@id='dateOfBirthInput']"));
		WebElement subjectsInput = driver.findElement(By.xpath("//input[@id='subjectsInput']"));
		WebElement checkHobbies1 = driver.findElement(By.xpath("//label[@for='hobbies-checkbox-1']"));
		WebElement checkHobbies3 = driver.findElement(By.xpath("//label[@for='hobbies-checkbox-3']"));
		String projectPath = System.getProperty("user.dir");
		WebElement btnUpload = driver.findElement(By.xpath("//input[@id='uploadPicture']"));
		WebElement currentAddress = driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
		WebElement dropdownState = driver.findElement(By.xpath("(//*[@class=' css-tlfecz-indicatorContainer'])[1]"));
		WebElement dropdownCity = driver.findElement(By.xpath("(//*[@class=' css-tlfecz-indicatorContainer'])[2]"));
		WebElement textBoxState = driver.findElement(By.xpath("//*[@id='react-select-3-input']"));
		WebElement textBoxCity = driver.findElement(By.xpath("//*[@id='react-select-4-input']"));
		WebElement btnSubmit = driver.findElement(By.xpath("//button[@id='submit']"));
		
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		js.executeScript("window.scrollBy(0,250)", "");	
		
		firstName.sendKeys("Carlos");
		Thread.sleep(1000);
		lastName.sendKeys("Arancibia");
		Thread.sleep(1000);
		userEmail.sendKeys("carlos@google.com");
		Thread.sleep(1000);
		radioGender.click();
		Thread.sleep(1000);
		userNumber.sendKeys("7486184124");	
		Thread.sleep(1000);
		//dateOfBirth.clear();
		dateOfBirth.sendKeys(Keys.CONTROL + "a");
		Thread.sleep(1000);
		dateOfBirth.sendKeys("15 Jan 1980");	
		Thread.sleep(2000);
		subjectsInput.click();
		subjectsInput.sendKeys("computer");
		subjectsInput.sendKeys(Keys.ENTER);
		subjectsInput.sendKeys("engl");
		subjectsInput.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		checkHobbies1.click();
		checkHobbies3.click();
		Thread.sleep(1000);
		btnUpload.sendKeys(projectPath + "\\files\\test-photo.png");
		Thread.sleep(1000);

		// Margin bottom
		js.executeScript("arguments[0].style.marginBottom = '150px'", btnSubmit);
		Thread.sleep(1000);
		// Scroll
		js.executeScript("arguments[0].scrollIntoView()", btnSubmit);
		
		currentAddress.sendKeys("Achumani");
		Thread.sleep(1000);
		dropdownState.click();
		textBoxState.sendKeys("Utt");
		textBoxState.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		dropdownCity.click();
		textBoxCity.sendKeys("Ag");
		textBoxCity.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		btnSubmit.click();
		Thread.sleep(2500);
		
		WebElement btnClose = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("closeLargeModal")));
		// Scroll
		js.executeScript("arguments[0].scrollIntoView()", btnClose);
		
		Thread.sleep(2000);
		driver.close();
	}

}
