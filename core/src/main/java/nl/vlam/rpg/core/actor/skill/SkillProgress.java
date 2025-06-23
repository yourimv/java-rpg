package nl.vlam.rpg.core.actor.skill;

public class SkillProgress {

    private int experience;
    private int level;

    public SkillProgress() {
        this.experience = 0;
        this.level = 1;
    }

    public SkillProgress(int experience, int level) {
        this.experience = experience;
        this.level = level;
    }

    public int getExperience() {
        return experience;
    }

    public int getLevel() {
        return level;
    }

    public void gainExperience(int baseAmount) {
        final int amount = baseAmount * 4;
        this.experience += amount;
        int requiredExperience = getExperienceForNextLevel();
        if (this.experience >= requiredExperience) {
            level++;
        }
        System.out.printf("Gained %d experience.%n Total experience: %d.%n Required experience for level up: %d.%n Current level: %d.%n",
                amount, this.experience, requiredExperience, this.level);
    }

    private int getExperienceForNextLevel() {
        return (int) Math.ceil(5 * (Math.pow(level, 3)) / 4) * 4;
    }
}
