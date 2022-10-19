package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class ScenarioOutlineExamplesStepdefs {

    int initialBillAmount;
    double taxRate;
    double calculatedBillAmount;

    @Given("I have a customer")
    public void iHaveACustomer() {
    }

    @And("User enters initial bill amount as {int}")
    public void userEntersInitialBillAmountAsInitialBillAmount(int initialBillAmount) {
        this.initialBillAmount = initialBillAmount;
    }

    @And("Sales Tax rate is {int} percent")
    public void salesTaxRateIsTaxRatePercent(int taxRate) {
        this.taxRate = taxRate;
    }

    @Then("final bill amount calculate is {int}")
    public void finalBillAmountCalculateIsCalculatedBillAmount(int calculatedBillAmount) {
        double taxAmount = (this.initialBillAmount * this.taxRate)/100;
        this.calculatedBillAmount = this.initialBillAmount + taxAmount;

        Assert.assertTrue(this.calculatedBillAmount == calculatedBillAmount);
    }
}
