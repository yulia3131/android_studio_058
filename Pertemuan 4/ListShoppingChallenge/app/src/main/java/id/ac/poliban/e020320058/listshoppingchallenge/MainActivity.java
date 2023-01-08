package id.ac.poliban.e020320058.listshoppingchallenge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    public static final int ITEM_REQUEST = 1;
    private final TextView[] item = new TextView[9];
    private ArrayList<String> itemsList = new ArrayList<>(9);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        item[0] = findViewById(R.id.textView);
        item[1] = findViewById(R.id.textView2);
        item[2] = findViewById(R.id.textView3);
        item[3] = findViewById(R.id.textView4);
        item[4] = findViewById(R.id.textView5);
        item[5] = findViewById(R.id.textView6);
        item[6] = findViewById(R.id.textView7);
        item[7] = findViewById(R.id.textView8);
        item[8] = findViewById(R.id.textView9);

        if (savedInstanceState != null) {
            itemsList = savedInstanceState.getStringArrayList("ItemsListStringArray");
            int i;
            if (itemsList != null && itemsList.size() > 0) {
                for (i = 0; i < itemsList.size(); i++) {
                    if (itemsList.size() > 9) {
                        Toast.makeText(MainActivity.this, "Cannot add more items to the list",
                                Toast.LENGTH_LONG).show();
                        break;
                    }
                    item[i].setVisibility(View.VISIBLE);
                    item[i].setText(itemsList.get(i));
                }
            }
        }
    }
    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        if (itemsList.size() != 0) {
            outState.putStringArrayList("ItemsListStringArray", itemsList);
        }
    }

    public void addItem(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivityForResult(intent, ITEM_REQUEST);
    }

    // method for when SecondActivity returns intent
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == ITEM_REQUEST) {
            if (resultCode == RESULT_OK) {
                String itemString = data.getStringExtra(SecondActivity.EXTRA_ITEMS);
                itemsList.add(itemString);
                int i;
                for (i = 0; i < itemsList.size(); i++) {
                    if (itemsList.size() > 9) {
                        Toast.makeText(MainActivity.this, "Cannot add more items to the list",
                                Toast.LENGTH_LONG).show();
                        break;
                    }
                    item[i].setVisibility(View.VISIBLE);
                    item[i].setText(itemsList.get(i));
                }

            }
        }
    }
}