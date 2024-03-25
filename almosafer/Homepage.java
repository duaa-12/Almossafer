package almosafer;
import static org.testng.AssertJUnit.assertEquals;
import static org.testng.Assert.assertEquals;

import java.sql.Driver;
import java.time.Duration;
import java.time.LocalDate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
@SuppressWarnings("unused")
public class Homepage extends Parmeters {

	@BeforeTest
	public void mySetup() {
		driver.manage().window().maximize();
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		WebElement MSG = driver.findElement(By.cssSelector(".sc-iBmynh.izXFRL"));

		if (MSG.isDisplayed()) {
			WebElement SarBUTTON = driver.findElement(By.cssSelector(".sc-jTzLTM.hQpNle.cta__button.cta__saudi.btn.btn-primary"));
			SarBUTTON.click();}
}
	@Test()
	public void checkdefaultlanguage() throws InterruptedException{
		Thread.sleep(2000);
		String Actual=driver.findElement(By.tagName("html")).getAttribute("lang");
		Assert.assertEquals(Actual, expectedenlang);
	}
	@Test()
	public void checkdefaultcurrency() throws InterruptedException {
		Thread.sleep(2000);
		String currency=driver.findElement(By.xpath("//button[@data-testid='Header__CurrencySelector']")).getText();
		Assert.assertEquals(currency, expectedcurr);
	}
	@Test()
	public void checkdefaultnumber() {
		String contactnumber=driver.findElement(By.tagName("strong")).getText();
		Assert.assertEquals(contactnumber, expectednumber);
	}
	@Test()
	public void checkqitaf() {
      WebElement qitaf=driver.findElement(By.xpath("//div[@class='sc-fihHvN eYrDjb']//*[name()='svg']"));
       boolean reslt=qitaf.isDisplayed();
      Assert.assertEquals(reslt,true);
	}
	@Test()
	public void hotelssherach() {
		WebElement hotels=driver.findElement(By.id("uncontrolled-tab-example-tab-hotels"));
		String resalt=hotels.getAttribute("aria-selected");
		Assert.assertEquals(resalt,"false");
	}
   @Test()
   public void dateofdepartandreturn() {
	   LocalDate today=LocalDate.now();
	   int tomorrow = today.plusDays(1).getDayOfMonth();
		int theDayAfterTomorrow = today.plusDays(2).getDayOfMonth();
		String ActualDepatureDateOnTheWebSite = driver.findElement(By.cssSelector("div[class='sc-iHhHRJ sc-kqlzXE blwiEW'] span[class='sc-cPuPxo LiroG']")).getText();
		String ActualReturnDateOnTheWebSite = driver.findElement(By.cssSelector("div[class='sc-iHhHRJ sc-OxbzP edzUwL'] span[class='sc-cPuPxo LiroG']")).getText();
		int ActualReturnDateOnTheWebsiteAsNumber = Integer.parseInt(ActualReturnDateOnTheWebSite);
		int ActualDepatureDateOnTheWebsiteAsNumber = Integer.parseInt(ActualDepatureDateOnTheWebSite);
		Assert.assertEquals(ActualDepatureDateOnTheWebsiteAsNumber, tomorrow);
		Assert.assertEquals(ActualReturnDateOnTheWebsiteAsNumber, theDayAfterTomorrow);
}
 @Test()
 public void changelangugerandom() {
	 driver.get(website[randomwebsite]);
	 if (driver.getCurrentUrl().contains("en")){
			String Actual1=driver.findElement(By.tagName("html")).getAttribute("lang");
           Assert.assertEquals(Actual1, expectedenlang);
	 }
	 else {
		 String Actual1=driver.findElement(By.tagName("html")).getAttribute("lang");
         Assert.assertEquals(Actual1, expectedarlang);

	 }
}

 
}