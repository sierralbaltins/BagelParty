package com.example.bagelparty_sierrabaltins;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.WindowDecorActionBar;

public class MainActivity extends AppCompatActivity {

    // We can order a pack that includes 4 bagels
    public final int BAGELS_PER_PACK = 4;

    // Adjust number of people at the party
    private EditText mNumberAttendEditText;

    // Update number of packs of bagels needed
    private TextView mNumBagelsTextView;

    // Choose hunger level
    private RadioGroup mHowHungryRadioGroup;
    private final static String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "oncreate was called");

        // Assign widgets to fields
        mNumberAttendEditText = findViewById(R.id.num_attend_edit_text);
        mNumBagelsTextView = findViewById(R.id.num_bagels_text_view);
        mHowHungryRadioGroup = findViewById(R.id.hungry_radio_group);
    }

    public void calculateClick(View view) {
        // Get how many are attending the party
        int numAttend;
        try {
            String numAttendStr = mNumberAttendEditText.getText().toString();
            numAttend = Integer.parseInt(numAttendStr);
        } catch (NumberFormatException ex) {
            numAttend = 0;
        }

        //Get hunger level selection
        int checkedId = mHowHungryRadioGroup.getCheckedRadioButtonId();
        BagelCalculator.HungerLevel hungerLevel = BagelCalculator.HungerLevel.STARVING;
        if (checkedId == R.id.light_radio_button) {
            hungerLevel = BagelCalculator.HungerLevel.LIGHT;
        } else if (checkedId == R.id.medium_radio_button) {
            hungerLevel = BagelCalculator.HungerLevel.MEDIUM;
        }

        // Get number of bagel packs needed
        BagelCalculator calc = new BagelCalculator(numAttend, hungerLevel);
        int totalBagels = calc.getTotalBagels();

        // Place totalBagels into the string resource and display
        String totalText = getString(R.string.total_bagels_num, totalBagels);
        mNumBagelsTextView.setText(totalText);
    }
}
