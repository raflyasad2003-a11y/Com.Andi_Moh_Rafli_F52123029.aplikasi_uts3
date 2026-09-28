package com.Andi_Moh_Rafli_F52123029.aplikasi_uts;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<Teman> daftarTeman;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listViewTeman);
        daftarTeman = new ArrayList<>();

        daftarTeman.add(new Teman("Andi Moh. Rafli", "F52123029", "Tidur"));
        daftarTeman.add(new Teman("Panji Angga Saputra", "F52123019", "Main Voli"));
        daftarTeman.add(new Teman("Syahril Ramadhan", "F52123021", "Futsal"));
        daftarTeman.add(new Teman("Zharnativa Al Adiyah Nurba", "F52123017", "Nonton Drakor"));
        daftarTeman.add(new Teman("Muh. Ariel Abizar", "F52123038", "Push Rank"));

        TemanAdapter adapter = new TemanAdapter(this, daftarTeman);
        listView.setAdapter(adapter);
        listView.setSelection(0);
    }
}
