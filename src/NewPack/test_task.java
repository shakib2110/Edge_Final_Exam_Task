package NewPack;

import java.time.Duration;
//import utils.ExcelReader;
//import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class test_task {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait letswait = new WebDriverWait(driver, Duration.ofSeconds(60));

		// Initial Landing Page
		String baseUrl = "https://hachnat.stage-carelogix.de/sing-in";
		driver.get(baseUrl);

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			System.out.println("First page");
		}

		letswait.until(ExpectedConditions.visibilityOfElementLocated(By.className("ant-btn")));

		// Here we declare the necessary fields to give input

		// User Name
		WebElement username = driver.findElement(By.id("credential"));
		// Password
		WebElement pass = driver.findElement(By.id("password"));
		// Sign-Up button
		WebElement signup = driver.findElement(By.className("ant-btn"));

		username.sendKeys("nh.naeem786786@gmail.com");
		pass.sendKeys("Carelogix24!!");
		signup.click();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			// sub_dom.sendKeys(data[4]);
			System.out.println("Done!!");
		}

		letswait.until(ExpectedConditions.visibilityOfElementLocated(By.className("ant-btn")));

		// Goto the the Task
		String task = "https://hachnat.stage-carelogix.de/tasks";
		driver.get(task);

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			// sub_dom.sendKeys(data[4]);
			System.out.println("Done!!");
		}

		WebElement add_task = driver.findElement(By.className("ant-btn"));
		add_task.click();

		// User Name
		WebElement task_name = driver.findElement(By.id("name"));
		task_name.sendKeys("Task_Edge101");
		// Password
		WebElement task_per1 = driver.findElement(By.xpath(
				"/html/body/div[2]/div/div[2]/div/div[2]/div/div[2]/div/div/form/div[1]/div[2]/div/div/div[2]/div/div/div"));
		task_per1.click();
		WebElement task_per2 = driver
				.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/div/div[3]/div/div"));
		task_per2.click();
		// Sign-Up
		WebElement createnew = letswait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div/div[2]/div/div/form/div[2]/button/span")));
		// Click on to create
		createnew.click();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			// sub_dom.sendKeys(data[4]);
			System.out.println("Done!!");
		}

		// close Fire fox
		// driver.close();
	}

}