package nl.vlam.rpg.core.ai;

import nl.vlam.rpg.core.action.Action;
import nl.vlam.rpg.core.action.ActionContext;

import java.util.List;

public class RandomAI implements AI {
    @Override
    public void chooseAction(List<Action> actions, ActionContext context) {
        if (actions.isEmpty()) {
            return;
        }
        // Randomly select an action from the list of available actions
        int randomIndex = (int) (Math.random() * actions.size());
        Action selectedAction = actions.get(randomIndex);
        selectedAction.perform(context);
    }
}
