package com.pageobject;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;

//import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.utility.utilityfunctions;

import java.util.Iterator;
import java.util.List;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class shaadiPageObject {
	protected WebDriver driver;
    static Logger log = Logger.getLogger(shaadiPageObject.class);
   
	
	public shaadiPageObject(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="(//a[text()='Sign Up'])[1]")
	private WebElement signUpBtn;
	
	@FindBy(xpath="//input[@name='email']")
	private WebElement emailField;
	
	@FindBy(xpath="//input[@name='password1']")
	private WebElement passwordField;
	
	@FindBy(xpath="//div[text()='Select']")
	private WebElement selectDiv;
	
	public String opt= "//div[@class='Dropdown-option' and text()='%tmp%']";
	
	@FindBy(xpath="//input[@value='Male']")
	private WebElement selectMaleOpt;
	
	@FindBy(xpath="(//button[text()='Next'])[2]")
	private WebElement nxtBtn;
	
	@FindBy(xpath="//label[text()='Mother tongue']/following::div[3]//div[1]")
	private WebElement motherTongueTxt;
	


	

	public void navigatetoCommunityPage(String url) throws InterruptedException
	{
		Thread.sleep(2000);
	    driver.get(url);
		Thread.sleep(2000);
		driver.manage().window().maximize();
		System.out.println("Current Url is:" +driver.getCurrentUrl());
			
	}

	public void signUpOption()
	{
		try
		{
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		utilityfunctions.waitForElementVisible(driver, signUpBtn);
		signUpBtn.click();
		}
		catch(Exception e)
		{
		Assert.fail();
		}
		
		
	}



	public void enterDetails(List<List<String>> data)
	{
		
		try
		{
		//enter email and password
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		utilityfunctions.waitForElementVisible(driver, emailField);
		emailField.sendKeys(data.get(1).get(0));
		utilityfunctions.waitForElementVisible(driver, passwordField);
		passwordField.sendKeys(data.get(1).get(1));
		
		}
		catch(Exception e)
		{
		Assert.fail();
		}
		
	}

	public void CreateprofileDetails(String profile) 
	{
		
		try
		{
		//Create profile  
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		utilityfunctions.waitForElementVisible(driver, selectDiv);
		selectDiv.click();
		Thread.sleep(2000);
		String optnew=opt.replace("%tmp%", profile);
		driver.findElement(By.xpath(optnew)).click();
		
		}
		catch(Exception e)
		{
		Assert.fail();
		}
		
		
	}
	

	public void SelectGender()
	{
		try
		{
		//Select Gender
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		selectMaleOpt.click();
		nxtBtn.click();
		}
		catch(Exception e)
		{
		Assert.fail();
		}
		
	}

	
	public void ValidateMotherTongue(String text)
	{
		
		try
		{
		//Validate mother Tongue 
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		if(motherTongueTxt.getText().equalsIgnoreCase(text))
		{
			System.out.println("mother tongue is "+motherTongueTxt.getText());
		}
		else
		{
			Assert.fail("Mother tongue is incorrect");
		}
		
		}
		catch(Exception e)
		{
		Assert.fail();
		}
		
		
	}
	
	
}
