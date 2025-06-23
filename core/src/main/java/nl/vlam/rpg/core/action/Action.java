package nl.vlam.rpg.core.action;

public abstract class Action {

    private final int id;

    protected Action(int id) {
        this.id = id;
    }


    public abstract int perform(ActionContext context);

    public int getId() {
        return id;
    }

    public String getName() {
        return this.getClass().getSimpleName();
    }
}
