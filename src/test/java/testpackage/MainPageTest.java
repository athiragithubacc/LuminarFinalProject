package testpackage;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import basepackage.BaseClass;
import pagepackage.MainPage;

public class MainPageTest extends BaseClass {
MainPage pageobj;
SoftAssert softAssert;
	
	@BeforeClass
	public void setUp()
	{
		pageobj=new MainPage(driver);
		softAssert = new SoftAssert(); 
	}	
	 @Test(priority=1)
	 public void TestPassingValuestoTextFields()
	 {
		 
		 pageobj.SendTextstoTextFields();
	 }
	 
	 @Test(priority=2)
	 public void  TestGenderRadiobutton()
	 {
		 pageobj. VerifyGenderRadiobutton();
	 }
	 
	 @Test(priority=3)
	   public void testCheckAllCheckBoxes() {
		   pageobj.checkAllDateCheckBoxes();
	   
	    }

	 @Test(priority=4)
	    public void testUncheckAllCheckBoxes() {
	    	pageobj.uncheckAllDateCheckBoxes();
	       
	    }
	 
	 @Test(priority=5)
	    public void testCountryDropdown() 
	    {		 
	    	
		 softAssert.assertEquals("usa",pageobj.verifyCountryDropdown());
		// softAssert.assertAll(); 
	       
	    }
	 @Test(priority=6)
	    public void testMultiSelectDropdown() 
	    {
		  pageobj.verifyMultiSelectDropdownColor();
	    }
	 
	 @Test(priority=7)
	    public void testDatepickerforDate() throws Exception 
	    {
		  pageobj.verifyDatepickerforDate("September","25");
	    }
	 @Test(priority=8)
	    public void testWikipediaSearch() throws Exception 
	    {
		  pageobj.verifyWikipediaSearch("Flowers");
	    }

	 @Test(priority=9)
	    public void testPaginationTable() 
	    {
		  pageobj.verifyPaginationTable(4);
	    }
	 @Test(priority=10)
		public void testBooksWebTableTable() 
		    {
			  pageobj.verifyWebTableContents();
		    }
	 @Test(priority=11)
	 public void testNavigationtoOpenCart()
	 {
		 pageobj.verifyNavigateOpenCartSite();
	 }
	 @Test(priority=12)
	 public void testJavascriptAlerts()
	 {
		 pageobj.verifyJavascriptAlerts();
	 }
	 
	 @Test(priority=13)
	public void testPromptAlert()
	{
		 pageobj.verifyConfirmAlerts("Ok");
	}
	
	 
	 @Test(priority=14)
	public void testConfirmationTextAlert()
	{
		 pageobj.verifyPromtAlertInputbox();
	}
	 
	 @Test(priority=15)
	 public void testverifyDoubleClick()
	 {
		 pageobj.verifyDoubleClick();
	 }
	 
	 @Test(priority=16)
	public void testverifyDragnDrop()
	{
		 pageobj.verifyDragnDrop();
	}
	 @Test(priority=17)
	 public void testSlider()
	 {
		 pageobj.verifySlider(); 
	 }
	 
	 @Test(priority=18)
	 public void testResizing() throws InterruptedException
	 {
		 pageobj.verifyResizableControls();
	 }
	 
	 @Test(priority=19)
	 public void testIFrames()
	 {
	    pageobj.verifyiFrames();
	 }
}
