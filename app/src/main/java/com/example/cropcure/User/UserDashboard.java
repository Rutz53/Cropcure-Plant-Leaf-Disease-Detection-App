package com.example.cropcure.User;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.cropcure.Common.CornDisease;
import com.example.cropcure.Common.GrapeDisease;
import com.example.cropcure.Common.PotatoDisease;
import com.example.cropcure.Common.RiceDisease;
import com.example.cropcure.Common.StrawberryDisease;
import com.example.cropcure.Common.TomatoDisease;
import com.example.cropcure.R;

public class UserDashboard extends AppCompatActivity {
    ImageView hsCorn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_user_dashboard);

    }
    public void corn(View view){
        startActivity(new Intent(getApplicationContext(), CornDisease.class ));
    }
    public void grape(View view){
        startActivity(new Intent(getApplicationContext(), GrapeDisease.class ));
    }

    public void potato(View view){
        startActivity(new Intent(getApplicationContext(), PotatoDisease.class ));
    }

    public void rice(View view) {
        startActivity(new Intent(getApplicationContext(), RiceDisease.class));
    }

    public void strawberry(View view) {
        startActivity(new Intent(getApplicationContext(), StrawberryDisease.class));
    }
    public void tomato(View view) {
        startActivity(new Intent(getApplicationContext(), TomatoDisease.class));
    }





}