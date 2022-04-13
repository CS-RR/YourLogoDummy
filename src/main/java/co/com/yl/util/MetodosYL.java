package co.com.yl.util;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class MetodosYL extends PageObject {

    private WebDriver driver;
    public void swframe(String iframeS){
        WebElement element = getDriver().findElement(By.xpath(iframeS));
        getDriver().switchTo().frame(element);
    }
    public  void defaultIframe(){
        getDriver().switchTo().defaultContent();
    }
}
