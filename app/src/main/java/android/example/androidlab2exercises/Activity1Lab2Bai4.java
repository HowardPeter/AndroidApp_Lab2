package android.example.androidlab2exercises;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.util.ArrayList;

public class Activity1Lab2Bai4 extends AppCompatActivity {
    EditText edtHoTen, edtCMND, edtAdditionalInfor;
    RadioGroup rbDegree;
    CheckBox cbDocBao, cbDocSach, cbCoding;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity1_lab2_bai4);
        addControl();
        addEvent();
    }
    void addControl()
    {
        edtHoTen = (EditText) findViewById(R.id.edtHoTen);
        edtCMND = (EditText) findViewById(R.id.edtCMND);
        edtAdditionalInfor = (EditText) findViewById(R.id.edtAdditionalInfo);
        rbDegree = (RadioGroup) findViewById(R.id.rbDegree);
        cbDocBao = (CheckBox) findViewById(R.id.cbDocBao);
        cbDocSach = (CheckBox) findViewById(R.id.cbDocSach);
        cbCoding = (CheckBox) findViewById(R.id.cbCoding);
        btnSubmit = (Button) findViewById(R.id.btnSubmit);
    }
    void addEvent()
    {
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RadioButton rbSelected = findViewById(rbDegree.getCheckedRadioButtonId());
                StringBuilder hobbies = new StringBuilder();
                if(cbDocBao.isChecked()){
                    hobbies.append(cbDocBao.getText().toString()).append(" - ");
                }
                if(cbDocSach.isChecked()){
                    hobbies.append(cbDocSach.getText().toString()).append(" - ");
                }
                if(cbCoding.isChecked()){
                    hobbies.append(cbCoding.getText().toString());
                }

                Intent intent = new Intent(Activity1Lab2Bai4.this, Activity2Lab2Bai4.class);

                intent.putExtra("Ho ten", edtHoTen.getText().toString());
                intent.putExtra("CMND", edtCMND.getText().toString());
                intent.putExtra("Additional Infor", edtAdditionalInfor.getText().toString());
                intent.putExtra("Bang cap", rbSelected.getText().toString());
                intent.putExtra("So thich", hobbies.toString());

                startActivity(intent);
            }
        });
    }
}