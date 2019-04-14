package com.example.taxconv;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button Amount;
    private TextView display;
    private EditText salary;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Amount = findViewById(R.id.btn_convert);
        display=findViewById(R.id.display);
        salary = findViewById(R.id.amt);
         final Conveter conv = new Conveter();
        Amount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String sal = salary.getText().toString();
                if( sal.isEmpty()){
                    Toast.makeText(MainActivity.this,"Enter salary",Toast.LENGTH_LONG).show();
                }
                else{
                    double tax =conv.percent(Double.parseDouble(sal));
                    display.setText(String.valueOf(tax));
                }
            }
        });
    }
}
