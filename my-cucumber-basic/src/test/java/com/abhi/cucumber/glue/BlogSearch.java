package com.abhi.cucumber.glue;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.annotation.en.And;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;

public class BlogSearch {

	WebDriver webDriver = null;
	
  @Given("^I am on Abhinav Rana blog site$")
  public void I_am_on_Abhinav_Rana_blog_site() throws Throwable {
	  webDriver = new ChromeDriver();
	  webDriver.navigate().to("https://abhinavranaweb.wordpress.com/blog/");
  }

  @When("^I enter \"([^\"]*)\" in the search text$")
  public void I_enter_in_the_search_text(String searchTxt) throws Throwable {
	  webDriver.findElement(By.name("s")).sendKeys(searchTxt);
  }

  @And("^I clicked on search action$")
  public void I_clicked_on_search_action() throws Throwable {
	  webDriver.findElement(By.name("submit")).submit();
  }

  @Then("^\"([^\"]*)\" blog should be opened$")
  public void blog_should_be_opened(String arg1) throws Throwable {
	  
	  Assert.assertNotNull(By.partialLinkText(arg1));
	  Assert.assertNotNull(webDriver.findElement(By.partialLinkText(arg1)));	  
	  Assert.assertEquals("Blog Title Matched", webDriver.findElement(By.partialLinkText(arg1)).getText(), arg1);
	  webDriver.findElement(By.partialLinkText(arg1)).click();	  
	  webDriver.close();
  }
  
}
