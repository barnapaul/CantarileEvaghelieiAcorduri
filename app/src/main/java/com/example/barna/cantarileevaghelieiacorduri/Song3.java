package com.example.barna.cantarileevaghelieiacorduri;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Song3 extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song3);

        textView = (TextView) findViewById(R.id.textView);

        textView.setText("1. Sfânt eşti, sfânt eşti, sfânt eşti\n" +
                "Domn Atotputernic, singur Dumnezeu\n" +
                "Ce domneşti în veci.\n" +
                "Vrednic să primeşti glorie,\n" +
                "Vrednic să primeşti cinste,\n" +
                "Vrednic să primeşti lauda noastră.\n" +
                "Eşti măreţ, Rege-al regilor,\n" +
                "Domn al domnilor, Tu eşti minunat.\n" +
                "Aleluia, a Ta e gloria\n" +
                "Şi toată cinstea, eşti minunat!\n" +
                "\n" +
                "R: Slavă, slavă Numelui Tău,\n" +
                "Slavă, slăvit să fii de-a pururi.\n");
    }
}
