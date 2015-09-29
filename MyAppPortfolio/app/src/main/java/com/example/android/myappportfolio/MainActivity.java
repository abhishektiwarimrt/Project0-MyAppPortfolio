package com.example.android.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    // Display Message on Buttton Click
    public void displayMessage(View view){

        switch(view.getId()){
            case R.id.button1:
                Message("This button will launch Media Streamer App!");
                break;
            case R.id.button2:
                Message("This button will launch Scores App!");
                break;
            case R.id.button3:
                Message("This button will launch Library App!");
                break;
            case R.id.button4:
                Message("This button will launch Buid It Bigger App!");
                break;
            case R.id.button5:
                Message("This button will launch Bacon Reader App!");
                break;
            case R.id.button6:
                Message("This button will launch Capstone App!");
                break;
        }
    }

    public void Message(String msg){
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
}
