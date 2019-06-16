package calculator.example.com.calci;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Calci extends AppCompatActivity {
Button b1,b2,b3,b4;
TextView tv1;
EditText e1,e2;
float first;
float second;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calci);
        b1=(Button) findViewById(R.id.b1);
        b2=(Button) findViewById(R.id.b2);
        b3=(Button) findViewById(R.id.b3);
        b4=(Button) findViewById(R.id.b4);

        tv1=(TextView) findViewById(R.id.tv1);

        e1=(EditText) findViewById(R.id.ed1);
        e2=(EditText) findViewById(R.id.ed2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                first=Float.valueOf(e1.getText().toString());
                second=Float.valueOf(e2.getText().toString());
                tv1.setText(String.valueOf(first+second));
            }
        });


        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                first=Float.valueOf(e1.getText().toString());
                second=Float.valueOf(e2.getText().toString());
                tv1.setText(String.valueOf(first-second));
            }
        });


        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                first=Float.valueOf(e1.getText().toString());
                second=Float.valueOf(e2.getText().toString());
                tv1.setText(String.valueOf(first*second));
            }
        });


        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                first=Float.valueOf(e1.getText().toString());
                second=Float.valueOf(e2.getText().toString());
                tv1.setText(String.valueOf(first/second));
            }
        });

    }
}
