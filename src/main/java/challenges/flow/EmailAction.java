package challenges.flow;

import flow.IAction;

public class EmailAction implements IAction {
    private String message;

    public EmailAction(String message) {
        this.message = message;
    }

    public String execute() {
        return message;
    }

    public String getType() {
        return "EMAIL";
    }
}
