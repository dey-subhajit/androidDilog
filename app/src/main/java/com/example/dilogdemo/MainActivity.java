package com.example.dilogdemo;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button bt_click;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt_click = findViewById(R.id.bt_click);

        bt_click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder bld_obj = new AlertDialog.Builder(MainActivity.this);
                bld_obj.setTitle("!Alert");
                /*avaiable*/
                bld_obj.setMessage("No internet available");
                bld_obj.setCancelable(false);
                bld_obj.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        bld_obj.setCancelable(true);
                        Toast.makeText(MainActivity.this, "You click ok", Toast.LENGTH_SHORT).show();
                    }
                });
                bld_obj.setNegativeButton("Cancle", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        bld_obj.setCancelable(true);
                        Toast.makeText(MainActivity.this, "You clicked cancle", Toast.LENGTH_SHORT).show();
                    }
                });
                bld_obj.show();
            }
        });
    }
}