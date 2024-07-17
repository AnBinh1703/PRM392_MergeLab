package andb.example.merge234lab;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class FourthActivity extends AppCompatActivity {
    TextView txtBundle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
        txtBundle = (TextView) findViewById(R.id.txtBundle);

                Bundle bundle = getIntent().getExtras();
        String stringBd = bundle.getString("bdString");
        int numberBd = bundle.getInt("bdNumber");
        String [] stringArrBd = bundle.getStringArray("bdArray");

        Student myObject = (Student) bundle.getSerializable("bdObject");
        String result = stringBd + ", " + numberBd+ ", " + stringArrBd[0]+", " + stringArrBd[1]+ "," + myObject.getName()+ ", " + myObject.getAge();
        txtBundle.setText(result);

    }
}