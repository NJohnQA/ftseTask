package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Risers {
	
	public static final String URL = "https://www.hl.co.uk/shares/stock-market-summary/ftse-100/risers";
	
	@FindBy(css = "td.name-col.align-left > a")
	private WebElement topRiserAnchor;
	
	public String getTopRiser() {
		return topRiserAnchor.getText();
	}
}
