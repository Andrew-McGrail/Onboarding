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
		
		/*-------*/
		
		List<WebElement> rows = (List<WebElement>)table.findElements(By.tagName("tr"));
		
		System.out.print("The first row is: ");
		
		int rowSize = rows.size();
		
		for(int row=0; row<rowSize; row++)
			{
			List<WebElement> column_Rows = (List<WebElement>) rows.get(row).findElements(By.tagName("td"));
			int columnSize = column_Rows.size();
			String cellText = "";
			for(int column=0;column<columnSize;column++)
				{
				cellText = column_Rows.get(column).getText();
				System.out.print(rows.get(row)+" || ");
				}
			}
		
		driver.close();
	}

}
