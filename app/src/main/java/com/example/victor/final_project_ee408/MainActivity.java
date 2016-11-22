package com.example.victor.final_project_ee408;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    Toolbar sidebar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        API.Complex a = new API.Complex();
        sidebar = (Toolbar)findViewById(R.id.sidebar);
        setSupportActionBar(sidebar);
    }

}
