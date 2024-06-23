package android.example.androidlab2exercises;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class CustomAdapterNV extends ArrayAdapter {
    Context context;
    ArrayList<NhanVien> arrayList;
    int layout;

    public CustomAdapterNV(@NonNull Context context, int layout, @NonNull ArrayList<NhanVien> objects) {
        super(context, layout, objects);
        this.context = context;
        this.layout = layout;
        this.arrayList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        NhanVien nv = arrayList.get(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(layout,null);
        }

        ImageView imgAvatar = (ImageView) convertView.findViewById(R.id.imgAvatar);
        if(nv.getGioiTinh()){
            imgAvatar.setImageResource(R.drawable.ic_male);
        }else{
            imgAvatar.setImageResource(R.drawable.ic_female);
        }

        TextView tvNV = (TextView) convertView.findViewById(R.id.tvTTNV);
        tvNV.setText(nv.getMaNV() + " - " + nv.getTenNV());

//        CheckBox cbXoa = (CheckBox) convertView.findViewById(R.id.cbXoaNV);
//        cbXoa.setChecked(nv.getPicked()); //Error: Attempt to invoke virtual method 'boolean java.lang.Boolean.booleanValue()' on a null object reference
//        cbXoa.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(CompoundButton compoundButton, boolean isPicked) {
//                nv.setPicked(isPicked);
//            }
//        });

        return convertView;
    }
}
