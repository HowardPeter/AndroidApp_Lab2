package android.example.androidlab2exercises;

import java.util.ArrayList;

public class Flags {
    int id;
    String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Flags(){}

    public Flags(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static ArrayList initFlag()
    {
        ArrayList<Flags> arrayList = new ArrayList<>();
        arrayList.add(new Flags(R.drawable.vietnam, "Viet Nam"));
        arrayList.add(new Flags(R.drawable.france, "France"));
        arrayList.add(new Flags(R.drawable.england, "England"));
        arrayList.add(new Flags(R.drawable.usa, "USA"));
        arrayList.add(new Flags(R.drawable.italy, "Italy"));
        arrayList.add(new Flags(R.drawable.singapore, "Singapore"));
        arrayList.add(new Flags(R.drawable.thailand, "ThaiLand"));
        arrayList.add(new Flags(R.drawable.laos, "Laos"));
        return arrayList;
    }
}
