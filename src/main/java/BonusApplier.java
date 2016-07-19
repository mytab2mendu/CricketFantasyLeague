/**
 * Created by Nikhil on 18/07/16.
 */
public abstract class BonusApplier {

    private boolean isApplied;

    public int getApplicableBonus(int runs) {
        if(shouldApplyBonus(runs) && !isApplied){
            isApplied = true;
                return getBonus();
        }
        return 0;
    }

    abstract int getBonus();

    abstract boolean shouldApplyBonus(int runs);
}
