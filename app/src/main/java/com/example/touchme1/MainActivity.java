package com.example.touchme1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    //this is from simom
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayStrings(View view){
        TextView str1 = (TextView) findViewById(R.id.strOne);
        TextView str2 = (TextView) findViewById(R.id.strTwo);
        str1.setText("Rmit");
        str2.setText("Mel");
    }

}//end fo app