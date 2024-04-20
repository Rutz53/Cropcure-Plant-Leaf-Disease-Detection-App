package com.example.cropcure.HelperClass;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.cropcure.R;

public class DescriptionC1 extends AppCompatActivity {
    ImageView arrowback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description_c1);

        TextView textView = findViewById(R.id.textpm);
        TextView textView2 = findViewById(R.id.Sympcorn);

        ImageView button = findViewById(R.id.imgdownarrow);
        ImageView button2 = findViewById(R.id.imgdownarrow2);
        arrowback= findViewById(R.id.arrowback);

        arrowback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textView.getVisibility() == View.GONE) {
                    textView.setVisibility(View.VISIBLE);
                    button.setImageResource(R.drawable.up_icon);
                } else {
                    textView.setVisibility(View.GONE);
                    button.setImageResource(R.drawable.down_icon);
                }
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textView2.getVisibility() == View.GONE) {
                    textView2.setVisibility(View.VISIBLE);
                    button2.setImageResource(R.drawable.up_icon);
                } else {
                    textView2.setVisibility(View.GONE);
                    button2.setImageResource(R.drawable.down_icon);
                }
            }
        });

    }
}