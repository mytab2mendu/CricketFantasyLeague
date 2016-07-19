/**
 * Created by Nikhil on 18/07/16.
 */
public class BonusApplierFor25Runs extends BonusApplier {
    int getBonus() {
        return 10;
    }

    boolean shouldApplyBonus(int runs) {
        return runs >= 25;
    }
}
