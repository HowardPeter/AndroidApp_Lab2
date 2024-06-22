package android.example.androidlab2exercises;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ActivityLab2Bai3 extends AppCompatActivity {
    EditText edtEmail, edtPassword;
    Button btnLogin, btnNewAccount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab2_bai3);

    }
}