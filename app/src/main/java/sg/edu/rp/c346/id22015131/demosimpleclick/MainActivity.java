package sg.edu.rp.c346.id22015131.demosimpleclick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    TextView tvDisplay;
    Button btnDisplay;
    EditText etInput;
    ToggleButton tbtn;
    RadioGroup rgGender;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvDisplay = findViewById(R.id.textViewDisplay);
        btnDisplay = findViewById(R.id.button);
        etInput = findViewById(R.id.editTextInput);
        tbtn = findViewById(R.id.toggleButtonEnabled);
        rgGender = findViewById(R.id.genderGroup);

        btnDisplay.setOnClickListener(v -> {
            String stringResponse = etInput.getText().toString();
            String sentence;
            int checkedRadioId = rgGender.getCheckedRadioButtonId();
            if(checkedRadioId == R.id.radioButtonMale) {
                sentence = "He says " + stringResponse;
            } else {
                sentence = "She says " + stringResponse;
            }
            tvDisplay.setText(sentence);

        });

        tbtn.setOnClickListener(v -> {
            btnDisplay.setEnabled(!tbtn.isChecked());
            etInput.setEnabled(!tbtn.isChecked());
        });


    }
}