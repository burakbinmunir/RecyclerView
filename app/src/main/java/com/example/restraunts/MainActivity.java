package com.example.restraunts;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    static ArrayList<Restraunt> restrauntArrayList;
    static RestrauntAdapter restrauntAdapter;
    RecyclerView rv_restraunts;

    ImageButton btn_search;
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

        if (getIntent().hasExtra("newRestaurant")) {
            Restraunt newRestaurant = getIntent().getParcelableExtra("newRestaurant");
            newRestrauntAdd(newRestaurant);
            assert newRestaurant != null;
            RestaurantFileHandler.writeRestaurantsToFile(this,newRestaurant);;
        }


        if (getIntent().hasExtra("filteredRestraunts")) {
            ArrayList<Restraunt> filteredRestraunts = getIntent().getParcelableArrayListExtra("filteredRestraunts");
            assert filteredRestraunts != null;

            restrauntArrayList.clear();
            for (Restraunt res : filteredRestraunts){
                newRestrauntAdd(res);
            }
        }


        btnAddRestraunt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AddRestraunt.class);
                startActivity(intent);
            }
        });

        btn_search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, FilterRestraunt.class);
                intent.putExtra("restrauntArrayList", restrauntArrayList);
                startActivity(intent);
            }
        });
    }



    private void init(){
        restrauntArrayList = new ArrayList<>();
        restrauntArrayList = (ArrayList<Restraunt>) RestaurantFileHandler.readRestaurantsFromFile(this);
        restrauntArrayList.add( new Restraunt("Rina's Kitchen","+92 332 4133764","gulberg, Lahore","Best chocolate shake in town","5"));
        restrauntArrayList.add(new Restraunt("Café Aroma","+92 333 9876543","DHA Phase 5, Karachi","Artisan coffee and pastries", "4.5"));
        restrauntArrayList.add(new Restraunt("Spice Lounge","+92 345 6789123","Blue Area, Islamabad","Authentic Indian cuisine", "4.5"));
        restrauntArrayList.add(new Restraunt("Burger Nation","+92 311 2345678","Bahria Town, Rawalpindi","Juicy burgers and fries", "4.5"));
        restrauntArrayList.add(new Restraunt("Sushi Central","+92 321 8765432","F-10 Markaz, Islamabad","Fresh sushi and Japanese dishes", "4.8"));
        restrauntArrayList.add(new Restraunt("Pizza Delight","+92 333 7654321","Johar Town, Lahore","Delicious pizzas with various toppings", "4.3"));
        restrauntArrayList.add(new Restraunt("Tandoori Hut","+92 300 1112223","I-8 Sector, Islamabad","Tandoori specialties and BBQ", "4.6"));
        restrauntArrayList.add(new Restraunt("Mughal Darbar","+92 311 9876543","Saddar, Karachi","Mughlai cuisine and biryanis", "4.4"));
        restrauntArrayList.add(new Restraunt("Noodle Zone","+92 333 4445556","Garden Town, Lahore","Asian noodles and stir-fries", "4.9"));
        restrauntArrayList.add(new Restraunt("Grill Masters","+92 322 7896543","Peshawar Road, Rawalpindi","Grilled meats and kebabs", "4.1"));

        btn_search = findViewById(R.id.btn_search);
        rv_restraunts = findViewById(R.id.rv_restraunts);
        btnAddRestraunt = findViewById(R.id.btnAddRestraunt);


    }
}
