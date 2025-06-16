package nl.vlam.rpg.core.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import nl.vlam.rpg.core.action.Action;
import nl.vlam.rpg.core.action.AttackAction;
import nl.vlam.rpg.core.actor.Enemy;
import nl.vlam.rpg.core.actor.Player;
import nl.vlam.rpg.core.scene.BattleScene;
import nl.vlam.rpg.core.scene.Scene;
import nl.vlam.rpg.input.CLIInput;

public class GameExample {

    public static void main(String[] args) {
        List<Action> playerActions = List.of(new AttackAction());
        Player player = new Player(0, "Knight", 100, 25, playerActions, new CLIInput());

        List<Action> enemyActions = List.of(new AttackAction());
        Enemy enemy = new Enemy(1, "Goblin", 50, 1, enemyActions);

        Scene scene = new BattleScene(player,enemy);
        scene.performScene();
    }
}
