package andb.example.merge234lab;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class DrinkActivity extends AppCompatActivity {
    ListView listViewFood;
    Button btnOrder;
    ArrayList<String> listFoodItem;
    String drink = "";
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink);
        btnOrder = (Button) findViewById(R.id.btnOrderDrink);
        listViewFood = (ListView) findViewById(R.id.listDrink);
        listFoodItem = new ArrayList<>();
        listFoodItem.add("Pepsi");
        listFoodItem.add("Heineken");
        listFoodItem.add("Tiger");
        listFoodItem.add("Sài gòn Đỏ ");
        final ArrayAdapter[] adapter = {new ArrayAdapter<>(DrinkActivity.this, android.R.layout.simple_list_item_1, listFoodItem)};
        listViewFood.setAdapter(adapter[0]);
        Intent intent = getIntent();
        String foodValue = intent.getStringExtra("FoodValue");


        listViewFood.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(DrinkActivity.this,"Bạn đã chọn " +listFoodItem.get(i) +" "+ foodValue,Toast.LENGTH_LONG).show();

//                if(foodValue!=null) {
//                    drink = " "+foodValue +" "+ listFoodItem.get(i)+ " ";
//                }
                drink = listFoodItem.get(i);
            }
        });

        btnOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DrinkActivity.this, Lab41.class);
                intent.putExtra("drink",drink);
                intent.putExtra("food",foodValue);
                startActivity(intent);
            }
        });
    }
}