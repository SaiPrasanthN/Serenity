package com.serentiy.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.annotations.CastMember;
import net.thucydides.core.annotations.Managed;

public class BaseClass extends BaseURLClass{
	
	@CastMember
	public Actor james=Actor.named("James");
	public static Properties properties;
	
	
	public WebDriver getDriver() {
	WebDriver driver=BrowseTheWeb.as(james).getDriver();
	return driver;
	}

	public Actor getActor() {
		return  OnStage.theActorInTheSpotlight();
		
	}
	
	
	public Properties getProperties() throws IOException {
		FileInputStream fileInputStream=new FileInputStream(new File(""));
	 properties=new Properties();
	properties.load(fileInputStream);
	return properties;
		
	}
	
}
