package andb.example.merge234lab;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.io.Serializable;

public class ThirdActivity extends AppCompatActivity {
    TextView txtArr;
    TextView txtArr1;
    TextView txtArr2;
    Button btnBundle;
    String [] stringArrr = {"hello","hi","xin chao"};
    Student student;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        txtArr = (TextView) findViewById(R.id.txtArr);
        txtArr1 = (TextView) findViewById(R.id.txtArr1);
        txtArr2 = (TextView) findViewById(R.id.txtArr2);
        btnBundle = (Button) findViewById(R.id.btnBundle);
        Intent intent = getIntent();
        String [] stringArr = intent.getStringArrayExtra("Array");

            txtArr.setText(stringArr[0]+"");
        txtArr1.setText(stringArr[1]+"");
        txtArr2.setText(stringArr[2]+"");

        btnBundle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent intent = new Intent(ThirdActivity.this,FourthActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("bdString","Hello PRM392");
                bundle.putInt("bdNumber",123);
                bundle.putStringArray("bdArray",stringArrr);
                student = new Student("Ann", 22);
                bundle.putSerializable("bdObject", (Serializable) student);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }
}