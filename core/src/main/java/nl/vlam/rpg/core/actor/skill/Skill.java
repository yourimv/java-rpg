package nl.vlam.rpg.core.actor.skill;

public enum Skill {
    NONE(0),
    VITALITY(1),
    ATTACK(2),
    STRENGTH(3),
    DEFENSE(4),
    MAGIC(5);

    private final int id;

    Skill(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public static Skill fromId(int id) {
        for (Skill skill : values()) {
            if (skill.id == id) {
                return skill;
            }
        }
        throw new IllegalArgumentException("No skill found with id: " + id);
    }
}
