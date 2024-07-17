package andb.example.merge234lab;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Lab41 extends AppCompatActivity {

    TextView txtResult;
    Button btnFood;
    Button btnDrink;
    Button btnOut;
    TextView txtResultDrink;
    String food1 = "";
    String drink1 = "";
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab41);
        txtResult= (TextView) findViewById(R.id.txtResult);
        txtResultDrink = (TextView) findViewById(R.id.txtResultDrink);
        btnFood = (Button) findViewById(R.id.btnFood);
        btnDrink = (Button) findViewById(R.id.btnDrink);
        btnOut = (Button) findViewById(R.id.btnOut);
        Intent intent = getIntent();
        String food = intent.getStringExtra("food");
        if(food != null){
            food1 = food;
            txtResult.setText(food1);
        }


        Intent intent2 = getIntent();
        String drink = intent2.getStringExtra("drink");
        if(drink != null){
            drink1 = drink;
            txtResultDrink.setText(drink);
        }


//        String result = food1 + " " + drink1; // concatenate food and drink values into a single string
//        txtResult.setText(result);
//        txtResultDrink.setText(result);


        btnFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Lab41.this, FoodActivity.class);
                intent.putExtra("DrinkValue",drink1);

                startActivity(intent);
            }
        });
        btnDrink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Lab41.this, DrinkActivity.class);
                intent.putExtra("FoodValue",food1);
                startActivity(intent);
            }
        });

        btnOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 Intent intent = new Intent(Lab41.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}