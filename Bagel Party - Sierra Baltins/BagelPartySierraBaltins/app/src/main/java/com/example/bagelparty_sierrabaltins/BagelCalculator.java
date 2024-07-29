package com.example.bagelparty_sierrabaltins;

public class BagelCalculator {

    // Declare three types of hunger levels: LIGHT, MEDIUM, STARVING
    public enum HungerLevel {
        LIGHT, MEDIUM, STARVING
    }

    // There are 4 bagels per pack
    public final static int BAGELS_PER_PACK = 4;

    private HungerLevel mHungerLevel;

    // Create integer variable that takes in the number of people at the party
    private int mPartySize;

    public BagelCalculator(int partySize, HungerLevel level) {
        setHungerLevel(level);
        setPartySize(partySize);
    }

    public HungerLevel getHungerLevel() {
        return mHungerLevel;
    }

    public void setHungerLevel(HungerLevel level) {
        mHungerLevel = level;
    }

    public int getPartySize() {
        return mPartySize;
    }

    // As long party size is greater than 0, return party size
    public void setPartySize(int partySize) {
        if (partySize >= 0) {
            mPartySize = partySize;
        }
    }

    public int getTotalBagels() {
        int bagelsPerPerson;
        // Each person will have two bagels if their hunger level is 'LIGHT'
        if (mHungerLevel == HungerLevel.LIGHT) {
            bagelsPerPerson = 2;
        }
        // Each person will have three bagels if their hunger level is 'MEDIUM'
        else if (mHungerLevel == HungerLevel.MEDIUM) {
            bagelsPerPerson = 3;
        }
        // Each person will have four bagels if their hunger level is 'STARVING'
        else {
            bagelsPerPerson = 4;
        }
        return (int) Math.ceil(mPartySize * bagelsPerPerson / (double) BAGELS_PER_PACK);
    }
}
