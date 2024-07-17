package andb.example.fruitlistview;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvContent;
    ArrayList<Fruit> fruitList;
    FruitAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getValue();
        adapter = new FruitAdapter(this,R.layout.item_view,fruitList);
        lvContent.setAdapter(adapter);
    }
    private void getValue (){
        lvContent = (ListView) findViewById(R.id.listView);
        fruitList = new ArrayList<>();
        int imgApple = R.drawable.icons8_apple_48;
        int imgBanana = R.drawable.icons8_banana_48;
        int imgBlueberry = R.drawable.icons8_blueberries_48;
        int imgCorn = R.drawable.icons8_ear_of_corn_48;
        int imgGrapes = R.drawable.icons8_grape_48;
        int imgPeach =R.drawable.icons8_peach_80;
        int imgLemon =R.drawable.icons8_citrus_64;

        fruitList.add(new Fruit("Apple","Apple is good", imgApple));
        fruitList.add(new Fruit("Banana","Banana is good", imgBanana));
        fruitList.add(new Fruit("Blueberry","Blueberry is good", imgBlueberry));
        fruitList.add(new Fruit("Corn","Corn is good", imgCorn));
        fruitList.add(new Fruit("Grapes","Grapes is good", imgGrapes));
         fruitList.add(new Fruit("Peach","Peach is good", imgPeach));
       fruitList.add(new Fruit("Lemon","Lemon is good", imgLemon));
    }
}