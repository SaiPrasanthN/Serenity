package com.learning.pageelements;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;

import com.serentiy.base.BaseClass;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.questions.CurrentVisibility;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.Wait;

public class LoginPage extends BaseClass {

	
	
	Target username=Target.the("userName").located(By.xpath("//input[@id='user-name']"));
	Target password=Target.the("password").located(By.xpath("//input[@id='password']"));
	Target loginButton=Target.the("loginButton").located(By.xpath("//input[@data-test='login-button']"));
	

	public void enterUserNameAndPassword(String userName,String password) {
		getActor().attemptsTo(Enter.theValue(userName).into(username));
		getActor().attemptsTo(Enter.theValue(password).into(password));
		
		
	}
	
	public void clickOnLoginButton() {
		getActor().attemptsTo(Click.on(loginButton));
	}
	
	public boolean isUserOnLoginPage() {
		
		boolean isUser=getActor().asksFor(CurrentVisibility.of(loginButton));
		return isUser;
	}
	
//	public void explicitWait(Target element,int seconds) {
//	
//		waitForCondition().withTimeout(Duration.ofSeconds(seconds)).pollingEvery(Duration.ofSeconds(2)).until(ExpectedConditions.visibilityOf(element));
//		
//	}
	
	
	
}
