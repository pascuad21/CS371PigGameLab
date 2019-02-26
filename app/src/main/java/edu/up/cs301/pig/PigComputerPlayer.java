package edu.up.cs301.pig;

import edu.up.cs301.game.GameComputerPlayer;
import edu.up.cs301.game.actionMsg.GameAction;
import edu.up.cs301.game.infoMsg.GameInfo;
import edu.up.cs301.game.util.Tickable;

/**
 * An AI for Pig
 *
 * @author Andrew M. Nuxoll
 * @version August 2015
 */
public class PigComputerPlayer extends GameComputerPlayer {

    public PigGameState pgs;
    /**
     * ctor does nothing extra
     */
    public PigComputerPlayer(String name) {
        super(name);
    }

    /**
     * callback method--game's state has changed
     *
     * @param info
     * 		the information (presumably containing the game's state)
     */
    @Override
    protected void receiveInfo(GameInfo info) {
        // TODO  You will implement this method
        if(info instanceof PigGameState){

            pgs =  (PigGameState) info;
        }
        if(pgs.getIdOfTurn() != playerNum){
            return;
        }
        else{
            int action =(int) (Math.random()*(2));
            if(action == 1){
                PigHoldAction holdInstance = new PigHoldAction(this);
                game.sendAction(holdInstance);
            }
            else{
                PigRollAction rollInstance = new PigRollAction(this);
                game.sendAction(rollInstance);
            }
        }
    }//receiveInfo

}
