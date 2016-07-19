import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nikhil on 18/07/16.
 */
public class Player {
    private int score;
    List<BonusApplier> bonusAppliers;
    private int totalRuns;

    public Player(){
        bonusAppliers = new ArrayList();
        bonusAppliers.add(new BonusApplierFor25Runs());
        bonusAppliers.add(new BonusApplierFor50Runs());
        bonusAppliers.add(new BonusApplierFor75Runs());
        bonusAppliers.add(new BonusApplierFor100Runs());
        bonusAppliers.add(new BonusApplierForDuck());
    }

    public int getPoints() {
        return score;
    }

    public void scoreRuns(int runs) {
        totalRuns += runs;
        score += runs;
        for (BonusApplier applier : bonusAppliers){
            score += applier.getApplicableBonus(totalRuns);
        }
    }

}
