package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Fallers {
	
public static final String URL = "https://www.hl.co.uk/shares/stock-market-summary/ftse-100/fallers";
	
	@FindBy(css = "td.name-col.align-left > a")
	private WebElement topFallerAnchor;
	
	public String getTopFaller() {
		return topFallerAnchor.getText();
	}

}
