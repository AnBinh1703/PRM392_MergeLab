package andb.example.r2scaculator;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText number01;
    EditText number02;
    Button btnAdd;
    Button btnSub;
    Button btnMul;
    Button btnDiv;
    TextView txtResult;
    TextView txtError;
    public static final int main=0x7f030004;

    public double calResult(double num1, double num2, String action) {
        double result = 0;
        switch (action) {
            case "Add":
                result = num1 + num2;
                break;
            case "Sub":
                result = num1 - num2;
                break;
            case "Mul":
                result = num1 * num2;
                break;
            case "Div":
                result = num1 / num2;
                break;
        }
        return result;
    }

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number01 = (EditText) findViewById(R.id.number01);
        number02 = (EditText) findViewById(R.id.number02);
        btnAdd = (Button) findViewById(R.id.btnAdd);
        btnSub = (Button) findViewById(R.id.btnSub);
        btnMul = (Button) findViewById(R.id.btnMultiply);
        btnDiv = (Button) findViewById(R.id.btnDiv);
        txtResult = (TextView) findViewById(R.id.result);
        txtError = (TextView) findViewById(R.id.errNota);
        btnAdd.setOnClickListener(this);
        btnSub.setOnClickListener(this);
        btnMul.setOnClickListener(this);
        btnDiv.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        double result = 0;
        txtError.setText("");
        if (TextUtils.isEmpty(number01.getText().toString()) || TextUtils.isEmpty(number02.getText().toString())) {
            number01.setError("REQUIRED");
            number02.setError("REQUIRED");
        } else {
            double num1 = Double.parseDouble(number01.getText().toString());
            double num2 = Double.parseDouble(number02.getText().toString());

            int id = v.getId();
            if( id == R.id.btnAdd) {
                result = calResult(num1, num2, "Add");
                txtResult.setText(String.valueOf(result));
            }
            if( id ==  R.id.btnSub) {
                result = calResult(num1, num2, "Sub");
                txtResult.setText(String.valueOf(result));
            }
            if( id ==  R.id.btnMultiply) {
                result = calResult(num1, num2, "Mul");
                txtResult.setText(String.valueOf(result));
            }
            else if ( id == R.id.btnDiv) {
                if (num2 == 0) {
                    txtError.setText("Bạn đang thưc hiện phép chia. Vui lòng nhập số thứ 2 KHÁC 0");
                } else {
                    result = calResult(num1, num2, "Div");
                    txtResult.setText(String.valueOf(Math.round(result * 100.0) / 100.0));
                }
            }
        }
    }
}
