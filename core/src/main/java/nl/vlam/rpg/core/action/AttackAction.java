package nl.vlam.rpg.core.action;

import nl.vlam.rpg.core.actor.Actor;

public class AttackAction implements Action {
    @Override
    public int getId() {
        return 0;
    }

    @Override
    public void perform(ActionContext context) {
        Actor performer = context.performer();
        Actor target = context.target();
        System.out.printf("%s perform attack on %s with %s health. The attack does %s damage %n", performer.getName(), target.getName(), target.getHealth(), performer.getAttackPower());
        target.takeDamage(performer.getAttackPower());
        System.out.printf("%s now has %s health %n", target.getName(), target.getHealth());
    }
}
