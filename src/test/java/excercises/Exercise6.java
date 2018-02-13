package excercises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.Select;

public class Exercise6 {
	
	@Test
	public void testExercise6() {
		
		// Creates a new Chrome web driver
		WebDriver driver = new ChromeDriver();
		WebElement DropDown;
		
		// Goes to the "the-internet" herokuapp page
		driver.get("https://the-internet.herokuapp.com/");
		
		// Clicks the link that reads "Dropdown"
		driver.findElement(By.linkText("Dropdown")).click();
		
		DropDown = driver.findElement(By.id("dropdown"));
		
		Select select = new Select(DropDown);
		
		select.selectByIndex(1);
		
		select.selectByValue("1");
		
		select.selectByVisibleText("Option 2");
		
		
		
		// Closes the browser connection
		driver.quit();
	}
}
