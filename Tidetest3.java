import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;  
  
public class Tidetest3  {
	
    public static void main(String[] args) {  
          
       // System Property for Chrome Driver   
    	 System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");  
  
        // Instantiate a ChromeDriver class.      
        WebDriver driver=new ChromeDriver();  
  
        // Launch Website  
        driver.navigate().to("https://tide.com/en-us");   
  
  
        // 
        WebElement element = driver.findElement(By.xpath("//*[@id=\"site-header\"]/div[2]/div/div/div/form/div/input"));  
        element.sendKeys("powder");
        element.submit();
        driver.findElement(By.xpath("//*[@id=\"site-content\"]/div[3]/div[2]/div/div/div/div[1]/div/div[2]/div/div[2]/div[2]/span")).click();
        WebElement textBox = driver.findElement(By.xpath("/html/body/div[7]/div/div[1]/div[3]/div/input"));
        textBox.sendKeys("chennai");
        
        
 
  
    // Close the Browser  
        //driver.close();  
  
  
    }  
}