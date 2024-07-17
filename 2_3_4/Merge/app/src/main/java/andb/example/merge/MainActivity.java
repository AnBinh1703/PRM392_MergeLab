package andb.example.merge;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find buttons by their IDs
        findViewById(R.id.button).setOnClickListener(this);
        findViewById(R.id.button2).setOnClickListener(this);
        findViewById(R.id.button3).setOnClickListener(this);
        findViewById(R.id.button4).setOnClickListener(this);
        findViewById(R.id.button5).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        // Handle button clicks
        switch (v.getId()) {
            case R.id.button:
                launchModule("andb.example.lab2_1.MainActivity"); // Replace with correct package name
                break;
            case R.id.button2:
                launchModule("andb.example.lab2_2.MainActivity"); // Replace with correct package name
                break;
            case R.id.button3:
                launchModule("andb.example.lab2_3.MainActivity"); // Replace with correct package name
                break;
            case R.id.button4:
                launchModule("andb.example.lab3_1.MainActivity"); // Replace with correct package name
                break;
            case R.id.button5:
                launchModule("andb.example.lab3_2.MainActivity"); // Replace with correct package name
                break;
        }
    }

    private void launchModule(String activityClassName) {
        try {
            // Create an Intent to launch the specified activity from the module
            Intent intent = new Intent();
            intent.setClassName(this, activityClassName);
            startActivity(intent);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
