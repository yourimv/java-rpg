package nl.vlam.rpg.core.action;

public interface Action {
    int getId();
    void perform(ActionContext context);
}
