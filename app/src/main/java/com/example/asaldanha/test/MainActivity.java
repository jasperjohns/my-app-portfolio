package com.example.asaldanha.test;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

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

    /** Called when the user touches the button */
    public void sendMessage(View view) {


        switch (view.getId()) {
            case  R.id.button: {
                Toast.makeText(MainActivity.this, "Spotify Streamer", Toast.LENGTH_SHORT).show();
                break;
            }
            case  R.id.button2: {
                Toast.makeText(MainActivity.this, "Score App", Toast.LENGTH_SHORT).show();
                break;
            }
            case  R.id.button3: {
                Toast.makeText(MainActivity.this, "Library App", Toast.LENGTH_SHORT).show();
                break;
            }

            //.... etc
        }


    }

}
