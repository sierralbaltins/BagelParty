# BagelParty
The Bagel Party app is created using Android Studio. This app is designed with Java and is composed of different files. I am using the Pixel 2 API 33 emulator that is already downloaded on Android Studio.

Here is the YouTube link for the screencast: https://youtu.be/ZhnaADMl9Vo
Here is another YouTube link for my code review: https://youtu.be/NF2bTKbP6lQ

Below is the algorithm I used for the Bagel Party app:
 

![image](https://github.com/user-attachments/assets/bc054c83-0fef-4f08-8b9d-a75b156b2a3e)


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

- MainActivity.java is another file containing Java code that calculates and displays the number of bagel packs needed for a party based on the party size and the hunger level. MainActivity.java is mainly composed of constants and widgets.

  The widgets included are as follows - 
  mNumberAttendEditText: An EditText widget where users input the number of attendees.
  mNumBagelsTextView: A TextView widget that displays the total number of bagel packs needed.
  mHowHungryRadioGroup: A RadioGroup widget that allows users to select their hunger level.
  

  onCreate(Bundle savedInstanceState):
  This method is called when the activity is first created.
  It sets the layout for the activity, assigns references to the widgets (EditText, TextView, and RadioGroup), and logs a message to indicate that the activity was created.
  calculateClick(View view) Method:

  This method is triggered when the user clicks a button to calculate the number of bagel packs needed.
  It retrieves the number of attendees from the EditText widget, handling any input errors by setting a default value of 0 if the input is invalid.
  It checks the selected hunger level from the RadioGroup and assigns it to the BagelCalculator.HungerLevel enum.

  - NewAppWidget.java is another file code that can be automatically added when you right-click on MainActivity.java. Then you click on New > Widget > App Widget. After clicking App Widget, NewAppWidget.java will   be added to your file structure with Java code already inside it. NewAppWdget.java will make an app widget appear on your emulator which can be clicked on to interact and test the Bagel Party app.

  - activity_main.xml is one of the important XML files used to customize the UI of the phone screenThe layout is created using a LinearLayout with vertical orientation and includes several UI components such as TextView, EditText, RadioGroup, RadioButton, and Button.

  - new_app_widget.xml is another XML file that adjusts the UI of the app widget that is displayed on the phone screen. The layout is structured using a RelativeLayout, which allows for flexible positioning of its child elements relative to each other or the parent container. 
