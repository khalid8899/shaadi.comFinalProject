package com.stepdefn;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.pageobject.shaadiPageObject;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;


public class shaadistepdefn
{
	private Logger log = Logger.getLogger(shaadistepdefn.class.getName());
	protected WebDriver driver;
	private shaadiPageObject pageObject;

	
	// Initialize browser
	@Before
	public void setDriver()
	{
		
		try
		{
			System.setProperty("webdriver.chrome.driver","webdriver/chromedriver_win.exe");
			driver=new ChromeDriver();
		}
		catch(Exception e)
		{
			Assert.fail("unable to launch webdriver");
		}

	}
	
	
	@And("^Navigate to \"([^\"]*)\"$")
	public void Navigateto(String url)
	{
		try
		{
			pageObject = new shaadiPageObject(driver);
			pageObject.navigatetoCommunityPage(url);
		}
		catch (Exception e) 
		{
			Assert.fail(e.getMessage());
		}

	}
	

	@And("^Click on SignUp Option$")
	public void signUP()
	{
		try
		{
			pageObject = new shaadiPageObject(driver);
			pageObject.signUpOption();
		}
		catch (Exception e) 
		{
			Assert.fail(e.getMessage());
		}

	}
	
	
	@And("^Select Gender$")
	public void SelectGender()
	{
		try
		{
			pageObject = new shaadiPageObject(driver);
			pageObject.SelectGender();
		}
		catch (Exception e) 
		{
			Assert.fail(e.getMessage());
		}

	}
	
	@And("^Enter Below Details$")
	public void enterbelowDetails(DataTable table) throws Throwable
	{
		try
		{
			Thread.sleep(2000);
			List<List<String>> data = table.asLists(String.class);
			Thread.sleep(3000);
			pageObject = new shaadiPageObject(driver);
			pageObject.enterDetails(data);
		}
		catch(Exception e)
		{
			Assert.fail(e.getMessage());
		}
	}
	
	
	@And("^Create profile for \"([^\"]*)\"$")
	public void Createprofile(String profile)
	{
		try
		{
			pageObject = new shaadiPageObject(driver);
			pageObject.CreateprofileDetails(profile);
		}
		catch (Exception e) 
		{
			Assert.fail(e.getMessage());
		}

	}
	
	
	@And("^Validate Mother Tongue to \"([^\"]*)\"$")
	public void ValidateMotherTongue(String text)
	{
		try
		{
			pageObject = new shaadiPageObject(driver);
			pageObject.ValidateMotherTongue(text);
		}
		catch (Exception e) 
		{
			Assert.fail(e.getMessage());
		}

	}

	
	
	//closing all browser instances 
	@After
	public void closebrowser()
	{	
		try
		{
			driver.quit();
			System.out.println("browser closed successfully");
		}
		catch(Exception e)
		{
			Assert.fail("unable to close browser");
		}

	}



}







