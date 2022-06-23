package com.e.foodmenudemo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
   LinearLayout custom;
   TextView textView;

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case Menu.FIRST:
                custom.setBackgroundResource(R.drawable.pizza);
                textView.setText("You have selected : "+item.getTitle());
                break;
            case Menu.FIRST+1:
                custom.setBackgroundResource(R.drawable.burger);
                textView.setText("You have selected : "+item.getTitle());
                break;
            case Menu.FIRST+2:
                custom.setBackgroundResource(R.drawable.samosa);
                textView.setText("You have selected : "+item.getTitle());
                break;
            case Menu.FIRST+3:
                custom.setBackgroundResource(R.drawable.cake);
                textView.setText("You have selected : "+item.getTitle());
                break;
            case Menu.FIRST+4:
                custom.setBackgroundResource(R.drawable.noodles);
                textView.setText("You have selected : "+item.getTitle());
                break;
            case Menu.FIRST+5:
                custom.setBackgroundResource(R.drawable.puff);
                textView.setText("You have selected : "+item.getTitle());
                break;

        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0,Menu.FIRST,Menu.NONE,"Pizza"); // item
        menu.add(0,Menu.FIRST+1,Menu.NONE,"Burger");
        menu.add(0,Menu.FIRST+2,Menu.NONE,"Samosa");
        menu.add(0,Menu.FIRST+3,Menu.NONE,"Cake");
        menu.add(0,Menu.FIRST+4,Menu.NONE,"Noodles");
        menu.add(0,Menu.FIRST+5,Menu.NONE,"Puff");

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        custom=findViewById(R.id.custom);
        textView=findViewById(R.id.textView);


    }
}