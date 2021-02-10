package edu.ntnu.idatt2001.assignment;

public class GoldMembership extends Membership {
    final private static float POINTS_SCALING_FACTOR_LEVEL_1 = 1.3f;
    final private static float POINTS_SCALING_FACTOR_LEVEL_2 = 1.5f;
    final private static int REQUIRED_POINTS_LEVEL_2 = 90000;

    @Override
    public int registerPoints(int bonusPointBalance, int newPoints) {
        if (newPoints < 0) return bonusPointBalance;
        if (bonusPointBalance >= REQUIRED_POINTS_LEVEL_2) {
            newPoints = Math.round(POINTS_SCALING_FACTOR_LEVEL_1 * newPoints);
        } else {
            newPoints = Math.round(POINTS_SCALING_FACTOR_LEVEL_2 * newPoints);
        }

        return bonusPointBalance + newPoints;
    }

    @Override
    public String getMembershipName() {
        return "Gold";
    }
}
