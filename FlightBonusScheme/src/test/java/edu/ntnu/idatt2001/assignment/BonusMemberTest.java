package edu.ntnu.idatt2001.assignment;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.time.LocalDate;

@Nested
public class BonusMemberTest {
    LocalDate testDate = LocalDate.now();
    private static final int SILVER_LIMIT = 25000;
    private static final int GOLD_LIMIT = 75000;

    @Test
    @DisplayName("Checks if a user is created with points less than Silver limit, its membership is basic.")
    public void createsNewBasicMembership() {
        BonusMember t1 = new BonusMember(0, testDate, 0, "x", "x", "x");
        BonusMember t2 = new BonusMember(1, testDate, SILVER_LIMIT-10000,  "x", "x", "x");
        BonusMember t3 = new BonusMember(2, testDate, SILVER_LIMIT-10 ,  "x", "x", "x");
        BonusMember t4 = new BonusMember(3, testDate, SILVER_LIMIT - 1,  "x", "x", "x");

        assertTrue(t1.getMembershipLevel().equals("Basic"));
        assertTrue(t2.getMembershipLevel().equals("Basic"));
        assertTrue(t3.getMembershipLevel().equals("Basic"));
        assertTrue(t4.getMembershipLevel().equals("Basic"));

    }

    @Test
    @DisplayName("Checks if a user is created with points less than Gold limit but more than silver limit (or equal to), its membership is silver.")
    public void createsNewSilverMembership() {
        BonusMember t1 = new BonusMember(0, testDate, SILVER_LIMIT, "x", "x", "x");
        BonusMember t2 = new BonusMember(1, testDate, SILVER_LIMIT + 1,  "x", "x", "x");
        BonusMember t3 = new BonusMember(2, testDate, SILVER_LIMIT + 2 ,  "x", "x", "x");
        BonusMember t4 = new BonusMember(3, testDate, GOLD_LIMIT - 1,  "x", "x", "x");

        assertTrue(t1.getMembershipLevel().equals("Silver"));
        assertTrue(t2.getMembershipLevel().equals("Silver"));
        assertTrue(t3.getMembershipLevel().equals("Silver"));
        assertTrue(t4.getMembershipLevel().equals("Silver"));
    }
}
