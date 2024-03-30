package com.example.restraunts;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
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
    TextInputEditText tvRestrauntName, tvRestrauntContact, tvRestrauntLocation, tvRestrauntDescription, tvRestrauntRating;

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
        tvRestrauntRating = findViewById(R.id.tvRestrauntRating);
        btnAddNewRestraunt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AddRestraunt.this, MainActivity.class);
                Restraunt newRestraunt = new Restraunt(Objects.requireNonNull(tvRestrauntName.getText()).toString().trim(), Objects.requireNonNull(tvRestrauntContact.getText()).toString().trim(), Objects.requireNonNull(tvRestrauntLocation.getText()).toString().trim(), Objects.requireNonNull(tvRestrauntDescription.getText()).toString().trim(), Objects.requireNonNull(Objects.requireNonNull(tvRestrauntRating.getText()).toString().trim()));
                intent.putExtra("newRestaurant", (Parcelable) newRestraunt);
                startActivity(intent);
                finish();
            }
        });
    }
}