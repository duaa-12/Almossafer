package almosafer;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.Assertion;

public class Parmeters {
	WebDriver driver = new ChromeDriver();
    String URL="https://global.almosafer.com/en";
    String expectedenlang="en";
    String expectedarlang="ar";
    String expectedcurr="SAR";
    String expectednumber="+966554400000";
    Assertion Assert=new Assertion();
    Random rand=new Random();
    String[] website= {"https://www.almosafer.com/en","https://www.almosafer.com/ar"};
    int randomwebsite=rand.nextInt(website.length);

}
