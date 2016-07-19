import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Nikhil on 18/07/16.
 */
public class PlayerSpec {
    @Test
    public void playerShouldHaveInitialPointsAsZero(){
        Player player = new Player();
        assertEquals(0, player.getPoints());
    }

    @Test
    public void playerShouldEarn1PointFor1RunScored(){
        Player player = new Player();
        player.scoreRuns(1);
        assertEquals(1, player.getPoints());
        player.scoreRuns(1);
        assertEquals(2, player.getPoints());
    }

    @Test
    public void playerShouldEarn10BonusPointsForFirst25Runs(){
        Player player = new Player();
        player.scoreRuns(24);
        assertEquals(24, player.getPoints());
        player.scoreRuns(1);
        assertEquals(35, player.getPoints());
    }

    @Test
    public void playerShouldEarn25BonusPointsForFirst50Runs(){
        Player player = new Player();
        player.scoreRuns(49);
        assertEquals(59, player.getPoints());
        player.scoreRuns(1);
        assertEquals(85, player.getPoints());
    }

    @Test
    public void playerShouldEarn20PointsForFirst75Runs(){
        Player player = new Player();
        player.scoreRuns(74);
        assertEquals(109, player.getPoints());
        player.scoreRuns(1);
        assertEquals(130, player.getPoints());
    }


    @Test
    public void playerShouldLost5PointsForDuck(){
        Player player = new Player();
        player.scoreRuns(0);
        assertEquals(-5, player.getPoints());
    }


}
