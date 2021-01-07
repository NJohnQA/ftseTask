package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Overview {
	
	public static final String URL = "https://www.hl.co.uk/shares/stock-market-summary/ftse-100";
	
	@FindBy(css = "#view-constituents > ul > li:nth-child(2) > a")
	private WebElement risersAnchor;
	
	@FindBy(css = "#view-constituents > ul > li:nth-child(3) > a")
	private WebElement fallersAnchor;
	
	@FindBy(id = "acceptCookie")
	private WebElement acceptCookie;
	
	public void acceptCooke() {
		acceptCookie.click();
	}
	
	public void navRisers() {
		risersAnchor.click();
	}
	
	public void navFallers() {
		fallersAnchor.click();
	}

}
