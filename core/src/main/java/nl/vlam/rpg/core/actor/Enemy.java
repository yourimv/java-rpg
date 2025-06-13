package nl.vlam.rpg.core.actor;

import java.util.List;
import nl.vlam.rpg.core.action.Action;
import nl.vlam.rpg.core.action.ActionContext;

public class Enemy extends Actor {
    public Enemy(long id, String name, int health, int attackPower, List<Action> actions) {
        super(id, name, health, attackPower, actions);
    }

    @Override
    public void performAction(ActionContext context) {
        if (actions.isEmpty()) {
            return;
        }
        // For simplicity, just pick the first action available for the enemy.
        Action action = actions.getFirst();
        action.perform(context);
    }
}
