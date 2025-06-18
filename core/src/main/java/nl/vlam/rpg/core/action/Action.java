package nl.vlam.rpg.core.action;

public interface Action {
    int getId();
    int perform(ActionContext context);

    default String getName() {
        return this.getClass().getSimpleName();
    }
}
