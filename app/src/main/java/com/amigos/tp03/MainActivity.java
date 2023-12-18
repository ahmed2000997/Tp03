package com.amigos.tp03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
private Button tb3,tb2,tbf,ta3,ta2,taf,reset;
    private TextView tema,temb;
    private long startTime;
    private long endTime;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tbf=findViewById(R.id.buttonfreeb);
        tb3=findViewById(R.id.button3b);
        tb2=findViewById(R.id.button2b);
        temb=findViewById(R.id.conterb);
        tema=findViewById(R.id.contera);
        ta3=findViewById(R.id.button3A);
        ta2=findViewById(R.id.button2A);
        taf=findViewById(R.id.buttonfreea);

        reset=findViewById(R.id.reset);

        tbf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { startTime = System.currentTimeMillis(); int val;
                val= Integer.parseInt(String.valueOf(temb.getText()));
                temb.setText(val+1+"");
                endTime = System.currentTimeMillis();
                double executionTime = (endTime - startTime) / 1_000_000_000.0;                Toast.makeText(MainActivity.this, "Button  Execution Time: " + executionTime + "ms", Toast.LENGTH_SHORT).show();



            }
        });
        tb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startTime = System.currentTimeMillis();
                int val;
                val= Integer.parseInt(String.valueOf(temb.getText()));
                temb.setText(val+3+"");
                endTime = System.currentTimeMillis();
                double executionTime = (endTime - startTime) / 1_000_000_000.0;                Toast.makeText(MainActivity.this, "Button  Execution Time: " + executionTime + "ms", Toast.LENGTH_SHORT).show();

            }
        });
        tb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startTime = System.currentTimeMillis();
                int val;
                val= Integer.parseInt(String.valueOf(temb.getText()));
                temb.setText(val+2+"");
                endTime = System.currentTimeMillis();
                double executionTime = (endTime - startTime) / 1_000_000_000.0;                Toast.makeText(MainActivity.this, "Button  Execution Time: " + executionTime + "ms", Toast.LENGTH_SHORT).show();


            }
        });
        ta3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startTime = System.currentTimeMillis();
                int val;
                val= Integer.parseInt(String.valueOf(tema.getText()));
                tema.setText(val+3+"");
                endTime = System.currentTimeMillis();
                double executionTime = (endTime - startTime) / 1_000_000_000.0;                Toast.makeText(MainActivity.this, "Button  Execution Time: " + executionTime + "ms", Toast.LENGTH_SHORT).show();



            }
        });
        ta2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startTime = System.currentTimeMillis();
                int val;
                val= Integer.parseInt(String.valueOf(tema.getText()));
                tema.setText(val+2+"");
                endTime = System.currentTimeMillis();
                double executionTime = (endTime - startTime) / 1_000_000_000.0;                Toast.makeText(MainActivity.this, "Button  Execution Time: " + executionTime + "ms", Toast.LENGTH_SHORT).show();


            }
        });
        taf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startTime = System.currentTimeMillis();
                int val;
                val= Integer.parseInt(String.valueOf(tema.getText()));
                tema.setText(val+1+"");
                endTime = System.currentTimeMillis();
                double executionTime = (endTime - startTime) / 1_000_000_000.0;                Toast.makeText(MainActivity.this, "Button  Execution Time: " + executionTime + "ms", Toast.LENGTH_SHORT).show();


            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startTime = System.currentTimeMillis();

                tema.setText("0");
                temb.setText("0");
                endTime = System.currentTimeMillis();
                double executionTime = (endTime - startTime) / 1_000_000_000.0;                Toast.makeText(MainActivity.this, "Button  Execution Time: " + executionTime + "ms", Toast.LENGTH_SHORT).show();


            }
        });

    }
}