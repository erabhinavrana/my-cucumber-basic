/**
 * 
 */
package com.abhi.cucumber.runner;

import org.junit.runner.RunWith;

import cucumber.junit.Cucumber;

/**
 * @author Abhinav
 *
 */

@RunWith(Cucumber.class)
@Cucumber.Options(format = {"pretty","html:target/cucumber"},features = {"com/abhi/cucumber/feature"},glue = {"com.abhi.cucumber.glue"})
public class BlogSearchRunner {

}
