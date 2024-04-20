package com.example.cropcure.Common;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;


import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.cropcure.Database.CornDetection;
import com.example.cropcure.HelperClass.DescriptionC1;
import com.example.cropcure.HelperClass.DescriptionC2;
import com.example.cropcure.HelperClass.DescriptionC3;
import com.example.cropcure.HelperClass.DescriptionC4;
import com.example.cropcure.HelperClass.DescriptionC5;
import com.example.cropcure.HelperClass.DescriptionC6;
import com.example.cropcure.HelperClass.DescriptionC7;
import com.example.cropcure.R;


public class CornDisease extends AppCompatActivity {

    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_corn_disease);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        img= findViewById(R.id.backicon);

        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
    public void btnn(View view){
        startActivity(new Intent(getApplicationContext(), CornDetection.class ));
    }

    public void btn1(View view){
        startActivity(new Intent(getApplicationContext(), DescriptionC1.class ));
    }
    public void btn2(View view){
        startActivity(new Intent(getApplicationContext(), DescriptionC2.class ));
    }
    public void btn3(View view){
        startActivity(new Intent(getApplicationContext(), DescriptionC3.class ));
    }
    public void btn4(View view){
        startActivity(new Intent(getApplicationContext(), DescriptionC4.class ));
    }
    public void btn5(View view){
        startActivity(new Intent(getApplicationContext(), DescriptionC5.class ));
    }
    public void btn6(View view){
        startActivity(new Intent(getApplicationContext(), DescriptionC6.class ));
    }
    public void btn7(View view){
        startActivity(new Intent(getApplicationContext(), DescriptionC7.class ));
    }



}