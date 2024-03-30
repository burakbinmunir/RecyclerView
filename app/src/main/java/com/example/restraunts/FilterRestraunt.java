package com.example.restraunts;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.textfield.TextInputEditText;

import java.util.ArrayList;
import java.util.Objects;

public class FilterRestraunt extends AppCompatActivity {

    TextInputEditText tv_searchbyrestrauntrating, tv_searchbyrestrauntname, tv_searchbyrestrauntlocation;
    AppCompatButton btn_searchbyrestrauntrating,btn_searchbyrestrauntname, btn_searchbylocation;

    ArrayList<Restraunt> restrauntArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filter_restraunt);
        init();

        if (getIntent().hasExtra("restrauntArrayList")) {
            restrauntArrayList = getIntent().getParcelableArrayListExtra("restrauntArrayList");
        }

        btn_searchbyrestrauntname.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ArrayList<Restraunt> filteredRestraunts = new ArrayList<>();
                for (Restraunt restraunt : restrauntArrayList) {
                    if (restraunt.getRestrauntName().equals(Objects.requireNonNull(tv_searchbyrestrauntname.getText()).toString().trim())) {
                        filteredRestraunts.add(restraunt);
                    }

                    Intent intent = new Intent(FilterRestraunt.this, MainActivity.class);
                    intent.putExtra("filteredRestraunts", filteredRestraunts);
                    startActivity(intent);
                    finish();
                }
            }
        });

        btn_searchbyrestrauntrating.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ArrayList<Restraunt> filteredRestraunts = new ArrayList<>();
                for (Restraunt restraunt : restrauntArrayList) {
                    if (restraunt.getRating().equals(Objects.requireNonNull(tv_searchbyrestrauntrating.getText()).toString().trim())) {
                        filteredRestraunts.add(restraunt);
                    }

                    Intent intent = new Intent(FilterRestraunt.this, MainActivity.class);
                    intent.putExtra("filteredRestraunts", filteredRestraunts);
                    startActivity(intent);
                    finish();
                }
            }
        });


        btn_searchbylocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ArrayList<Restraunt> filteredRestraunts = new ArrayList<>();
                for (Restraunt restraunt : restrauntArrayList) {
                    if (restraunt.getRestrauntLocation().equals(Objects.requireNonNull(tv_searchbyrestrauntlocation.getText()).toString().trim())) {
                        filteredRestraunts.add(restraunt);
                    }

                    Intent intent = new Intent(FilterRestraunt.this, MainActivity.class);
                    intent.putExtra("filteredRestraunts", filteredRestraunts);
                    startActivity(intent);
                    finish();
                }
            }
        });


    }


    private void init(){
        tv_searchbyrestrauntname = findViewById(R.id.tv_searchbyrestrauntname);
        tv_searchbyrestrauntrating = findViewById(R.id.tv_searchbyrestrauntrating);
        btn_searchbyrestrauntname = findViewById(R.id.btn_searchbyrestrauntname);
        btn_searchbyrestrauntrating = findViewById(R.id.btn_searchbyrestrauntrating);
        tv_searchbyrestrauntlocation = findViewById(R.id.tv_searchbyrestrauntlocation);
        btn_searchbylocation = findViewById(R.id.btn_searchbylocation);
    }
}