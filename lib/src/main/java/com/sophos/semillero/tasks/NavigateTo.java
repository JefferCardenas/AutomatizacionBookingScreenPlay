package com.sophos.semillero.tasks;

import com.sophos.semillero.userinterfaces.HomePageBooking;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo implements Task{

	private String url;
	
	public NavigateTo(String url) {
		this.url = url;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(
				Open.url(url)
				);
		
	}
	
	public static NavigateTo url(String url) {
		return Tasks.instrumented(NavigateTo.class, url);
	}

}
