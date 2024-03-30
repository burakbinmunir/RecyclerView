package com.example.restraunts;
import android.content.Context;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class RestaurantFileHandler {
    private static final String FILE_NAME = "Restaurants.txt";

    public static List<Restraunt> readRestaurantsFromFile(Context context) {
        List<Restraunt> restaurantList = new ArrayList<>();
        File file = new File(context.getFilesDir(), FILE_NAME);
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 5) {
                    Restraunt restaurant = new Restraunt();
                    restaurant.setRestrauntName(parts[0]);
                    restaurant.setRestrauntContact(parts[1]);
                    restaurant.setRestrauntLocation(parts[2]);
                    restaurant.setRestrauntDescription(parts[3]);
                    restaurant.setRating(parts[4]);
                    restaurantList.add(restaurant);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return restaurantList;
    }

    public static void writeRestaurantsToFile(Context context, Restraunt restaurant) {
        File file = new File(context.getFilesDir(), FILE_NAME);
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file,true))) {
                bw.write(restaurant.getRestrauntName() + "," +
                        restaurant.getRestrauntContact() + "," +
                        restaurant.getRestrauntLocation() + "," +
                        restaurant.getRestrauntDescription() +  "," +
                        restaurant.getRating());

                bw.newLine();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

