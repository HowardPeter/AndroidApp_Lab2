package android.example.androidlab2exercises;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnBai12, btnBai3, btnBai4, btnBai5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addControl();
        addEvent();
    }

    void addControl()
    {
        btnBai12 = (Button) findViewById(R.id.btnBai1);
        btnBai3 = (Button) findViewById(R.id.btnBai3);
        btnBai4 = (Button) findViewById(R.id.btnBai4);
        btnBai5 = (Button) findViewById(R.id.btnBai5);
    }

    private void moveToActivity(Button button, final Class<? extends Activity> targetActivity)
    {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, targetActivity);
                startActivity(intent);
            }
        });
    }

    void addEvent()
    {
        moveToActivity(btnBai12, ActivityLab2Bai1Bai2.class);
        moveToActivity(btnBai3, ActivityLab2Bai3.class);
//        moveToActivity(btnBai4, ActivityLab2Bai3.class);
//        moveToActivity(btnBai5, ActivityLab2Bai3.class);
    }
}