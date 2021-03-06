package uk.oczadly.karl.csgsi;

import uk.oczadly.karl.csgsi.state.GameState;

/**
 * This interface must be implemented by classes that wish to subscribe to game state updates. Objects should be
 * registered to a {@link GSIServer} instance through the {@link GSIServer#registerObserver(GSIObserver)} method.
 */
public interface GSIObserver {
    
    /**
     * Called when a new updated state is received from the game client.
     *
     * @param state   an object containing the latest game state data
     * @param context additional information about the game state and {@link GSIServer}
     */
    void update(GameState state, GameStateContext context);
    
}
