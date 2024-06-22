package android.example.androidlab2exercises;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.nio.channels.FileLock;
import java.util.ArrayList;

public class FlagAdapter extends ArrayAdapter {
    Context context;
    ArrayList<Flags> arrayList;
    int layout;


    public FlagAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Flags> objects) {
        super(context, resource, objects);
        this.context = context;
        this.layout = resource;
        this.arrayList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Flags flags = arrayList.get(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(layout,null);
        }

        ImageView img = convertView.findViewById(R.id.imgFlag);
        img.setImageResource(flags.getId());
        TextView name = convertView.findViewById(R.id.tvCountryName);
        name.setText(flags.getName());

        return convertView;
    }
}
