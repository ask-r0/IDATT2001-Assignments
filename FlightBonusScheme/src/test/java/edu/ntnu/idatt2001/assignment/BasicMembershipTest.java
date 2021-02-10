package edu.ntnu.idatt2001.assignment;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

@Nested
public class BasicMembershipTest {

    BasicMembership testMembership = new BasicMembership();

    @Test
    @DisplayName("Checks if membership name is \"Basic\"")
    public void getMembershipNameTest() {
        assertTrue(testMembership.getMembershipName().equals("Basic"));
    }

    @Test
    @DisplayName("Checks if registerPoints function works with two positive integers")
    public void registerPointsTestTwoPositiveIntegers() {
        assertTrue(testMembership.registerPoints(0,0) == 0);
        assertTrue(testMembership.registerPoints(100, 2) == 102);
        assertTrue(testMembership.registerPoints(400, 22) == 422);
        assertTrue(testMembership.registerPoints(666,333) == 999);
        assertTrue(testMembership.registerPoints(9999,1) == 10000);

    }
    @Test
    @DisplayName("Checks if registerPoints function returns original balance if newPoints is negative")
    public void registerPointsTestNegativeNewPointsPositiveBalance() {
        assertTrue(testMembership.registerPoints(0,-1) == 0);
        assertTrue(testMembership.registerPoints(10, -1000) == 10);
        assertTrue(testMembership.registerPoints(100, -2) == 100);
        assertTrue(testMembership.registerPoints(400, -22) == 400);
        assertTrue(testMembership.registerPoints(666,-333) == 666);
        assertTrue(testMembership.registerPoints(9999,-1) == 9999);

    }

}
