package andb.example.merge234lab;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.util.Random;

public class Lab21 extends AppCompatActivity {
    private EditText minEditText;
    private EditText maxEditText;
    private TextView resultTextView;
    private Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab21);
        // Initialize UI elements
        minEditText = findViewById(R.id.editTextMin);
        maxEditText = findViewById(R.id.editTextMax);
        resultTextView = findViewById(R.id.textView7);

        Button generateButton = findViewById(R.id.button);
        generateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                generateRandomNumber();
            }
        });

        btnBack = findViewById(R.id.back);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Lab21.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
    private void generateRandomNumber() {
        try {
            int min = Integer.parseInt(minEditText.getText().toString());
            int max = Integer.parseInt(maxEditText.getText().toString());

            if (min >= max) {
                setResultText("Minimum value cannot be greater than or equal to Maximum value.");
            } else {
                int randomNumber = generateRandom(min, max);
                setResultText(String.valueOf(randomNumber));
            }
        } catch (NumberFormatException ex) {
            setResultText("Invalid input. Please enter valid numbers.");
        }
    }

    private int generateRandom(int min, int max) {
        Random random = new Random();
        return random.nextInt((max - min) + 1) + min;
    }

    private void setResultText(String text) {
        resultTextView.setText(text);
    }
}
