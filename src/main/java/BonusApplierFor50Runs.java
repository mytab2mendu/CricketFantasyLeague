/**
 * Created by Nikhil on 18/07/16.
 */
public class BonusApplierFor50Runs extends BonusApplier {
    int getBonus() {
        return 25;
    }

    boolean shouldApplyBonus(int runs) {
        return runs >= 50;
    }
}
