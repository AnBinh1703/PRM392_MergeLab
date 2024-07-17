package andb.example.merge234lab;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Lab42 extends AppCompatActivity {

    Button btnString;
    Button btnInt;
    Button btnArr;
    Button btnBundle;
    String[] stringArray = {"red", "yellow","green"};
    Student student;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab42);
//        btnString = (Button) findViewById(R.id.btnString);
        btnInt = (Button) findViewById(R.id.btnInt);
//        btnArr = (Button) findViewById(R.id.btnArr);
//        btnBundle = (Button) findViewById(R.id.btnBundle);

        btnInt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Lab42.this, SecondActivity.class);
                intent.putExtra("Number", 123);
                startActivity(intent);
            }
        });
    }
}