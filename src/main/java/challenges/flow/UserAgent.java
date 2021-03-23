package challenges.flow;

import flow.AgentException;
import flow.IAction;
import flow.IAgent;

import java.util.ArrayList;
import java.util.List;

public class UserAgent implements IAgent {
    private String[] messages;

    public UserAgent(String... messages){
        this.messages = messages;
    }

    public List<IAction> act(){
        List<IAction> actions = new ArrayList<IAction>();
        for(String message : messages){
            actions.add(new EmailAction(message));
        }
        return actions;
    }
}
