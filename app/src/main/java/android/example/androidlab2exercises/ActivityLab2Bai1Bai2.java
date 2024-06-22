package android.example.androidlab2exercises;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class ActivityLab2Bai1Bai2 extends AppCompatActivity {
    ListView lvCountries;
    ArrayList arrayList;
    FlagAdapter flagAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab2_bai1);

        lvCountries = (ListView) findViewById(R.id.lvCountries);

        arrayList = Flags.initFlag();
        flagAdapter = new FlagAdapter(ActivityLab2Bai1Bai2.this, R.layout.custom_listview, arrayList);
        lvCountries.setAdapter(flagAdapter);
    }

}