package com.example.barna.cantarileevaghelieiacorduri;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Song1 extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song1);

        textView = (TextView) findViewById(R.id.textView);

        textView.setText("1. Slavă daţi Domnului\n" +
                "Căci peste regi este Rege,\n" +
                "El vi-\u00ADe Părinte\n" +
                "Şi El păsul vi\u00AD-l înţelege;\n" +
                "Vă adunaţi,\n" +
                "Cu tot ce\u00AD-aveţi vă-\u00ADnchinaţi\n" +
                "Celui ce-n slavă domneşte!\n" +
                "\n" +
                "2. Slavă daţi Domnului,\n" +
                "Celui ce totul conduce,\n" +
                "El ca pe aripi de vultur\n" +
                "V-\u00ADa dus şi vă duce;\n" +
                "El v-\u00ADa ţinut\n" +
                "Pentru c-\u00ADaşa I-\u00ADa plăcut;\n" +
                "Pace în inimi v-aduce!\n" +
                "\n" +
                "3. Slavă daţi Domnului\n" +
                "Pentru iubirea Lui mare\n" +
                "De care nimeni\n" +
                "A ne despărţi nu e-\u00ADn stare;\n" +
                "Căci Dumnezeu\n" +
                "A dat chiar pe Fiul Său\n" +
                "Şi-\u00ADn El ne dă tot ce are!\n" +
                "\n" +
                "4. Slavă daţi Domnului\n" +
                "Printr-o trăire curată,\n" +
                "Cât ne-\u00ADa iubit vom putea\n" +
                "Să pricepem vreodată?\n" +
                "Tată, dorim şi-\u00ADacum\n" +
                "Şi-\u00ADn veci să mărim\n" +
                "Iubirea Ta minunată!");
    }
}
