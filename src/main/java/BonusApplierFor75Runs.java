/**
 * Created by Nikhil on 18/07/16.
 */
public class BonusApplierFor75Runs extends BonusApplier {
    int getBonus() {
        return 20;
    }

    boolean shouldApplyBonus(int runs) {
        return runs >= 75;
    }
}
