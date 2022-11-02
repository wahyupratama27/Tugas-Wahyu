package com.example.hewan;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rv_tumbuhan;
    private ArrayList<Hewan> list = new ArrayList<>();

    BottomNavigationView bottomNavigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv_tumbuhan = findViewById(R.id.rvHewan);
        rv_tumbuhan.setHasFixedSize(true);

        list.addAll(DataHewan.getListData());
        ShowRecyclerCardView();

        bottomNavigation = findViewById(R.id.bottom_navigation);
        bottomNavigation.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment selectedFragment = null;
                switch (item.getItemId()){
                    case R.id.nav_beranda:
                        selectedFragment = new BerandaFrag();
                        break;
                    case R.id.nav_tentang:
                        selectedFragment = new TentangFrag();
                        break;
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, selectedFragment).commit();
                return true;
            }
        });
    }

    private void ShowRecyclerCardView() {
        rv_tumbuhan.setLayoutManager(new LinearLayoutManager(this));
        CardViewHewanAdapter cardViewTumbuhanAdapter = new CardViewHewanAdapter(list);
        rv_tumbuhan.setAdapter(cardViewTumbuhanAdapter);

        cardViewTumbuhanAdapter.setOnItemClickCallback(new CardViewHewanAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Hewan hewan) {
                Intent move = new Intent(MainActivity.this, DetailActivity.class);
                move.putExtra(DetailActivity.ITEM_EXTRA, hewan);
                startActivity(move);
            }
        });
    }
}

