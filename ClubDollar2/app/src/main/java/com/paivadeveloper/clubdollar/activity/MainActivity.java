package com.paivadeveloper.clubdollar.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.paivadeveloper.clubdollar.R;
import com.paivadeveloper.clubdollar.util.BaseActivity;

public class MainActivity extends BaseActivity {
    private Button promo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        FirebaseApp.initializeApp(MainActivity.this);

        setContentView(R.layout.activity_main);



        Button btn_adm= findViewById(R.id.btn_adm);
        btn_adm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AdmLogin.class);
                startActivity(intent);

            }
        });

        Button btn_cliente= findViewById(R.id.btn_cliente);
        btn_cliente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ClienteLogin.class);
                startActivity(intent);

            }
        });

        promo = findViewById(R.id.promo_vai_id);
        promo.setText("Nova promoção");
        promo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), PromocaoActivity.class);
                startActivity(i);
                finish();

            }
        });

    }
}
