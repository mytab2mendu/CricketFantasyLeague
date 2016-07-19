/**
 * Created by Nikhil on 18/07/16.
 */
public class BonusApplierForDuck extends BonusApplier {
    int getBonus() {
        return -5;
    }

    boolean shouldApplyBonus(int runs) {
        return runs == 0;
    }
}
