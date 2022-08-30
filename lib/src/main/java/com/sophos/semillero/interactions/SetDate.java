package com.sophos.semillero.interactions;

import com.sophos.semillero.userinterfaces.HomePageBooking;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SetDate implements Interaction{

	private String monthAndYear;
	private String day;
	
	public SetDate(String monthAndYear, String day) {
		
		this.monthAndYear = monthAndYear;
		this.day = day;
		
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		
		/*Avanzamos hasta el mes y año indicado*/
		while(!HomePageBooking.LBL_MONTH.resolveFor(actor).getTextContent().equals(monthAndYear)) {
			
			actor.attemptsTo(
					Click.on(HomePageBooking.BTN_NEXT)
					);
		}
		/********************************************/
		
		/*Una vez encontrado el mes, ahora procedemos a seleccionar el dia*/
		actor.attemptsTo(
				Click.on(HomePageBooking.LBL_DAY.of(day))
				);
		
		/********************************************/
		
	}
	
	public static SetDate on(String monthAndYear, String day) {
		return Tasks.instrumented(SetDate.class, monthAndYear, day);
	}

}
