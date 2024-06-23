package android.example.androidlab2exercises;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.util.ArrayList;

public class ActivityLab2Bai5 extends AppCompatActivity {
    EditText edtMaNV, edtTenNV;
    RadioGroup rgGioiTinh;
    RadioButton rbNam, rbNu;
    Button btnNhap, btnXoaNV;
    ListView lvNhanVien;
    CheckBox cbXoaNV;
    CustomAdapterNV customAdapterNV;
    ArrayList<NhanVien> arrayListNV = new ArrayList<>();
    int[] dsPic = new int[]{R.drawable.ic_male, R.drawable.ic_female, R.drawable.ic_male, R.drawable.ic_male, R.drawable.ic_female};
    String[] dsMaNV = new String[]{"NV01", "NV05", "NV03", "NV04", "NV05"};
    String[] dsTenNV = new String[]{"Quach Tinh", "Hoang Dung", "Hong That Cong", "Hoang Duoc Su", "Thanh Co"};
    boolean[] dsGioiTinh = new boolean[]{true, false, true, true, false};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab2_bai5);
        addControl();
        addEvent();
        importToLV();
    }
    void createData(int[] id, String[] ma, String[] ten, boolean[] gioi)
    {
        for (int i = 0; i < id.length; i++) {
            NhanVien nv = new NhanVien();
            nv.idPic = id[i];
            nv.maNV = ma[i];
            nv.tenNV = ten[i];
            nv.gioiTinh = gioi[i];
            arrayListNV.add(nv);
        }
    }
    void addControl()
    {
        edtMaNV = (EditText) findViewById(R.id.edtMaNV);
        edtTenNV = (EditText) findViewById(R.id.edtTenNV);
        rgGioiTinh = (RadioGroup) findViewById(R.id.rgGioiTinh);
        rbNam = (RadioButton) findViewById(R.id.rbNam);
        rbNu = (RadioButton) findViewById(R.id.rbNu);
        btnNhap = (Button) findViewById(R.id.btnNhap);
        btnXoaNV = (Button) findViewById(R.id.btnXoaNV);
        lvNhanVien = (ListView) findViewById(R.id.lvNhanVien);
        cbXoaNV = (CheckBox) findViewById(R.id.cbXoaNV);
    }
    void addEvent()
    {
        btnNhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String maNV = edtMaNV.getText().toString();
                String tenNV = edtTenNV.getText().toString();
                boolean gioiTinh = rbNam.isChecked();

                if(!maNV.isEmpty() && !tenNV.isEmpty()){
                    arrayListNV.add(new NhanVien(maNV, tenNV, gioiTinh));
                    customAdapterNV.notifyDataSetChanged();
                }
            }
        });

        // incomplete
//        btnXoaNV.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                for (NhanVien nv : arrayListNV) {
//                    if(nv.getPicked()){
//                        arrayListNV.remove(nv);
//                        customAdapterNV.notifyDataSetChanged();
//                    }
//                }
//            }
//        });

    }
    void importToLV()
    {
        createData(dsPic, dsMaNV, dsTenNV, dsGioiTinh);
        customAdapterNV = new CustomAdapterNV(ActivityLab2Bai5.this, R.layout.custom_employees_layout, arrayListNV);
        lvNhanVien.setAdapter(customAdapterNV);
    }
}