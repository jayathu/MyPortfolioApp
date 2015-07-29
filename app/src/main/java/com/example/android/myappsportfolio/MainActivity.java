package com.example.android.myappsportfolio;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private Toast toast;

    public void DisplayMessage(View view)
    {
        Context context = getApplicationContext();
        Button button = (Button)view;
        //String msg = "This will launch my " + button.getText().toString() + " App ";

        String msg = getString(R.string.toast_msg) + " " + button.getText().toString();
        if(toast != null)
        {
            toast.cancel();
        }
        toast = Toast.makeText(context, msg, Toast.LENGTH_SHORT);
        toast.show();
    }
}
