package edu.ntnu.idatt2001.assignment;

public class SilverMembership extends Membership {
    final private static float POINTS_SCALING_FACTOR = 1.2f;

    @Override
    public int registerPoints(int bonusPointBalance, int newPoints) {
        newPoints = Math.round(POINTS_SCALING_FACTOR * newPoints);
        return bonusPointBalance + newPoints;

    }

    @Override
    public String getMembershipName() {
        return "Silver";
    }
}
