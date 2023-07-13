package com.learning.runner;

import org.junit.runner.RunWith;

import com.serentiy.base.BaseClass;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src//test//java",glue = "com.learning.stepdefinitions")


public class RunnerClass extends BaseClass{

}
