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

public class FoodActivity extends AppCompatActivity {
    ListView listViewFood;
    Button btnOrder;
    ArrayList<String> listFoodItem;
    String foodd = "";
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);
        listViewFood = (ListView) findViewById(R.id.listFood);
        btnOrder = (Button) findViewById(R.id.btnOrderFood);


        listFoodItem = new ArrayList<>();
        listFoodItem.add("Phở Hà Nội");
        listFoodItem.add("Bún Bò Huế");
        listFoodItem.add("Mì Quảng");
        listFoodItem.add("Hủ Tíu Sài Gòn ");
        Intent intent = getIntent();
        String drinkValue = intent.getStringExtra("DrinkValue");

        final ArrayAdapter[] adapter = {new ArrayAdapter<>(FoodActivity.this, android.R.layout.simple_list_item_1, listFoodItem)};
        listViewFood.setAdapter(adapter[0]);
        listViewFood.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(FoodActivity.this,"Bạn đã chọn " +listFoodItem.get(i) +" "+ drinkValue,Toast.LENGTH_LONG).show();

//                if(drinkValue!=null) {
////                    foodd = " "+listFoodItem.get(i) +" "+  drinkValue+" " ;
//                }
                foodd = listFoodItem.get(i);
            }
        });

        btnOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoodActivity.this, Lab41.class);
                intent.putExtra("food",foodd);
                intent.putExtra("drink",drinkValue);
                startActivity(intent);
            }
        });
    }
}