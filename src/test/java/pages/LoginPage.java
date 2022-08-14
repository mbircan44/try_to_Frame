package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import utilities.BrowserUtils;
import utilities.ConfigurationReader;
import utilities.Driver;

public class LoginPage extends BasePage{


// String password = ConfigurationReader.get("password");

 public void landLoginPage(){

     String url = ConfigurationReader.get("url");
     Driver.get().get(url);
     BrowserUtils.waitFor(3);


 }

}
