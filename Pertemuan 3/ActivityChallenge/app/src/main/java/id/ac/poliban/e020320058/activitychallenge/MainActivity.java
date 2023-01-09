    package id.ac.poliban.e020320058.activitychallenge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

    public class MainActivity extends AppCompatActivity {
        private static final String LOG_TAG =
                MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

        public void launchSecondActivity(View view) {
            Log.d(LOG_TAG, "Button clicked!");
            Intent intent = new Intent(this, SecondActivity.class);
            startActivity(intent);
        }

        public void launchThreeActivity(View view) {
            Log.d(LOG_TAG, "Button clicked!");
            Intent intent = new Intent(this, ThreeActivity.class);
            startActivity(intent);
        }

        public void launchFourActivity(View view) {
            Log.d(LOG_TAG, "Button clicked!");
            Intent intent = new Intent(this, FourActivity.class);
            startActivity(intent);
        }
    }