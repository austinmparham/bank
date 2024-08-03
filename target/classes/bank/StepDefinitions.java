package bank;

import io.cucumber.java.en.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assertions.*;

public class StepDefinitions {

    private Integer deckCount;

    @Given("an example scenario")
    public void anExampleScenario() {
    }

    @When("I draw {int} cards")
    public void iDrawCards(int cards) {
        deckCount -= cards;
        System.out.println("Deck count:"+deckCount);
    }

    @Then("There are {int} cards remaining in deck")
    public void cardsRemainingInDeck(int cards) {
        Assertions.assertEquals(cards, deckCount);
    }

    @Given("I start with a {int} card deck")
        public void iStartWithNumCardDeck(int num){
            deckCount = num;
        }
}
