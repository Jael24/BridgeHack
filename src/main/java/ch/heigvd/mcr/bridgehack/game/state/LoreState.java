package ch.heigvd.mcr.bridgehack.game.state;

import ch.heigvd.mcr.bridgehack.game.BridgeHack;
import org.newdawn.slick.*;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

/**
 * This class represents the second state of the game.
 * In this state, the history and the aim of the game are explained.
 * Finally, the player has to choose a race and a role.
 */
public class LoreState extends BasicGameState {
    public static final int ID = 2;
    private BridgeHack game;

    private final String title = "Welcome in BridgeHack";
    private final String lore = "Your adventure starts here.\n" +
            "Your destiny is to find the lost item somewhere in this dungeon.\n" +
            "Unfortunately, it seems like your journey will not be easy... The item is on the third level\n" +
            "of the dungeon. When you find it, you will be able to get out thanks to a portal.\n" +
            "You will have to fight against many creatures.";
    private final String choose = "It's time to make your choice. Please select a race and a role.";


    @Override
    public void init(GameContainer gameContainer, StateBasedGame stateBasedGame) throws SlickException {
        game = (BridgeHack) stateBasedGame;
    }

    @Override
    public void render(GameContainer gameContainer, StateBasedGame stateBasedGame, Graphics graphics) {
        graphics.drawString(title, 0, 50);
        graphics.drawString(game.getUsername() + "!", 200, 50);
        graphics.drawString(lore, 0, 80);
        graphics.drawString(choose, 0, 250);
    }

    @Override
    public void update(GameContainer gameContainer, StateBasedGame stateBasedGame, int i) {

    }

    @Override
    public int getID() {
        return ID;
    }

    @Override
    public void keyReleased(int key, char c) {
        game.enterState(GameState.ID);
    }
}
