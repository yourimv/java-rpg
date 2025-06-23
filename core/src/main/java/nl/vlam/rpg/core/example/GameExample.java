package nl.vlam.rpg.core.example;

import java.util.List;
import nl.vlam.rpg.core.action.Action;
import nl.vlam.rpg.core.action.ActionFactory;
import nl.vlam.rpg.core.actor.Enemy;
import nl.vlam.rpg.core.actor.Player;
import nl.vlam.rpg.core.scene.BattleScene;
import nl.vlam.rpg.core.scene.Scene;
import nl.vlam.rpg.shared.input.CLIInput;
import nl.vlam.rpg.shared.provider.PropertiesProvider;

public class GameExample {

    public static void main(String[] args) {
        List<Action> playerActions = ActionFactory.createActions();
        Player player = new Player(0, "Knight", playerActions, new CLIInput());

        List<Action> enemyActions = playerActions; // TODO: Create specific enemy actions
        Enemy enemy = new Enemy(1, "Goblin", 50, 1, 1, enemyActions);

        Scene scene = new BattleScene(player,enemy);
        scene.performScene();
    }
}
