package edu.ntnu.idatt2001.assignment;

public class BasicMembership extends Membership {

    @Override
    public int registerPoints(int bonusPointBalance, int newPoints) {
        if (newPoints < 0) return bonusPointBalance;
        return bonusPointBalance + newPoints;
    }

    @Override
    public String getMembershipName() {
        return "Basic";
    }
}
