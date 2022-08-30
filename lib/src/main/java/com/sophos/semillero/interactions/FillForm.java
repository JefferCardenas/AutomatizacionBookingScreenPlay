package com.sophos.semillero.interactions;

import java.util.Map;

import com.sophos.semillero.userinterfaces.HomePageBooking;


import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


public class FillForm implements Interaction {

	private Map<String, String> info;

	public FillForm(DataTable info) {
		
		this.info = info.asMap(String.class, String.class);
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		String[] dateCheckin = info.get("dateCheckin").trim().split("-");
		String[] dateCheckout = info.get("dateCheckout").trim().split("-");
		
		actor.attemptsTo(
				
				Enter.theValue(info.get("arrival")).into(HomePageBooking.TXT_ARRIVAL),
				Click.on(HomePageBooking.BTN_DATE),
				SetDate.on(dateCheckin[1], dateCheckin[0]),
				SetDate.on(dateCheckout[1], dateCheckout[0]),
				SelectPeopleAndRooms.peopleAndRoom(info.get("adults"), info.get("children"), info.get("rooms")),
				Click.on(HomePageBooking.BTN_SEARCH)

		);

	}

	public static FillForm with(DataTable info) {
		return Tasks.instrumented(FillForm.class, info);
	}

}
