package andb.example.merge234lab;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btnLab21;
    Button btnLab22;
    Button btnLab23_SignIn;
    Button btnLab23_SignUp;
    Button btnBack;
    Button btnlab31;
    Button btnlab32;
    Button btnlab41;
    Button btnlab42;
    Button btnlab43;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnLab21 = findViewById(R.id.Lab21);
        btnLab22 = findViewById(R.id.Lab22);
        btnLab23_SignIn = findViewById(R.id.Lab23_SignIn);
        btnLab23_SignUp = findViewById(R.id.Lab23_SignUp);
        btnlab31 = findViewById(R.id.lab31);
        btnlab32 = findViewById(R.id.lab32);
        btnlab41 = findViewById(R.id.lab41);
        btnlab42 = findViewById(R.id.lab42);
        btnlab43 = findViewById(R.id.lab43);

        btnBack = findViewById(R.id.back);

        btnLab21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Lab21.class);
                startActivity(intent);
            }
        });
        btnLab22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Lab22.class);
                startActivity(intent);
            }
        });
        btnLab23_SignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Lab23_SignIn.class);
                startActivity(intent);
            }
        });
        btnLab23_SignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Lab23_SignUp.class);
                startActivity(intent);
            }
        });
        btnlab31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Lab31_FooballListview.class);
                startActivity(intent);
            }
        });
        btnlab32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Lab32_FruitListView.class);
                startActivity(intent);
            }
        });
        btnlab41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Lab41.class);
                startActivity(intent);
            }
        });
        btnlab42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Lab42.class);
                startActivity(intent);
            }
        });
        btnlab43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Lab43.class);
                startActivity(intent);
            }
        });
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}

