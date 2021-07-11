package com.DLGtest.login;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Features", glue ={"stepD"})

public class Runner {

}
