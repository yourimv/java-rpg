package nl.vlam.rpg.core.scene;

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
            System.out.println("Player's turn:");
            player.performAction(new ActionContext(player, enemy));
        }
    }
}
