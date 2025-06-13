package nl.vlam.rpg.core.action;

import nl.vlam.rpg.core.actor.Actor;

public record ActionContext(Actor performer, Actor target) {
}
