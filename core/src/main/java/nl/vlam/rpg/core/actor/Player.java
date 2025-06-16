package nl.vlam.rpg.core.actor;

import java.util.List;
import nl.vlam.rpg.core.action.Action;
import nl.vlam.rpg.core.action.ActionContext;
import nl.vlam.rpg.input.Input;

public class Player extends Actor {

    private Input input;

    public Player(long id, String name, int health, int attackPower, List<Action> actions, Input input) {
        super(id, name, health, attackPower, actions);
        this.input = input;
    }

    @Override
    public void performAction(ActionContext context) {
        if (actions.isEmpty() || !isAlive()) {
            return;
        }
        int choice  = input.get();
        Action action = actions.stream().filter(a -> a.getId() == choice).findFirst().orElseThrow(IllegalStateException::new);
        action.perform(context);
    }
}
