package com.awad.muhammad.muhammad121taskmngr2017;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    private Button btnDate;
    private TextView tvShowDate;
    private Button btnTime;
    private TextView tvShowTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnDate = (Button) findViewById(R.id.btnDate);
        tvShowDate = (TextView) findViewById(R.id.tvShowDate);
        btnTime = (Button) findViewById(R.id.btnTime);
        tvShowTime = (TextView) findViewById(R.id.tvShowTime);

        btnDate.setOnClickListener(this); // this= the current (this) class implements this listener

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

    @Override
    public void onClick(View view)
    {
        if (view==btnDate)
        {
            //to get current date
            Calendar c= Calendar.getInstance();
            int year=c.get(Calendar.YEAR);
            int month=c.get(Calendar.MONTH);
            int day=c.get(Calendar.DAY_OF_MONTH);

            //Build Ondateset listenr
            DatePickerDialog.OnDateSetListener dateListener=new DatePickerDialog.OnDateSetListener() {
                @Override
                public void onDateSet(DatePicker view, int year, int month, int dayOfMonth)
                {
                    tvShowDate.setText(dayOfMonth+"/"+month+"/"+year);

                }
            };


            //buliding Date Dialog
            DatePickerDialog datePickerDialog=new DatePickerDialog(this,dateListener,year,month,day);
            datePickerDialog.show();
        }

        if(view==btnTime)
        {
            Calendar c1= Calendar.getInstance();
            int hour = c1.get(Calendar.HOUR);
            int minute = c1.get(Calendar.MINUTE);
            final TimePickerDialog.OnTimeSetListener timeListener = new TimePickerDialog.OnTimeSetListener()
            {
                public void onTimeSet(TimePicker timePicker, int hour, int minute)
                {
                    tvShowTime.setText(hour+":"+minute);
                }
            };
            TimePickerDialog timePickerDialog = new TimePickerDialog(this,timeListener, hour,minute,true);
            timePickerDialog.show();
        }
    }
}
