package com.paivadeveloper.clubdollar.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.paivadeveloper.clubdollar.R;
import com.paivadeveloper.clubdollar.util.BaseActivity;

public class AdmLogin extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adm_login);

        findViewById(R.id.btn_adm_entrar).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AdmLogin.this, TesteActivity.class));
            }
        });
    }
}
