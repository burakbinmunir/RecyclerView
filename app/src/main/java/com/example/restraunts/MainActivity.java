package com.example.restraunts;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    static ArrayList<Restraunt> restrauntArrayList;
    static RestrauntAdapter restrauntAdapter;
    RecyclerView rv_restraunts;

    ImageButton btnAddRestraunt;

    public static void newRestrauntAdd(Restraunt newRestraunt){
        restrauntArrayList.add(newRestraunt);
        restrauntAdapter.notifyDataSetChanged();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

        restrauntAdapter = new RestrauntAdapter(restrauntArrayList);
        rv_restraunts.setHasFixedSize(true);
        rv_restraunts.setLayoutManager(new LinearLayoutManager(this));
        rv_restraunts.setAdapter(restrauntAdapter);

        btnAddRestraunt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AddRestraunt.class);
                startActivity(intent);
            }
        });
    }

    private void init(){
        restrauntArrayList = new ArrayList<>();
        restrauntArrayList.add(new Restraunt("Rina's Kitchen", "+92 332 4133764", "Gulberg, Lahore", "Best Chocolate Shake in the town!!"));
        restrauntArrayList.add(new Restraunt("Rina's Kitchen", "+92 332 4133764", "Gulberg, Lahore", "Best Chocolate Shake in the town!!"));
        restrauntArrayList.add(new Restraunt("Rina's Kitchen", "+92 332 4133764", "Gulberg, Lahore", "Best Chocolate Shake in the town!!"));
        restrauntArrayList.add(new Restraunt("Rina's Kitchen", "+92 332 4133764", "Gulberg, Lahore", "Best Chocolate Shake in the town!!"));
        restrauntArrayList.add(new Restraunt("Rina's Kitchen", "+92 332 4133764", "Gulberg, Lahore", "Best Chocolate Shake in the town!!"));
        restrauntArrayList.add(new Restraunt("Rina's Kitchen", "+92 332 4133764", "Gulberg, Lahore", "Best Chocolate Shake in the town!!"));
        restrauntArrayList.add(new Restraunt("Rina's Kitchen", "+92 332 4133764", "Gulberg, Lahore", "Best Chocolate Shake in the town!!"));
        restrauntArrayList.add(new Restraunt("Rina's Kitchen", "+92 332 4133764", "Gulberg, Lahore", "Best Chocolate Shake in the town!!"));
        restrauntArrayList.add(new Restraunt("Rina's Kitchen", "+92 332 4133764", "Gulberg, Lahore", "Best Chocolate Shake in the town!!"));
        restrauntArrayList.add(new Restraunt("Rina's Kitchen", "+92 332 4133764", "Gulberg, Lahore", "Best Chocolate Shake in the town!!"));
        restrauntArrayList.add(new Restraunt("Rina's Kitchen", "+92 332 4133764", "Gulberg, Lahore", "Best Chocolate Shake in the town!!"));
        restrauntArrayList.add(new Restraunt("Rina's Kitchen", "+92 332 4133764", "Gulberg, Lahore", "Best Chocolate Shake in the town!!"));
        restrauntArrayList.add(new Restraunt("Rina's Kitchen", "+92 332 4133764", "Gulberg, Lahore", "Best Chocolate Shake in the town!!"));
        restrauntArrayList.add(new Restraunt("Rina's Kitchen", "+92 332 4133764", "Gulberg, Lahore", "Best Chocolate Shake in the town!!"));
        restrauntArrayList.add(new Restraunt("Rina's Kitchen", "+92 332 4133764", "Gulberg, Lahore", "Best Chocolate Shake in the town!!"));
        rv_restraunts = findViewById(R.id.rv_restraunts);
        btnAddRestraunt = findViewById(R.id.btnAddRestraunt);
    }
}
