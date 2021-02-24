package co.com.choucair.certification.utest.stepdefinitions;

import co.com.choucair.certification.utest.model.UtesterData;
import co.com.choucair.certification.utest.questions.Answer;
import co.com.choucair.certification.utest.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class UtestStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than natalia want join today a utester$")
    public void thanNataliaWantJoinTodayAUtester() throws Exception {
        OnStage.theActorCalled("Natalia").wasAbleTo(OpenUp.thePage(),(SignUp.onThePage()));
    }


    @When("^she setting up your account$")
    public void sheSettingUpYourAccount(List<UtesterData> utesterData) throws Exception {
            OnStage.theActorInTheSpotlight().attemptsTo( (SettingUpStep1.the(utesterData.get(0).getStrFirstName(), utesterData.get(0).getStrLastName(), utesterData.get(0).getStrEmail())),
                SettingUpStep2.the(), SettingUpStep3.the(), SettingUpStep4.the(utesterData.get(0).getStrPassword(), utesterData.get(0).getStrConfirmPassword())
        );
    }

    @Then("^she get up your account$")
    public void sheGetUpYourAccount(List<UtesterData> utesterData) throws Exception {
        //OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(utesterData.get(0).getStrWelcome())));

    }
}
