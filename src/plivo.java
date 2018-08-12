import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class plivo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		System.setProperty("WebDriver.chrome.driver", "/Users/swadesh.prasad/eclipse-workspace/Introduction/chromedriver");
 
		// try running it in firefox
		
		WebDriver driver = new ChromeDriver();

		driver.get("http://quickfuseapps.com/");

		driver.findElement(By.id("link-create")).click();
		driver.findElement(By.xpath("//button[contains(text(),'get started')]")).click();


		driver.findElement(By.id("add-page")).click();

		driver.findElement(By.xpath("//div[@aria-labelledby='ui-dialog-title-create-dialog']/div[2]/form/p/input")).sendKeys("Test1");
		driver.findElement(By.xpath("//div[@aria-labelledby='ui-dialog-title-create-dialog']/div[3]/button[1]")).click();

		driver.findElement(By.partialLinkText("Messaging")).click();
		Thread.sleep(3000);

		//Send SMS Connection

		WebElement From=driver.findElements(By.xpath("//li[@class='module-item ui-widget-content ui-corner-all module-item-green ui-draggable']")).get(2);

		Actions act=new Actions(driver);
		act.dragAndDropBy(From, 550, 50).build().perform();

// convert thread sleep into explicit wait
		Thread.sleep(3000);
		From = driver.findElements(By.xpath("//div[@class='syn-node ui-draggable syn-node-active']")).get(1);
		WebElement To = driver.findElement(By.xpath("//div[@class='syn-receptor ui-droppable syn-receptor-north ui-draggable syn-receptor-draggable']"));

		act.dragAndDrop(From, To).build().perform();

		driver.findElement(By.xpath("//textarea[@name='phone_constant']")).sendKeys("9889787666");
		driver.findElements(By.xpath("//textarea[@name='message_phrase[]']")).get(0).sendKeys("Test Message");


		//Send Email connection
 
		From=driver.findElements(By.xpath("//li[@class='module-item ui-widget-content ui-corner-all module-item-green ui-draggable']")).get(1);
	// make a function for drang and drop and pass three things,  weblement, x offset and y offset)
		act.dragAndDropBy(From, 800, 200).build().perform();
		
		Thread.sleep(3000);
		From = driver.findElement(By.xpath("//div[@class='syn-node syn-node-attached-e ui-draggable syn-node-active']"));
		To = driver.findElements(By.xpath("//div[@class='syn-receptor ui-droppable syn-receptor-north ui-draggable syn-receptor-draggable']")).get(1);

		act.dragAndDrop(From, To).build().perform();

		// here you can use POM, to keep all xpaths in different file, and pass those in below code, using parameters)
		
		driver.findElement(By.xpath("//input[@name='smtp_url']")).sendKeys("abc.com");
		driver.findElement(By.xpath("//input[@name='port']")).sendKeys("2121");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("swadesh");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("password");
		driver.findElement(By.xpath("//textarea[@name='from_constant']")).sendKeys("from@gmail.com");
		driver.findElement(By.xpath("//textarea[@name='to_constant']")).sendKeys("to@gmail.com");
		driver.findElement(By.xpath("//textarea[@name='cc_constant']")).sendKeys("cc@gmail.com");
		driver.findElement(By.xpath("//textarea[@name='subject_constant']")).sendKeys("subject");
		driver.findElements(By.xpath("//textarea[@name='message_phrase[]']")).get(2).sendKeys("Test Message 1");

		driver.findElement(By.partialLinkText("Basic")).click();
		Thread.sleep(3000);
		
		for (int i = 300; i<1200; i=i+400)
		 { 
			 From = driver.findElement(By.xpath("//li[@class='module-item ui-widget-content ui-corner-all module-item-red ui-draggable']"));
			 act.dragAndDropBy(From, i, 400).build().perform();
		 }
		
		// convert these 4 statements in two, for east and west

		Thread.sleep(3000);
		From = driver.findElements(By.xpath("//div[@class='syn-node syn-node-attached-w ui-draggable syn-node-active']")).get(0);
		To = driver.findElements(By.xpath("//div[@class='syn-receptor ui-droppable syn-receptor-north ui-draggable syn-receptor-draggable']")).get(2);

		act.dragAndDrop(From, To).build().perform();
		
		From = driver.findElement(By.xpath("//div[@class='syn-node syn-node-attached-w ui-draggable syn-node-active']"));
		To = driver.findElements(By.xpath("//div[@class='syn-receptor ui-droppable syn-receptor-north ui-draggable syn-receptor-draggable']")).get(3);

		act.dragAndDrop(From, To).build().perform();
		
		From = driver.findElement(By.xpath("//div[@class='syn-node syn-node-attached-e ui-draggable syn-node-active']"));
		To = driver.findElements(By.xpath("//div[@class='syn-receptor ui-droppable syn-receptor-north ui-draggable syn-receptor-draggable']")).get(4);

		act.dragAndDrop(From, To).build().perform();
		

	}

}
