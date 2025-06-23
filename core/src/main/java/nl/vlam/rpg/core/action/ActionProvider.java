package nl.vlam.rpg.core.action;

import nl.vlam.rpg.shared.provider.PropertiesProvider;

public class ActionProvider extends PropertiesProvider {

    private ActionProvider(String propertiesFile) {
        super(propertiesFile);
    }

    private static class Holder {
        private static final ActionProvider INSTANCE = new ActionProvider("action-ids.properties");
    }

    public static ActionProvider getInstance() {
        return Holder.INSTANCE;
    }
}
