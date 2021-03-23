package challenges.flow;

import flow.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.HashMap;
import java.util.Map;


public class EmailStepDefinitions {
    private IAgent user;
    private EmailApp app;

    @Given("A User sends an \"{string}\" message")
    public void user_sends_message(String message) {
        IAgent user = new UserAgent(message);
        this.user = user;
    }

    @When("The message is converted by the Adapter")
    public void adapter_converts_message() throws Exception {
        Map<String, IAdapter> adapters = new HashMap<String, IAdapter>();
        adapters.put("EMAIL", new EmailAdapter());

        EmailApp app = new EmailApp();
        this.app = app;

        Engine engine = new Engine(user, adapters, app);
        engine.run();
    }

    @Then("The Message server should contain the \"{string}\" message in the queue")
    public void message_in_the_queue(String expectedMessage) {
        Assert.assertEquals(expectedMessage, this.app.popMessage());
    }

}
