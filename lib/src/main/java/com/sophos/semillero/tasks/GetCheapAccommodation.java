package com.sophos.semillero.tasks;

import java.util.Map;

import com.sophos.semillero.interactions.ChangeCurrency;
import com.sophos.semillero.interactions.FilterByFantasty;
import com.sophos.semillero.interactions.GetCheap;

import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class GetCheapAccommodation implements Task{

	private Map<String, String> info;
	
	public GetCheapAccommodation(DataTable info) {
		this.info = info.asMap(String.class, String.class);
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(
				FilterByFantasty.filter(),
				ChangeCurrency.currency(info.get("currency")),
				GetCheap.value()
				);
		
	}
	
	public static GetCheapAccommodation value(DataTable info) {
		return Tasks.instrumented(GetCheapAccommodation.class, info);
	}

}
