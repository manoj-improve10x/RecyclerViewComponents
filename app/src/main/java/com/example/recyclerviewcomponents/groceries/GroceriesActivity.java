package com.example.recyclerviewcomponents.groceries;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recyclerviewcomponents.R;

import java.util.ArrayList;

public class GroceriesActivity extends AppCompatActivity {

    public ArrayList<Grocery> groceries;
    public RecyclerView groceriesRv;
    public GroceryAdapter groceryAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_groceries);
        getSupportActionBar().hide();
        setupData();
        setupGroceryList();
    }

    public void setupData() {
        groceries = new ArrayList<>();

        Grocery grocery1 = new Grocery();
        grocery1.name = "Fresh Fruits";
        grocery1.imageUrl = "https://resources.dunzo.com/web-assets/prod/_next/static/images/dunzo-daily-fresh-fruits-3b26c10dc05d15fbe45ceb3d0eaa816d.png";
        groceries.add(grocery1);

        Grocery grocery2 = new Grocery();
        grocery2.name = "Onions & Tomatoes";
        grocery2.imageUrl = "https://resources.dunzo.com/web-assets/prod/_next/static/images/dunzo-daily-onions-and-tomatos-1986e0017a966f57a20fce08853c25ad.png";
        groceries.add(grocery2);

        Grocery grocery3 = new Grocery();
        grocery3.name ="Fresh Vegetables";
        grocery3.imageUrl = "https://resources.dunzo.com/web-assets/prod/_next/static/images/dunzo-daily-fresh-vegetables-9799bef8ba92fd03c53f0546ae404a55.png";
        groceries.add(grocery3);

        Grocery grocery4 = new Grocery();
        grocery4.name = "Exotic Fruits";
        grocery4.imageUrl = "https://resources.dunzo.com/web-assets/prod/_next/static/images/dunzo-daily-exotic-fruits-d5fb208beef0323598ebd4e0c676d2b8.png";
        groceries.add(grocery4);

        Grocery grocery5 = new Grocery();
        grocery5.name = "Mangoes";
        grocery5.imageUrl = "https://resources.dunzo.com/web-assets/prod/_next/static/images/dunzo-daily-mangoes-5dec36e3d054464908f125421f2748c2.png";
        groceries.add(grocery5);

        Grocery grocery6 = new Grocery();
        grocery6.name = "Dairy";
        grocery6.imageUrl = "https://resources.dunzo.com/web-assets/prod/_next/static/images/dunzo-daily-dairy-91f031697f2e433799e567f021460f9b.png";
        groceries.add(grocery6);

        Grocery grocery7 = new Grocery();
        grocery7.name = "Bread & Buns";
        grocery7.imageUrl = "https://resources.dunzo.com/web-assets/prod/_next/static/images/dunzo-daily-bread-and-buns-ea6fc0dcbc8cd860c88cc1310c64e8d6.png";
        groceries.add(grocery7);

        Grocery grocery8 = new Grocery();
        grocery8.name = "Cereals & Oats";
        grocery8.imageUrl = "https://resources.dunzo.com/web-assets/prod/_next/static/images/dunzo-daily-cereal-and-oats-4578a048785cef3231ce946e0385e320.png";
        groceries.add(grocery8);

        Grocery grocery9 = new Grocery();
        grocery9.name = "Health Drinks";
        grocery9.imageUrl = "https://resources.dunzo.com/web-assets/prod/_next/static/images/dunzo-daily-horlicks-25492b5096ad52bcd21607c6fc3f03d9.png";
        groceries.add(grocery9);

        Grocery grocery10 = new Grocery();
        grocery10.name = "Ready-to-eat";
        grocery10.imageUrl = "https://resources.dunzo.com/web-assets/prod/_next/static/images/dunzo-daily-ready-to-eat-9f44b2f69ef008732be5de955293bfe5.png";
        groceries.add(grocery10);

        Grocery grocery11 = new Grocery();
        grocery11.name = "Biscuits & Cookies";
        grocery11.imageUrl = "https://resources.dunzo.com/web-assets/prod/_next/static/images/dunzo-daily-biscuits-and-cookies-ee0423b9d3478a4c7499cf7f1d32e4bf.png";
        groceries.add(grocery11);

        Grocery grocery12 = new Grocery();
        grocery12.name = "Chips & Namkeen";
        grocery12.imageUrl = "https://resources.dunzo.com/web-assets/prod/_next/static/images/dunzo-daily-chips-and-namkeen-e3d8b0e18b4b6721cc565d03922ca3d5.png";
        groceries.add(grocery11);

        Grocery grocery13 = new Grocery();
        grocery13.name = "Tea & Coffee";
        grocery13.imageUrl = "https://resources.dunzo.com/web-assets/prod/_next/static/images/dunzo-daily-tea-and-coffee-683381e7427398452e760dfb6c816e1e.png";
        groceries.add(grocery12);

        Grocery grocery14 = new Grocery();
        grocery14.name = "Soft Drinks & Juice";
        grocery14.imageUrl = "https://resources.dunzo.com/web-assets/prod/_next/static/images/dunzo-daily-softdrinks-and-juice-09a3e724b1b1851ffe9747d4c03eb3b7.png";
        groceries.add(grocery14);

        Grocery grocery15 = new Grocery();
        grocery15.name = "Energy & Sports Drinks";
        grocery15.imageUrl = "https://resources.dunzo.com/web-assets/prod/_next/static/images/dunzo-daily-energy-and-sportsdrinks-8dc82b984a9a536206aa8685dce463b8.png";
        groceries.add(grocery15);

        Grocery grocery16 = new Grocery();
        grocery16.name = "Atta & Flours";
        grocery16.imageUrl = "https://resources.dunzo.com/web-assets/prod/_next/static/images/dunzo-daily-atta-and-flours-b85c359a33d1a017df2ddc830dbb3172.png";
        groceries.add(grocery16);

        Grocery grocery17 = new Grocery();
        grocery17.name = "Baking Essentials";
        grocery17.imageUrl = "https://resources.dunzo.com/web-assets/prod/_next/static/images/dunzo-daily-baking-essentials-5b3a70840b2f29a6bfd8f08bbc62c339.png";
        groceries.add(grocery17);

        Grocery grocery18 = new Grocery();
        grocery18.name = "Cooking Pastes";
        grocery18.imageUrl = "https://resources.dunzo.com/web-assets/prod/_next/static/images/dunzo-daily-cooking-pastes-75b2e7ccc1255261d1a277d63209b1ae.png";
        groceries.add(grocery18);

        Grocery grocery19 = new Grocery();
        grocery19.name = "Masala & Spices";
        grocery19.imageUrl = "https://resources.dunzo.com/web-assets/prod/_next/static/images/dunzo-daily-masala-and-spices-985e3e74c25545edecc6e13b3f3728fb.png";
        groceries.add(grocery19);

        Grocery grocery20 = new Grocery();
        grocery20.name = "Canned Fruits &  Vegetables";
        grocery20.imageUrl = "https://resources.dunzo.com/web-assets/prod/_next/static/images/dunzo-daily-canned-fruit-and-vegetables-c6adef7534b8faa7100c671daab54e2f.png";
        groceries.add(grocery20);

        Grocery grocery21 = new Grocery();
        grocery21.name = "Chicken";
        grocery21.imageUrl = "https://resources.dunzo.com/web-assets/prod/_next/static/images/dunzo-daily-chicken-8883976089fb7016f8b1e0f058fcdd8a.png";
        groceries.add(grocery21);

        Grocery grocery22 = new Grocery();
        grocery22.name = "Fish & Seafood";
        grocery22.imageUrl = "https://resources.dunzo.com/web-assets/prod/_next/static/images/dunzo-daily-fish-and-seafood-b692e65b128c6dc49d42a4c39b8dac92.png";
        groceries.add(grocery22);

        Grocery grocery23 = new Grocery();
        grocery23.name = "Mutton";
        grocery23.imageUrl = "https://resources.dunzo.com/web-assets/prod/_next/static/images/dunzo-daily-mutton-af19fffe878f5d0e057cc44865967cb5.png";
        groceries.add(grocery23);

        Grocery grocery24 = new Grocery();
        grocery24.name = "Marinated Cuts";
        grocery24.imageUrl = "https://resources.dunzo.com/web-assets/prod/_next/static/images/dunzo-daily-marinated-cuts-daf965857a0904ab3cc263e2e3c1f672.png";
        groceries.add(grocery24);

        Grocery grocery25 = new Grocery();
        grocery25.name = "Eggs";
        grocery25.imageUrl = "https://resources.dunzo.com/web-assets/prod/_next/static/images/dunzo-daily-eggs-e1f42bcafd6d5cd04084de21bad9c494.png";
        groceries.add(grocery25);
    }

    public void setupGroceryList() {
        groceriesRv = findViewById(R.id.groceries_rv);
        groceriesRv.setLayoutManager(new GridLayoutManager(this, 3));
        groceryAdapter = new GroceryAdapter();
        groceryAdapter.setData(groceries);
        groceriesRv.setAdapter(groceryAdapter);
    }
}