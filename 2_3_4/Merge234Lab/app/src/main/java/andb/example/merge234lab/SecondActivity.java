package andb.example.merge234lab;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    Button btnArr;
    TextView txtNumber;
    String[] stringArray = {"red", "yellow","green"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        btnArr = (Button)  findViewById(R.id.btnArr);
        txtNumber = (TextView) findViewById(R.id.txtNumber);

        Intent intent = getIntent();
        int number = intent.getIntExtra("Number",122);
        txtNumber.setText(number +"");
        btnArr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
                intent.putExtra("Array",stringArray);
                startActivity(intent);
            }
        });


    }
}