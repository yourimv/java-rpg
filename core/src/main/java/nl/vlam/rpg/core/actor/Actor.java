package nl.vlam.rpg.core.actor;

import java.util.List;
import nl.vlam.rpg.core.action.Action;
import nl.vlam.rpg.core.action.ActionContext;
import nl.vlam.rpg.core.actor.skill.Skill;

public abstract class Actor {
    protected long id;
    protected String name;
    protected int health;
    protected int attackPower;
    protected int defensePower;
    protected List<Action> actions;

    protected Actor(long id, String name, int health, int attackPower, int defensePower, List<Action> actions) {
        this.id = id;
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
        this.defensePower = defensePower;
        this.actions = actions;
    }

    protected Actor() {
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public int getDefensePower() {
        return defensePower;
    }

    public List<Action> getActions() {
        return actions;
    }

    public void takeDamage(int damage) {
        health -= damage;
    }

    public boolean isAlive() {
        return health > 0;
    }

    public abstract void performAction(ActionContext context);
}
