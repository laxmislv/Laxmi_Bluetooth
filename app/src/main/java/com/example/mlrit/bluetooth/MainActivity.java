package com.example.mlrit.bluetooth;

import android.bluetooth.BluetoothAdapter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Switch s;
    TextView tv;
    BluetoothAdapter ba=BluetoothAdapter.getDefaultAdapter();
       @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
           s=(Switch) findViewById(R.id.s);
           tv=(TextView) findViewById(R.id.tv1);
           s.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
               @Override
               public void onCheckedChanged(CompoundButton buttonView, boolean b) {
                   if(b)
                   {
                       ba.enable();
                       tv.setText("ON");
                   }
                   else
                   {
                       tv.setText("OFF");
                       ba.disable();
                   }
               }
           });
    }
}
