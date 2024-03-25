package hotelssearch;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.Assertion;


public class Parametres {
	WebDriver driver = new ChromeDriver();
    String URL="https://global.almosafer.com/en";
    String [] arbiccity={"دبي" , "جدة"};
    String [] engcity={"Dubi" , "Jeddah", "Riyadh"};
    Random rand=new Random();
    int arrandomcity=rand.nextInt(arbiccity.length);
    int enrnadomcity=rand.nextInt(engcity.length);
 int visitores=rand.nextInt(2);
 Assertion myAssert=new Assertion();
 
    		
}
