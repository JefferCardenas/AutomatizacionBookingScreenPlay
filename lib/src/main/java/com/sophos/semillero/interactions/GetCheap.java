package com.sophos.semillero.interactions;

import java.util.ArrayList;
import java.util.List;

import com.sophos.semillero.userinterfaces.ResultFlightPage;
import com.sophos.semillero.utils.Find;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;

public class GetCheap implements Interaction{

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		List<WebElementFacade> lstPrices = ResultFlightPage.LIST_PRICES.resolveAllFor(actor);
		List<String> lstWithoutCurrency = new ArrayList<>();
		List<Integer> lstWithoutDot = new ArrayList<>();
		
		/*Limpiamos los precios que me retorna la pagina*/
		for(WebElementFacade item : lstPrices) {
			lstWithoutCurrency.add(item.getText().replace("COP ", ""));
		}
		
		for(String item : lstWithoutCurrency) {
			lstWithoutDot.add(Integer.parseInt(item.replace(".", "")));
		}
		
		System.out.println("EL HOTEL CERCA A LA PLAYA MAS BARATO CUESTA --> $" + Find.cheapPrice(lstWithoutDot));
		
	}
	
	public static GetCheap value() {
		return Tasks.instrumented(GetCheap.class);
	}

}
