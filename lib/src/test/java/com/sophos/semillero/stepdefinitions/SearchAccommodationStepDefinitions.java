package com.sophos.semillero.stepdefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

import com.sophos.semillero.tasks.FillOutForm;
import com.sophos.semillero.tasks.GetCheapAccommodation;
import com.sophos.semillero.tasks.NavigateTo;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class SearchAccommodationStepDefinitions {
	
	@Before
	public void setup() {
		OnStage.setTheStage(new OnlineCast());
	}
	
	@Given("I am on the main booking page {string}")
	public void iAmOnTheMainBookingPage(String url) {
		
	    theActorCalled("QA").wasAbleTo(NavigateTo.url(url));
	    
	}

	@When("looking for accommodation")
	public void lookingForAccommodation(DataTable info) {
	    
		theActorInTheSpotlight().attemptsTo(FillOutForm.withInfo(info));
	}

	@Then("I see the available accommodations")
	public void iSeeTheAvailableAccommodations(DataTable info) {
		
	    theActorInTheSpotlight().attemptsTo(GetCheapAccommodation.value(info));
	}

}
