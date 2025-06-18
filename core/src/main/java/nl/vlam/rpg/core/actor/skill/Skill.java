package nl.vlam.rpg.core.actor.skill;

public enum Skill {

    VITALITY(0),
    ATTACK(1),
    STRENGTH(2),
    DEFENSE(3),
    MAGIC(4);

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
