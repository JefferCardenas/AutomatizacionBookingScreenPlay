package com.sophos.semillero.tasks;

import org.hamcrest.Matcher;

import com.sophos.semillero.interactions.FillForm;

import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class FillOutForm implements Task{

	private DataTable info;
	
	public FillOutForm(DataTable info) {
		this.info = info;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(
				FillForm.with(info)
				);
	
	}
	
	public static FillOutForm withInfo(DataTable info) {
		return Tasks.instrumented(FillOutForm.class, info);
	}

}
