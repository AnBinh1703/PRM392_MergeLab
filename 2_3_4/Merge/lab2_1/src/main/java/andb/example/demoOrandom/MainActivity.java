package andb.example.demoOrandom;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView txtNoiDung;
    Button btnShowContent;
    EditText minContent;
    EditText maxContent;
    TextView errorContent;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtNoiDung = (TextView)  findViewById(R.id.txtRandomNum);
        btnShowContent = (Button) findViewById(R.id.btnShow);
        minContent = (EditText) findViewById(R.id.txtMin);
        maxContent = (EditText) findViewById(R.id.txtMax);
        errorContent = (TextView) findViewById(R.id.error);
        btnShowContent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(TextUtils.isEmpty(minContent.getText().toString()) || TextUtils.isEmpty(maxContent.getText().toString())){
                    minContent.setError("REQUIRED");
                    maxContent.setError("REQUIRED");
                }else{
                    errorContent.setText("");
                    int min = Integer.parseInt(minContent.getText().toString());
                    int max = Integer.parseInt(maxContent.getText().toString());
                    if(min > max) {
                        errorContent.setText("Please set max greater than min");
                        txtNoiDung.setText("");
                    }else {
                        int number =  new Random().nextInt(Math.abs(max - min + 1)) +min;
                        errorContent.setText("");
                        txtNoiDung.setText(number +"");
                    }
                }
            }
        });
    }
}