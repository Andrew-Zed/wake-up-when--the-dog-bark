package com.andrew;

public class Main {
    public static void main(String[] args) {
        BarkingDog bk = new BarkingDog();
        bk.shouldWakeUp(false,-1);

        LeapYear lp = new LeapYear();
        lp.isLeapYear(-1600);
    }
}
