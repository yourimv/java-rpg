package nl.vlam.rpg.core.actor;

import java.util.List;
import nl.vlam.rpg.core.action.Action;
import nl.vlam.rpg.core.action.ActionContext;
import nl.vlam.rpg.core.actor.skill.Skill;
import nl.vlam.rpg.core.ai.AI;
import nl.vlam.rpg.core.ai.RandomAI;

public class Enemy extends Actor {

    private final List<AI> ais;

    public Enemy(long id, String name, int health, int attackPower, int defensePower, List<Action> actions) {
        super(id, name, health, attackPower, defensePower, actions);
        ais = List.of(new RandomAI());
    }

    @Override
    public void performAction(ActionContext context) {
        if (actions.isEmpty() || !isAlive()) {
            return;
        }
        // For simplicity, just pick a random AI behaviour
        ais.get((int) (Math.random() * ais.size())).chooseAction(actions, context);
    }
}
