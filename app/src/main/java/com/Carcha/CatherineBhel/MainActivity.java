package com.Carcha.CatherineBhel;


import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.widget.Toast;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

    public class MainActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            Log.d( "4ITF", "OnCreate has been executed");

        }

        @Override
        protected void onStart() {
            super.onStart();
            Log.d( "4ITF", "OnStart has been executed");
        }

        @Override
        protected void onResume() {
            super.onResume();
            Log.d( "4ITF", "OnResume has been executed");
        }

        @Override
        protected void onPause() {
            super.onPause();
            Log.d( "4ITF", "OnPause has been executed");
        }

        @Override
        protected void onStop() {
            super.onStop();
            Log.d( "4ITF", "OnStop has been executed");
        }

        @Override
        protected void onRestart() {
            super.onRestart();
            Log.d( "4ITF", "OnRestart has been executed");
        }

        @Override
        protected void onDestroy() {
            super.onDestroy();
            Log.d( "4ITF", "Object is Allocated");
        }

        public void displaySnack(View view){
            Snackbar.make(view, "You Dont have any travel planned yet", Snackbar.LENGTH_LONG).show();

        }
        public void displayToast(View view){
            Toast.makeText( this, "You dont have any previous travel",  Toast.LENGTH_LONG).show();
        }
    }


