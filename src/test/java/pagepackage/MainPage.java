package pagepackage;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

//------https://testautomationpractice.blogspot.com/

public class MainPage {
 WebDriver driver;

 JavascriptExecutor js;
 Actions myAction;
 Alert myAlert;
 
 @FindBy(xpath = "//h1[normalize-space()='Automation Testing Practice']")
 WebElement lblmainTitle;
 
 @FindBy(xpath = "//input[@id='name']")
 WebElement txtName;
 
 @FindBy(xpath = "//input[@id='email']")
 WebElement txtEmail;
 
 @FindBy(xpath = " //input[@id='phone']")
 WebElement txtPhone;
 
 @FindBy(xpath = "//textarea[@id='textarea']")
 WebElement txaAddress;
 
 @FindBy(xpath = "//input[@id='male']")
 WebElement rdoMale;
 
 @FindBy(xpath = "//input[@id='female']")
 WebElement rdoFemale;
 
 @FindBy(xpath = "//*[@id=\"sunday\"]")
 WebElement chkSunday;
 
 @FindBy(xpath = "//input[@id='monday']")
 WebElement chkMonday;
 
 @FindBy(xpath = "//input[@id='tuesday']")
 WebElement chkTuesday;
 
 @FindBy(xpath = "//input[@id='wednesday']")
 WebElement chkWednesday;
 
 @FindBy(xpath = "//input[@id='thursday']")
 WebElement chkThursday;
 
 @FindBy(xpath ="//input[@id='friday']")
 WebElement chkFriday;
 
 @FindBy(xpath ="//input[@id='saturday']")
 WebElement chkSaturday;
 
 @FindBy(xpath ="//select[@id='country']")
 WebElement ddlCountry;
 
 @FindBy(xpath = "//select[@id='colors']")
 WebElement ddlmultiSelectColor;
 
 @FindBy(xpath = "//input[@id='datepicker']")
 WebElement datepickerDate;
 
 @FindBy(xpath = "//span[@class='ui-datepicker-month']")
 WebElement datepickerMonthSelected;
 
 @FindBy(xpath = "//a[normalize-space()='open cart']")
 WebElement linkOpenCart;
 
 @FindBy(xpath = "//a[normalize-space()='orange HRM']")
 WebElement linkOrangeHRM;
 
 @FindBy(xpath = "//a[normalize-space()='Home']")
 WebElement linkHome;
 
 
 @FindBy(xpath = "//a[normalize-space()='Posts (Atom)']")
 WebElement linkSubscribePostAtom;
 
 @FindBy(xpath = "//*[@id=\"HTML1\"]/div[1]/table/tbody/tr")
 WebElement tblBookWebTableRows;
 
 @FindBy(xpath = "//input[@id='Wikipedia1_wikipedia-search-input']")
 WebElement txtSearchWiki;
 
 @FindBy(xpath = "//button[normalize-space()='New Browser Window']")
 WebElement btnNewBrowserWindow;
 
 @FindBy(xpath = "//button[normalize-space()='Alert']")
 WebElement btnAlert;
 
 @FindBy(xpath = "//button[normalize-space()='Confirm Box']")
 WebElement btnConfirmBox;
 
 @FindBy(xpath = "//button[normalize-space()='Prompt']")
 WebElement btnPrompt;
 
 @FindBy(xpath= "//input[@id='field1']")
 WebElement txtCopyTextField1;
 
 @FindBy(xpath="//input[@id='field2']")
 WebElement txtCopyTextField2;
 
 @FindBy(xpath="//button[normalize-space()='Copy Text']")
 WebElement btnCopyText;
 
 @FindBy(xpath="//div[@id='draggable']")
 WebElement imgDraggableSource;
 
 @FindBy(xpath="//div[@id='droppable']")
 WebElement imgDropDestination;
 
 @FindBy(xpath="//div[@id='slider']")
 WebElement btnslider;
 
 @FindBy(xpath="//*[@id=\"RESULT_TextField-0\"]")
 WebElement txtFrameName;
 
 @FindBy(xpath="")
 WebElement rdoFrameMale;
 
 @FindBy(xpath="")
 WebElement rdoFrameFemale;
 
 @FindBy(xpath="")
 WebElement datepickerFrame;
 
 @FindBy(xpath="//*[@id=\"RESULT_RadioButton-3\"]")
 WebElement ddlJobInsideFrame;
 
 @FindBy(xpath="//*[@id=\"FSsubmit\"]")
 WebElement btnSubmit; 
 
 @FindBy(xpath="//div[@id='resizable']")
 WebElement imgResizable;
 
 @FindBy(xpath="//*[@id=\"resizable\"]/div[3]")
 WebElement resizeHandle;
 
 @FindBy(xpath="//input[@type='submit']")
 WebElement btnSearchWiki;
 
 @FindBy(xpath ="//iframe[@id='frame-one796456169']")
 WebElement iFramename;

// @FindBy(tagName = "")
List <WebElement> daysCheckBoxList;

@FindBy(xpath="//*[@id=\"ui-datepicker-div\"]/table/tbody/tr/td")
List <WebElement> Alldates;
 
	public MainPage(WebDriver driver) {
		
		this.driver = driver;
        PageFactory.initElements(driver, this);
        js= (JavascriptExecutor) driver;
        myAction=new Actions(driver);
        //Checkboxes for Dates field>>
        daysCheckBoxList = new ArrayList<>();
        daysCheckBoxList.add(chkSunday);
        daysCheckBoxList.add(chkMonday);
        daysCheckBoxList.add(chkTuesday);
        daysCheckBoxList.add(chkWednesday);
        daysCheckBoxList.add(chkThursday);
        daysCheckBoxList.add(chkFriday);
        daysCheckBoxList.add(chkSaturday);
	}

	public void VerifyTitle()
	{
		String expectedTitle="Automation Testing Practice";
		String mainTitle=lblmainTitle.getText();
		assertEquals(mainTitle, expectedTitle);
	}
	public void SendTextstoTextFields()
	{
		//passing values to the normal Textbox fields #name,#email,#phone,#address
		//JavascriptExecutor js = (JavascriptExecutor) driver;
       // js.executeScript("window.scrollTo(0, 0);");
		txtName.sendKeys("#NameValue");
		txtEmail.sendKeys("testemail@gmail.com");
		txtPhone.sendKeys("00-234-567-645");
		txaAddress.sendKeys("This is the value passign to the Address Area");
		
	}
	public void VerifyGenderRadiobutton()
	{			
		  rdoMale.click();
		  System.out.println("Radiobutton for Male is Selected "+rdoMale.isSelected());
		  rdoFemale.click();
		  System.out.println("Radiobutton for Female is Selected "+rdoMale.isSelected());
	}	
	    public void checkAllDateCheckBoxes() {
	        for (WebElement checkBox : daysCheckBoxList) {
	            if (!checkBox.isSelected()) {
	                checkBox.click();
	            }
	        }
	    }
	    public void uncheckAllDateCheckBoxes() {
	        for (WebElement checkBox : daysCheckBoxList) {
	            if (checkBox.isSelected()) {
	                checkBox.click();
	            }
	        }
	    }
	  
	    public String verifyCountryDropdown()
	    {
	    	 
	    	Select ddlCountryvalues=new Select(ddlCountry);
	    	ddlCountryvalues.selectByValue("australia");
	    	ddlCountryvalues.selectByValue("usa");
	    	ddlCountryvalues.selectByValue("canada");
	    	ddlCountryvalues.selectByValue("france");
	    	ddlCountryvalues.selectByValue("china");
	    	ddlCountryvalues.selectByValue("india");
	    	System.out.println("Country dropdown is selected :"+ddlCountry.isDisplayed()+ddlCountry.getAttribute("value"));
	    	return ddlCountry.getAttribute("value");
	    }
	    public void verifyMultiSelectDropdownColor()
	    {
	    	js.executeScript("window.scrollBy(0,250)", "");
	    	Select multiSelect=new Select(ddlmultiSelectColor);            	
	    	List<WebElement> selectedOptions = multiSelect.getOptions();	        
	    	
	        for (int i=0;i<selectedOptions.size();i++)
	        {
	        	String color = selectedOptions.get(i).getText();
	        	multiSelect.selectByVisibleText(color);
	        	System.out.println(color);
	        }	    	
	    }
	    public void verifyDatepickerforDate(String ExpectedMonthYear, String ExpectedDay) throws Exception
	    {
	    	datepickerDate.click();
	    	DataPickerMethod(ExpectedMonthYear,ExpectedDay);
	    }
	    public void DataPickerMethod(String ExpectedMonthYear, String ExpectedDay) throws Exception
	     {
	    	Thread.sleep(1000);
	    	while(true)
	    	{
	    		
	    		String actualmonth=datepickerMonthSelected.getText();	    	
	    		
		     if(ExpectedMonthYear.equals(actualmonth))
	    		{
			        System.out.println("Actual month: "+actualmonth);
	    			break;
	    		}
	    		//Go to next month>>>
		     driver.findElement(By.xpath("//a[@title='Next']")).click();
	    		    		
	    	}
	    	
	    	//-------------Day----------------
	    	
	    	for(WebElement E:Alldates)
	    	{    		
	    		String CurrentDay=E.getText();	    		
	    		if(CurrentDay.equals(ExpectedDay))
	    		{
	    			System.out.println("Actual Day: "+CurrentDay);
	    			E.click();
	    			break;
	    		}
	    	}
	    	}
	    
	    public void verifyWikipediaSearch(String searchText)
	    {
	    	txtSearchWiki.sendKeys(searchText);
	    	btnSearchWiki.click();
	    	//List<WebElement> SearchResults=driver.findElements(By.xpath("//*[@id=\"Wikipedia1_wikipedia-search-results\"]"));
	    	//System.out.println("Search results count "+SearchResults.size());
	    }
	    public void verifyPaginationTable(int TotalPages)
	    {
	    	js.executeScript("window.scrollBy(0,550)", "");
	    	Select multiSelect=new Select(ddlmultiSelectColor); 
	    	System.out.println("Data read from Pagination WebTable ");
	    	//repeating pages
	    	for(int i=1;i<TotalPages+1;i++)
	    	{
	    		if(TotalPages>1)
	    		{
	    			WebElement activePage=driver.findElement(By.xpath("//*[@id=\"pagination\"]/li["+i+"]/a"));
	    			activePage.click();
	    		}
	    	
			    	//Reading Data from the table
			    	int rowCount=driver.findElements(By.xpath("//*[@id=\"productTable\"]/tbody//tr")).size();
			    	for(int r=1;r<rowCount+1;r++)
			    	{
			    		String productName=driver.findElement(By.xpath("//*[@id=\"productTable\"]/tbody//tr["+r+"]/td[2]")).getText();
			    		
			    		String Price=driver.findElement(By.xpath("//*[@id=\"productTable\"]/tbody//tr["+r+"]/td[3]")).getText();
			    		System.out.println("Product Name = "+productName+" Price "+Price);
			    	}
	       }
	    	
	    }
	    public void verifyWebTableContents()
    	{
	    	System.out.println("Contents from Books WebTable");
	    	int rowCountWebTable=driver.findElements(By.xpath("//*[@id=\"HTML1\"]/div[1]/table/tbody/tr")).size();
	    	for(int row=2;row<(rowCountWebTable+1);row++)
	    	{
	    		String bookName=driver.findElement(By.xpath("//*[@id=\"HTML1\"]/div[1]/table/tbody/tr["+row+"]/td[1]")).getText();	    		
	    		String AuthorName=driver.findElement(By.xpath("//*[@id=\"HTML1\"]/div[1]/table/tbody/tr["+row+"]/td[2]")).getText();
	    		String Subject=driver.findElement(By.xpath("//*[@id=\"HTML1\"]/div[1]/table/tbody/tr["+row+"]/td[3]")).getText();
	    		String Price=driver.findElement(By.xpath("//*[@id=\"HTML1\"]/div[1]/table/tbody/tr["+row+"]/td[4]")).getText();
	    		
	    		System.out.println("BookName = "+bookName+" AuthorName = "+AuthorName+" Subject = "+Subject+" Price = "+Price);
	    	}
    	}
	    
	    public void verifyNavigateOpenCartSite()
	    {
	    	btnNewBrowserWindow.click();
	    	 ArrayList<String> windows=new ArrayList<String>(driver.getWindowHandles());
	         driver.switchTo().window(windows.get(0));
	    }
	    public void verifyJavascriptAlerts()
	    {
	    	btnAlert.click();
	    	myAlert=driver.switchTo().alert();
	    	String alertText=myAlert.getText();
			System.out.println(alertText);
			myAlert.accept();
	    }
	    public void verifyConfirmAlerts(String action)
	    {
	    	//..Confirmation Alert
	    	btnConfirmBox.click();
	    	myAlert=driver.switchTo().alert();
	    	if(action=="Ok")
	    	{
	    		myAlert.accept();
	    	}
	    	else
	    	{
	    		myAlert.dismiss();
	    	}
	    }
	    public void verifyPromtAlertInputbox()
	    {
	    	//..verify Promt Alert Inputbox
	    	btnPrompt.click();
	    	myAlert=driver.switchTo().alert();
	    	myAlert.sendKeys("Chocolate Donuts!");  
	    	myAlert.accept();
	    		    	
	    }
	    public void verifyDoubleClick()
	    {
	    	
	    	myAction.doubleClick(btnCopyText).perform();
	    	//myAlert = driver.switchTo().alert();
			System.out.println(txtCopyTextField2.getText());
		//	myAlert.accept();
	    }
	    
	    public void verifyDragnDrop()
	    {
	    	myAction.dragAndDrop(imgDraggableSource, imgDropDestination);
	    	myAction.build().perform();
	    }
	    public void verifySlider()
	    {
	    	js.executeScript("window.scrollBy(0,550)", "");
	    	myAction.dragAndDropBy(btnslider, 50, 0).perform();
	    }
	    public void verifyResizableControls() throws InterruptedException
	    {
	    	//js.executeScript("window.scrollBy(0,1300)", "");
	    	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", resizeHandle);
	    	Thread.sleep(500); 
	    	System.out.println("Before Resizing Height= "+imgResizable.getSize().getHeight()+" Before Resizing Width" +imgResizable.getSize().getWidth());
	    	//resizeHandle.click();	    	
			myAction.dragAndDropBy(resizeHandle, 100, 100).perform();
			System.out.println("After Resizing Height= "+imgResizable.getSize().getHeight()+" After Resizing Width" +imgResizable.getSize().getWidth());
		
	    }
	    public void verifyiFrames()
	    {
	    	js.executeScript("window.scrollBy(0,1000)", "");
	    	//driver.switchTo().frame(0);
	    	driver.switchTo().frame(iFramename);
	    	txtFrameName.sendKeys("Inside Frame!");
	    	
	    	Select ddlIframeOptions=new Select(ddlJobInsideFrame);
	    	ddlIframeOptions.selectByValue("Radio-0");
	    }
 }


