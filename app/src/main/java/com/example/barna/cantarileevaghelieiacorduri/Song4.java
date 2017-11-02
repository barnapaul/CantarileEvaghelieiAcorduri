package com.example.barna.cantarileevaghelieiacorduri;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Song4 extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song4);

        textView = (TextView) findViewById(R.id.textView);

        textView.setText("            Bb    Bb/D            Eb   c7\n" +
                "1.O, Doamne mare, cand privesc eu lumea,\n" +
                "         Bb   F7            Bb       \n" +
                "Ce ai creat-o prin al Tau Cuvant,\n" +
                "                           Eb \n" +
                "Si Fiintele ce-mpodobesc natura\n" +
                "           Bb     F              Bb \n" +
                "Cum le-ntretii cu bratul Tau cel sfant\n" +
                "\n" +
                "\n" +
                "Chorus:\n" +
                "           Bb    7 Eb         Bb \n" +
                "Atunci Iti cant, Maret Stapanitor:\n" +
                "        c7 F7          Bb \n" +
                "Ce mare esti,  ce mare esti! \n" +
                "           Bb   7  Eb         Bb \n" +
                "Atunci Iti cant, Maret Stapanitor:\n" +
                "        c7    Bb/D  Eb  F7        Bb \n" +
                "Ce mare esti, ce    ma  re        esti! \n" +
                "   \n" +
                "\n" +
                "2. Privirea cand mi-o-nalt si vad minunea:\n" +
                "Multimea astrelor ce-alerg pe cer,\n" +
                "Maretul soare, cat si blanda luna,\n" +
                "Plutind, ca mingi de aur, prin eter.\n" +
                "\n" +
                "3.Cand intalnesc pe Domnu-n Cartea Sfanta\n" +
                "Si cand zaresc multimea de-ndurari;\n" +
                "Pe-ai Sai alesi cum i-a iubit intr-una\n" +
                "Si i-a condus prin binecuvantari.\n" +
                "\n" +
                "4.Si-l vad pe Domnul pe pamantu-acesta\n" +
                "Ca serv, dar plin de dragoste si har.\n" +
                "Zaresc in duh amara-I suferinta\n" +
                "Si mantuirea ce mi-o da in dar.");
    }
}
