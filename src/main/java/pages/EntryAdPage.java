package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EntryAdPage {
    private WebDriver driver;
    private By closeLink = By.xpath("//p[text()='Close']");
    private By entryAdHeader = By.cssSelector("#content > div > h3");
    private By restartAdLink = By.id("restart-ad");

    public EntryAdPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickClose(){
        driver.findElement(closeLink).click();
    }
    public String getHeaderText(){
        return driver.findElement(entryAdHeader).getText();
    }
    public void closeModal(){
        driver.findElement(closeLink).click();
    }

    public void clickRestartLink(){
        driver.findElement(restartAdLink).click();
    }

    public String getEntryAdText(){
        return driver.findElement(entryAdHeader).getText();
    }
}
