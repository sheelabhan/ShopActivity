package com.sheela.shopactivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

public class CrayShopActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cray_shop);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        navView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item)//kun fragment call vo vanni item le
            {
                Fragment fragment=null;
                switch (item.getItemId()){
                    case R.id.navigation_search: fragment= new SearchFragment();

                        break;
                    case R.id.navigation_cart: fragment=new CartFragment();

                        break;

                    case R.id.navigation_home: fragment=new HomeFragment();
                    default:
                    break;
                    case R.id.navigation_account: fragment=new AccountFragment();
                        break;
                    case R.id.navigation_wishlist: fragment=new WishlistFragment();
                        break;





                     //break paxi halna pareo
                    //case R.id. dekhi
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.nav_host_fragment,fragment).commit();

                //switch baata repeat garni // nav host fragment is called by activity_cray_shop
                return true;
            }
        });


    }

}