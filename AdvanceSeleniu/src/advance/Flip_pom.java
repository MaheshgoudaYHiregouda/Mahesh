package advance;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Flip_pom {
	
	public Flip_pom(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
		}
	
	@FindBy(xpath="//button[text()=\"✕\"]")
	private WebElement avoidpopup;
	
	
	public WebElement getAvoidpopup() {
		return avoidpopup;
	}

	public WebElement getClick_product() {
		return click_product;
	}

	public WebElement getDropdown() {
		return dropdown;
	}

	public WebElement getSlectprice() {
		return slectprice;
	}

	@FindBy(xpath="//div[text()='Mobiles']")
	private WebElement click_product;
	
	@FindBy(xpath="(//select[@class=\"_2YxCDZ\"])[2]")
	private WebElement dropdown;
	
	@FindBy(xpath="(//div[text()='₹11,999'])[1]")
	private WebElement slectprice;
	
	
	
	
	

}
