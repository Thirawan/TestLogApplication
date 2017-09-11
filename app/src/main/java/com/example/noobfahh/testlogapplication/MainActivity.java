package com.example.noobfahh.testlogapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText editNumber1;
    private EditText editNumber2;
    private TextView tvResult;
    private Button btnCalculate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editNumber1 =(EditText) findViewById(R.id.editNumber1);
        editNumber2 =(EditText) findViewById(R.id.editNumber2);
        tvResult =(TextView) findViewById(R.id.tvResult);
        btnCalculate =(Button) findViewById(R.id.btnCalculate);

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int val1;
                int val2;
                int sum;

                val1 = Integer.parseInt(editNumber1.getText().toString());
                val2 = Integer.parseInt(editNumber2.getText().toString());
                sum = val1 + val2;
                tvResult.setText(sum  + "");

                //Log.d("Culculate","Sum =" + sum);
                //Toast.makeText(MainActivity.this,"Sum =" +sum,Toast.LENGTH_SHORT).show();

            }
        });
    }
}
