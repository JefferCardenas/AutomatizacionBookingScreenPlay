package com.sophos.semillero.interactions;

import org.openqa.selenium.Keys;
import com.sophos.semillero.userinterfaces.HomePageBooking;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class SelectPeopleAndRooms implements Interaction{
	
	private Integer adults;
	private Integer children;
	private Integer rooms;
	
	public SelectPeopleAndRooms(String adults, String children, String rooms) {
		this.adults = Integer.parseInt(adults);
		this.children = Integer.parseInt(children);
		this.rooms = Integer.parseInt(rooms);
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
	

		actor.attemptsTo(
				Click.on(HomePageBooking.BTN_GUEST_COUNT)
				);
		
		/*segun la cantidad de 
		 * adultos, jovenes, o ancianos, 
		 * son las veces que damos click en el boton de agregar*/
		
		/*Decimos que vamos hasta lo que valga getAdult() - 1, ya que
		 * por defecto adult empieza con 1 en la pagina*/
		for(int a = 1; a <= adults - 2; a++) {
			actor.attemptsTo(
					Click.on(HomePageBooking.BTN_ADD_ADULTS)
					);
		}
	
		for(Integer a = 1; a <= children; a++) {
			actor.attemptsTo(
					Click.on(HomePageBooking.BTN_ADD_CHILD)
					);
		}
		
		for(Integer a = 1; a <= rooms - 1; a++) {
			actor.attemptsTo(
					Click.on(HomePageBooking.BTN_ADD_ROOM)
					);
		}
		
		/********************************************/
		
		
	}
	
	public static SelectPeopleAndRooms peopleAndRoom(String adults, String children, String rooms) {
		return Tasks.instrumented(SelectPeopleAndRooms.class, adults, children,rooms);
	}

}
