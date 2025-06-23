package nl.vlam.rpg.core.action;

import nl.vlam.rpg.shared.provider.PropertiesProvider;

import java.util.ArrayList;
import java.util.List;

public class ActionFactory  {

    private ActionFactory(){
        // Private constructor to prevent instantiation
    }

    public static List<Action> createActions() {
        List<Action> actions = new ArrayList<>();
        ActionProvider actionProvider = ActionProvider.getInstance();
        for (String actionKey : actionProvider.getAllPropertyKeys()) {
            switch (actionKey.toLowerCase()) {
                case "attack":
                    actions.add(new AttackAction(actionProvider.getId(actionKey)));
                    break;
                // TODO: Add more cases for other actions
            }
        }
        return actions;
    }
}