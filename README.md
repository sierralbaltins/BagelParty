# BagelParty
The Bagel Party app is created using Android Studio. This app is designed with Java and is composed of different files.

- BagelCalculator.java is designed to calculate the number of bagels needed for a party based on the number of attendees and their hunger levels. There are several variables and objects included. There are three levels of hunger the user can choose from: LIGHT, MEDIUM, and STARVING. The user can input an integer for the party size. The chosen hunger level and party size are stored within mPartySize and mHungerLevel. The overall hunger level and party size will determine how many packs of bagels need to be ordered. A constant called BAGELS_PER_PACK is set to 4, meaning there are 4 bagels per pack.
  
BagelCalculator(int partySize, HungerLevel level): Initializes a BagelCalculator object with the specified party size and hunger level.
Getter and Setter Methods:

getHungerLevel(): Returns the current hunger level.
setHungerLevel(HungerLevel level): Sets the hunger level.
setPartySize(int partySize): Sets the party size if it's a non-negative number.
The setter is incorrectly named setPartySize() but should return the party size; this appears to be an error.
getTotalBagels() Method:

Calculates the total number of bagels needed based on the party size and hunger level.
Uses different bagels-per-person values depending on whether the hunger level is LIGHT, MEDIUM, or STARVING.
Returns the total number of bagel packs required, rounded up to the nearest whole pack.
Summary:
