package com.example.restraunts;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.badge.BadgeUtils;
import com.google.android.material.textfield.TextInputEditText;

import java.util.Objects;

public class AddRestraunt extends AppCompatActivity {

    Button btnAddNewRestraunt;
    TextInputEditText tvRestrauntName, tvRestrauntContact, tvRestrauntLocation, tvRestrauntDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_restraunt);
        init();

    }

    private void init(){
        tvRestrauntContact = findViewById(R.id.tvRestrauntContact);
        tvRestrauntDescription = findViewById(R.id.tvRestrauntDescription);
        tvRestrauntName = findViewById(R.id.tvRestrauntName);
        tvRestrauntLocation = findViewById(R.id.tvRestrauntLocation);
        btnAddNewRestraunt = findViewById(R.id.btnAddNewRestraunt);

        btnAddNewRestraunt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Restraunt newRestraunt = new Restraunt(Objects.requireNonNull(tvRestrauntName.getText()).toString().trim(), Objects.requireNonNull(tvRestrauntContact.getText()).toString().trim(), Objects.requireNonNull(tvRestrauntLocation.getText()).toString().trim(), Objects.requireNonNull(tvRestrauntDescription.getText()).toString().trim());
                MainActivity.newRestrauntAdd(newRestraunt);
            }
        });
    }
}