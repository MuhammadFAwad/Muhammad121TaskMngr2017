package com.awad.muhammad.muhammad121taskmngr2017;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.main_menu,menu);
        return true;
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        return super.onContextItemSelected(item);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        switch (item.getItemId())
        {
            case R.id.mnItmscreen1:
                Toast.makeText(getBaseContext(), "Hi...screen1", Toast.LENGTH_LONG).show();
                break;
            case R.id.mnItmscreen2:
                Toast.makeText(getBaseContext(), "Hi...screen2", Toast.LENGTH_LONG).show();
                break;
            case R.id.mnItmscreen3:
                Toast.makeText(getBaseContext(), "Hi...screen3", Toast.LENGTH_LONG).show();
                break;
            case R.id.mnItmscreen4:
                Toast.makeText(getBaseContext(), "Hi...screen4", Toast.LENGTH_LONG).show();
                break;
        }
        return true;
    }
}
