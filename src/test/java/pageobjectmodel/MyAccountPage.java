package pageobjectmodel;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyAccountPage extends PageParent {

	///// ////// Properties XAPTH Id Locators of this Page /////////////////
	String myOrderLink = "//a[contains(text(),'My Orders')]";
	String profileLink = "//a[contains(text(),'Profile')]";
	String myReturnRequestsLink = "//a[contains(text(),'My Return Requests')]";
	String changePasswordLink = "//a[contains(text(),'Change Password')]";
	String myFavoriteProductsLink = "//a[contains(text(),'My Favorite Products')]";
	String myFavoriteSellersLink = "//a[contains(text(),'My Favorite Sellers')]";
	String sellerDashboardLink = "//a[contains(text(),'Seller Dashboard')]";

	///// COnstructor
	public MyAccountPage(WebDriver driver) {
		super(driver);
	}

	//////////////// My Account Page all Click Operation Together ////////////////

	//////////////// My Account Page all Enter Operation Together ////////////////

	//////////////// My Account Page all Get Text Operation Together
	
	public String getFirstMyAccountOption() {
		return getTextFromWebElementbyXpath(myOrderLink);
	}

	public String getSecondMyAccountOption() {
		return getTextFromWebElementbyXpath(profileLink);
	}

	public String getThirdMyAccountOption() {
		return getTextFromWebElementbyXpath(myReturnRequestsLink);
	}

	public String getFourthMyAccountOption() {
		return getTextFromWebElementbyXpath(changePasswordLink);
	}

	public List<String> getAllAccountOptionsfromUI() {

		List<String> resultList = new ArrayList<String>(); /// Empty

		List<WebElement> actualList = driverforParentPage.findElements(By.xpath("//div[@class='myaccount_list']//div[@class='col-sm-12 col-lg-3 col-md-3']/a"));
		for (int i = 0; i < actualList.size(); i++) {
			// System.out.println(actualList.get(i).getText());
			resultList.add(actualList.get(i).getText()); /// Filling the List one by One
		}

		return resultList; /// return filled list back to you validation code
	}

}
