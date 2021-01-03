package com.example.hw2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.mikepenz.materialdrawer.Drawer;
import com.mikepenz.materialdrawer.DrawerBuilder;
import com.mikepenz.materialdrawer.model.DividerDrawerItem;
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem;
import com.mikepenz.materialdrawer.model.SecondaryDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.IDrawerItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Classes> sa = new ArrayList<>();
        Classes c1 = new Classes("Bio 110",  "11:00 am","Su-Tu-Th",false,81, R.drawable.bio);
        Classes c2 = new Classes("CSC 122", "15:00 Pm","Su-Tu-Th",true,81, R.drawable.cs);
        Classes c3 = new Classes("CSC 125",  "09:00 am","Su-Tu-Th",false,81,R.drawable.cs);
        Classes c4 = new Classes("MATH 131", "09:30 am","M-W",true,81,R.drawable.math);
        Classes c5 = new Classes("SPAN 101", "14:00 am","M-W",true,81, R.drawable.spanish);

        sa.add(c1);
        sa.add(c2);
        sa.add(c3);
        sa.add(c4);
        sa.add(c5);
        LinearLayout ll = findViewById(R.id.linearLayout);
        RecyclerView classesList = findViewById(R.id.rv);
        classesList.setHasFixedSize(true);
        RecyclerView.LayoutManager lm = new LinearLayoutManager(this);
        classesList.setLayoutManager(lm);

        classesAdapter c = new classesAdapter(sa, MainActivity.this,ll);
        classesList.setAdapter(c);
        Toolbar toolbar = findViewById(R.id.toolbar);
        PrimaryDrawerItem item1 = new PrimaryDrawerItem().withIdentifier(1).withName("Home").withIcon(R.drawable.ic_baseline_home_24);
        PrimaryDrawerItem item2 = new PrimaryDrawerItem().withIdentifier(2).withName("Profile").withIcon(R.drawable.ic_baseline_account_circle_24);
        SecondaryDrawerItem item3 = new SecondaryDrawerItem().withIdentifier(3).withName("Settings");

//create the drawer and remember the `Drawer` result object
        Drawer result = new DrawerBuilder()
                .withActivity(this)
                .withToolbar(toolbar)
                .addDrawerItems(
                        item1,
                        item2,
                        new DividerDrawerItem(),
                        item3

                ).withOnDrawerItemClickListener(new Drawer.OnDrawerItemClickListener() {
                    @Override
                    public boolean onItemClick(View view, int position, IDrawerItem drawerItem) {
                        // do something with the clicked item :D


                        return true;
                    }
                })
                .build();


    }
}