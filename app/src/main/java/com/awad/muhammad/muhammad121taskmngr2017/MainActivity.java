package com.awad.muhammad.muhammad121taskmngr2017;

import android.content.Intent;
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
                Intent intent = new Intent(this, Screen.class);
                startActivity(intent);
                break;
            case R.id.mnItmscreen2:
                Toast.makeText(getBaseContext(), "Hi...screen2", Toast.LENGTH_LONG).show();
                Intent intent1 = new Intent(this, Screen.class);
                startActivity(intent1);
                break;
            case R.id.mnItmscreen3:
                Toast.makeText(getBaseContext(), "Hi...screen3", Toast.LENGTH_LONG).show();
                Intent intent2 = new Intent(this, Screen.class);
                startActivity(intent2);
                break;
            case R.id.mnItmscreen4:
                Toast.makeText(getBaseContext(), "Hi...screen4", Toast.LENGTH_LONG).show();
                Intent intent3 = new Intent(this, Screen.class);
                startActivity(intent3);
                break;
        }
        return true;
    }
}
