package com.example.mamun.toolbarwithlogoexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        // if you like
        //toolbar.setTitle("Hello world")
        //toolbar.setLogo(R.drawable.Logo);
        setSupportActionBar(toolbar);




    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

       getMenuInflater().inflate(R.menu.menu_main,menu);
       return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id= item.getItemId();

        if(id == R.id.action_settings){
            Toast.makeText(getApplicationContext(),"Setting action",Toast.LENGTH_LONG).show();
        }
        if(id == R.id.user_account){
            Toast.makeText(getApplicationContext(),"user_account",Toast.LENGTH_LONG).show();
        }
        if(id == R.id.search){
            Toast.makeText(getApplicationContext(),"search",Toast.LENGTH_LONG).show();
        }

        return super.onOptionsItemSelected(item);
    }


}
