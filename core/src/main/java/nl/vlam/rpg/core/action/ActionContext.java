package nl.vlam.rpg.core.action;

import nl.vlam.rpg.core.actor.Actor;
import nl.vlam.rpg.core.actor.skill.Skill;

public record ActionContext(Actor performer, Actor target, Skill skill) {

    public ActionContext(Actor performer, Actor target) {
        this(performer, target, Skill.NONE);
    }

}
