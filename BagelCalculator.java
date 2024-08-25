package com.example.bagelparty_sierrabaltins;

public class BagelCalculator {

    // Declare three types of hunger levels: LIGHT, MEDIUM, STARVING
    public enum HungerLevel {
        LIGHT, MEDIUM, STARVING
    }

    // There are 4 bagels per pack
    public final static int BAGELS_PER_PACK = 4;

    // Create private instance called mHungerLevel which holds the HungerLevel object
    private HungerLevel mHungerLevel;

    // Create integer variable that takes in the number of people at the party
    private int mPartySize;

    // Initialize BagelCalculator with with the values of party size and hunger level
    public BagelCalculator(int partySize, HungerLevel level) {
        setHungerLevel(level);
        setPartySize(partySize);
    }

    // Get the hunger level from user input
    public HungerLevel getHungerLevel() {
        return mHungerLevel;
    }

    // Hunger level is set
    public void setHungerLevel(HungerLevel level) {
        mHungerLevel = level;
    }

    // Returns the party size depending on user input
    public int setPartySize() {
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
        // Calculate how many bagels need to be ordered for the party
        return (int) Math.ceil(mPartySize * bagelsPerPerson / (double) BAGELS_PER_PACK);
    }
}
