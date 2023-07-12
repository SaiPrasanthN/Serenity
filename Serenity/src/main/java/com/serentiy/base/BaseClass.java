package com.serentiy.base;

import org.openqa.selenium.WebDriver;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class BaseClass {
	
	
	Actor actor=Actor.named("James");
	WebDriver driver=BrowseTheWeb.as(actor).getDriver();
	

}
