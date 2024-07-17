package andb.example.merge234lab;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Lab22 extends AppCompatActivity {
    private EditText soThuNhat;
    private EditText soThuHai;
    private TextView resultTextView;

    private Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab22);

        // Initialize UI elements
        soThuNhat = findViewById(R.id.editText1);
        soThuHai = findViewById(R.id.editText2);
        resultTextView = findViewById(R.id.textView7);

        // Set up click listeners for operation buttons
        setUpOperationButton(R.id.btnCong, '+');
        setUpOperationButton(R.id.btnTru, '-');
        setUpOperationButton(R.id.btnNhan, '*');
        setUpOperationButton(R.id.btnChia, '/');

        btnBack = findViewById(R.id.back);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Lab22.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    private void setUpOperationButton(int buttonId, final char operator) {
        Button button = findViewById(buttonId);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                performCalculation(operator);
            }
        });
    }

    private void performCalculation(char operator) {
        try {
            double number1 = Double.parseDouble(soThuNhat.getText().toString());
            double number2 = Double.parseDouble(soThuHai.getText().toString());
            double result = 0.0;

            switch (operator) {
                case '+':
                    result = number1 + number2;
                    break;
                case '-':
                    result = number1 - number2;
                    break;
                case '*':
                    result = number1 * number2;
                    break;
                case '/':
                    if (number2 == 0) {
                        resultTextView.setText("Không thể chia cho 0");
                        return;
                    } else {
                        result = number1 / number2;
                    }
                    break;
            }

            resultTextView.setText(String.valueOf(result));
        } catch (NumberFormatException ex) {
            resultTextView.setText("Nhập sai! Vui lòng nhập lại.");
        }
    }
}