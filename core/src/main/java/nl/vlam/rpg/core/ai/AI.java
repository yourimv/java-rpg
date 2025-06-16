package nl.vlam.rpg.core.ai;

import nl.vlam.rpg.core.action.Action;
import nl.vlam.rpg.core.action.ActionContext;

import java.util.List;

public interface AI {
    void chooseAction(List<Action> actions, ActionContext context);
}
