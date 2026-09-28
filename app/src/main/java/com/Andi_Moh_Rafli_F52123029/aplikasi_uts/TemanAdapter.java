package com.Andi_Moh_Rafli_F52123029.aplikasi_uts;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.ArrayList;

public class TemanAdapter extends ArrayAdapter<Teman> {
    public TemanAdapter(Context context, ArrayList<Teman> list) {
        super(context, 0, list);
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Teman t = getItem(position);

        TextView txtNama = convertView.findViewById(R.id.txtNama);
        TextView txtStambuk = convertView.findViewById(R.id.txtStambuk);
        TextView txtHobi = convertView.findViewById(R.id.txtHobi);

        if (t != null) {
            txtNama.setText(t.nama);
            txtStambuk.setText("Stambuk: " + t.stambuk);
            txtHobi.setText("Hobi: " + t.hobi);
        }

        return convertView;
    }
}
