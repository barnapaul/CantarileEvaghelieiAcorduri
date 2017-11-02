package com.example.barna.cantarileevaghelieiacorduri;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Song2 extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song2);

        textView = (TextView) findViewById(R.id.textView);

        textView.setText("1. Doamne mare, Te slăvim;\n" +
                "Ne-nchinăm puterii Tale;\n" +
                "Te măreşte ceru-ntreg\n" +
                "Şi-Ţi înalţă osanale.\n" +
                "Mare este slava Ta\n" +
                "Şi în veci va fi aşa!\n" +
                "\n" +
                "2. Orice glas de heruvim\n" +
                "Se înalţă către Tine;\n" +
                "Îngerii ce Te slujesc\n" +
                "Sus în zările senine\n" +
                "Cântă, cântă ne-ncetat:\n" +
                "„Fie Domnul lăudat!“\n" +
                "\n" +
                "3. Al apostolilor cor,\n" +
                "A profeţilor oştire\n" +
                "Cântec nou Îţi vor cânta,\n" +
                "Laudă şi mulţumire.\n" +
                "Şi-al martirilor şirag\n" +
                "Te-a slăvi în veci cu drag!");
    }
}
