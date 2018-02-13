package excercises;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Exercise8 {
	
	@Test
	public void testExercise8() {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/");
		
		driver.findElement(By.linkText("Sortable Data Tables")).click();
		
		// Assigns table 1 to the variable table
		WebElement table = driver.findElement(By.id("table1"));
		
		WebElement cell = table.findElement(By.tagName("td"));
		
		// Prints out the first cell of the first table (1.C.)
		System.out.println("The first element is : \n" + cell.getText());
		
		
		WebElement firstRow = table.findElement(By.tagName("tr"));
		
		System.out.print("The first row is: "+firstRow.toString());
		
		
		/*
		List<WebElement> firstRowCells = firstRow.findElements(By.tagName("td"));
	
		for(int i=0;i<firstRowCells.size();i++) {
			System.out.print("The "+(i+1)+" column in row 1 is: "+firstRowCells.get(i).getText()+"\n");
		}
		*/
		
		driver.close();
	}

}
