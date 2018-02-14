package excercises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Exercise7 {
	
	@Test
	public void testExercise7() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.w3schools.com/html/html_forms.asp");
		
		
		WebElement button = driver.findElement(By.xpath("//*[@id='main']/input[4]"));
		
		button.click();
		
		driver.close();
		driver.quit();
	}
}
