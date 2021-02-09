package edu.ntnu.idatt2001.assignment;

import java.time.LocalDate;

public class BonusMember {
    private static final int SILVER_LIMIT = 25000;
    private static final int GOLD_LIMIT = 75000;

    private int memberNumber;
    private LocalDate enrolledDate;
    private int bonusPointsBalance = 0;
    private String name;
    private String eMailAddress;
    private String password;
    private Membership membership;

    public BonusMember(int memberNumber, LocalDate enrolledDate, int bonusPointsBalance, String name, String eMailAddress, String password) {
        this.memberNumber = memberNumber;
        this.enrolledDate = enrolledDate;
        this.bonusPointsBalance = bonusPointsBalance;
        this.name = name;
        this.eMailAddress = eMailAddress;
        this.password = password;

        checkAndSetMembership();
    }



    public int getBonusPointsBalance() {
        return bonusPointsBalance;
    }


    public String getEmailAddress() {
        return eMailAddress;
    }


    public String getMembershipLevel() {
        return membership.getMembershipName();
    }

    public boolean checkPassword(String password) {
        return this.password.equals(password);
    }

    public void registerBonusPoints(int newPoints) {
        bonusPointsBalance = membership.registerPoints(this.bonusPointsBalance, newPoints);
        checkAndSetMembership();
    }

    private void checkAndSetMembership() {
        if (bonusPointsBalance < SILVER_LIMIT) {
            membership = new BasicMembership();
        } else if (bonusPointsBalance < GOLD_LIMIT) {
            membership = new SilverMembership();
        } else {
            membership = new GoldMembership();
        }
    }


}