package com.example.mysplash;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

public class Menu extends AppCompatActivity {

        @Override
        public boolean onOptionsItemSelected(MenuItem item) {
            int id = item.getItemId();
            switch (id){
                case R.id.login:
                    Toast.makeText(getApplicationContext(),"Login",Toast.LENGTH_LONG).show();
                    return true;
                case R.id.cadastre:
                    Toast.makeText(getApplicationContext(),"Cadastre",Toast.LENGTH_LONG).show();
                    return true;

                default:
                    return super.onOptionsItemSelected(item);
            }
        }
}