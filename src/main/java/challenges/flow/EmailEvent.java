package challenges.flow;

import flow.IEvent;

public class EmailEvent implements IEvent {
    private String message;

    public EmailEvent(String message) {
        this.message = message;
    }

    public String trigger() {
        return "MSG:" + message;
    }
}
