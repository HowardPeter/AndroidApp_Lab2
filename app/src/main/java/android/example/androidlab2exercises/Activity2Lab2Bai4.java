package android.example.androidlab2exercises;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity2Lab2Bai4 extends AppCompatActivity {
    TextView tvInformation;
    Button btnBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity2_lab2_bai4);
        addControl();
        getInfor();
    }
    void addControl()
    {
        tvInformation = (TextView) findViewById(R.id.tvInformation);
        btnBack = (Button) findViewById(R.id.btnBack);
    }
    void getInfor()
    {
        String hoTen = getIntent().getStringExtra("Ho ten");
        String cmnd = getIntent().getStringExtra("CMND");
        String additionalInfor = getIntent().getStringExtra("Additional Infor");
        String bangCap = getIntent().getStringExtra("Bang cap");
        String soThich = getIntent().getStringExtra("So thich");
        String ngatDoan = "--------------------------";
        String ttCaNhan = ngatDoan + "\n" + hoTen + "\n" + cmnd + "\n" + bangCap + "\n" + soThich + "\n" + ngatDoan + "\n" + additionalInfor + "\n" + ngatDoan;

        tvInformation.setText(ttCaNhan);
    }
    void addEvent()
    {
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity2Lab2Bai4.this, Activity1Lab2Bai4.class);
                startActivity(intent);
            }
        });
    }
}