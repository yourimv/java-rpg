package nl.vlam.rpg.core.actor;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

import nl.vlam.rpg.core.action.Action;
import nl.vlam.rpg.core.action.ActionContext;
import nl.vlam.rpg.core.actor.skill.Skill;
import nl.vlam.rpg.core.actor.skill.SkillProgress;
import nl.vlam.rpg.input.Input;

public class Player extends Actor {

    private Input input;
    private static Map<Skill, SkillProgress> skills = new EnumMap<>(Skill.class);

    static {
        for (Skill skill : Skill.values()) {
            skills.put(skill, new SkillProgress());
        }
    }

    public Player(long id, String name, List<Action> actions, Input input) {
        super(id, name,
            (skills.get(Skill.VITALITY).getLevel() + 9),
            skills.get(Skill.STRENGTH).getLevel(),
            skills.get(Skill.DEFENSE).getLevel(),
        actions);
        this.input = input;
        for (Skill skill : Skill.values()) {
            skills.put(skill, new SkillProgress());
        }
    }

    @Override
    public void performAction(ActionContext context) {
        if (actions.isEmpty() || !isAlive()) {
            return;
        }
        int choice = input.get();
        Action action = actions.stream().filter(a -> a.getId() == choice).findFirst().orElseThrow(IllegalStateException::new);
        // For now, action id matches skill id
        Skill skill = Skill.fromId(action.getId());
        skills.get(skill).gainExperience(action.perform(context));
    }
}
