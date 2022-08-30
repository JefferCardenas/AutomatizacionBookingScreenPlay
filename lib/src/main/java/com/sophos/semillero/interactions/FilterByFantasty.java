package com.sophos.semillero.interactions;

import com.sophos.semillero.userinterfaces.ResultFlightPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class FilterByFantasty implements Interaction{

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(
				Click.on(ResultFlightPage.CHECK_FANTASTYC)
				);
		
	}
	
	public static FilterByFantasty filter() {
		return Tasks.instrumented(FilterByFantasty.class);
	}

}
