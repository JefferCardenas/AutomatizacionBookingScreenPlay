package com.sophos.semillero.interactions;

import com.gargoylesoftware.htmlunit.util.WebClientUtils;
import com.sophos.semillero.userinterfaces.ResultFlightPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class ChangeCurrency implements Interaction{

	private String currency;
	
	public ChangeCurrency(String currency) {
		this.currency = currency;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(
				Click.on(ResultFlightPage.BTN_CURRENCY),
				WaitUntil.the(ResultFlightPage.CURRENCY.of(currency), WebElementStateMatchers.isClickable()),
				Click.on(ResultFlightPage.CURRENCY.of(currency))
				);
		
		
	}
	
	public static ChangeCurrency currency(String currency) {
		return Tasks.instrumented(ChangeCurrency.class, currency);
	}

}
