package nl.vlam.rpg.core.scene;

import nl.vlam.rpg.core.action.Action;
import nl.vlam.rpg.core.action.ActionContext;
import nl.vlam.rpg.core.actor.Enemy;
import nl.vlam.rpg.core.actor.Player;

public class BattleScene extends Scene {
    private Player player;
    private Enemy enemy;

    public BattleScene(Player player, Enemy enemy) {
        this.player = player;
        this.enemy = enemy;
    }

    @Override
    public void performScene() {
        System.out.println("battle initiated");
        while (player.isAlive() && enemy.isAlive()) {
            System.out.printf("%nPlayer: %s (Health: %d) vs Enemy: %s (Health: %d)%n",
                    player.getName(), player.getHealth(), enemy.getName(), enemy.getHealth());
            System.out.println("Choose an action:");
            for (Action action : player.getActions()) {
                System.out.printf("Action: %s (ID: %d) ||", action.getName(), action.getId());
            }
            System.out.println();
            player.performAction(new ActionContext(player, enemy));
            enemy.performAction(new ActionContext(enemy, player));
        }
    }
}
