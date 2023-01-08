package id.ac.poliban.e020320058.listshoppingchallenge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

 public class SecondActivity extends AppCompatActivity {
    public static final String EXTRA_ITEMS = "id.ac.poliban.vb.e020320058.listshoppingchallenge.extra.ITEMS";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        //  Intent intent = getIntent();
    }

    public void selectItem(View view) {
        Intent return_items_intent = new Intent();

        switch (view.getId()){
            case R.id.button9:
                return_items_intent.putExtra(EXTRA_ITEMS, "Minyak Goreng");
                setResult(RESULT_OK, return_items_intent); finish();
                break;

            case R.id.button8:
                return_items_intent.putExtra(EXTRA_ITEMS, "Garam");
                setResult(RESULT_OK, return_items_intent); finish();
                break;

            case R.id.button7:
                return_items_intent.putExtra(EXTRA_ITEMS, "Gula");
                setResult(RESULT_OK, return_items_intent); finish();
                break;

            case R.id.button6:
                return_items_intent.putExtra(EXTRA_ITEMS, "Ayam");
                setResult(RESULT_OK, return_items_intent); finish();
                break;

            case R.id.button5:
                return_items_intent.putExtra(EXTRA_ITEMS, "Keju");
                setResult(RESULT_OK, return_items_intent); finish();
                break;

            case R.id.button4:
                return_items_intent.putExtra(EXTRA_ITEMS, "Tepung");
                setResult(RESULT_OK, return_items_intent); finish();
                break;

            case R.id.button3:
                return_items_intent.putExtra(EXTRA_ITEMS, "Susu");
                setResult(RESULT_OK, return_items_intent); finish();
                break;

            case R.id.button2:
                return_items_intent.putExtra(EXTRA_ITEMS, "Roti");
                setResult(RESULT_OK, return_items_intent); finish();
                break;

            case R.id.button:
                return_items_intent.putExtra(EXTRA_ITEMS, "Beras");
                setResult(RESULT_OK, return_items_intent); finish();
                break;

            default:
                Toast.makeText(SecondActivity.this, "There was an error", Toast.LENGTH_LONG).show();
                break;
        }

    }
}