package andb.example.merge234lab;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Lab23_SignUp extends AppCompatActivity implements View.OnClickListener {

    //Views
    private EditText etUsername;
    private EditText etPassword;
    private EditText etConfirmPassword;
    private TextView tvAlreadyAccount;
    private Button btnSignUp;

    private Button btnBack;

    //Notify
    private final String REQUIRE = "Required";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab23_sign_up);

        //Reference from layout
        etUsername = findViewById(R.id.etUsername);
        etPassword = findViewById(R.id.etPassword);
        etConfirmPassword = findViewById(R.id.etConfirmPassword);
        tvAlreadyAccount = findViewById(R.id.tvAlreadyAccount);
        btnSignUp = findViewById(R.id.btnSignUp);

        //Register event
        tvAlreadyAccount.setOnClickListener(this);
        btnSignUp.setOnClickListener(this);

        btnBack = findViewById(R.id.back);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Lab23_SignUp.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    private boolean checkInput() {
        //Username
        if (TextUtils.isEmpty(etUsername.getText().toString())) {
            etUsername.setError(REQUIRE);
            return false;
        }

        //Password
        if (TextUtils.isEmpty(etPassword.getText().toString())) {
            etPassword.setError(REQUIRE);
            return false;
        }

        if (TextUtils.isEmpty(etConfirmPassword.getText().toString())) {
            etConfirmPassword.setError(REQUIRE);
            return false;
        }

        if (!TextUtils.equals(etPassword.getText().toString(), etConfirmPassword.getText().toString())) {
            Toast.makeText(this, "Passwords do not match", Toast.LENGTH_LONG).show();
            return false;
        }
        //Valid
        return true;
    }

    private void signUp() {
        //Invalid
        if (!checkInput()) {
            return;
        }
    }

    private void signInForm() {
        Intent intent = new Intent(this, Lab23_SignIn.class);
        startActivity(intent);
        finish();
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnSignUp) {
            signUp();
        } else if (v.getId() == R.id.tvAlreadyAccount) {
            signInForm();
        }
    }
}
