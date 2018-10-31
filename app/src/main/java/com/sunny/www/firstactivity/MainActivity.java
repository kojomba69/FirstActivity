package com.sunny.www.firstactivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button=findViewById(R.id.button01);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        EditText editTextvalue01=findViewById(R.id.editTextvalue01);
        String editTextvalue01String=editTextvalue01.getText().toString();

        Bundle bundle = new Bundle();
        bundle.putString("valu01",editTextvalue01String);
        Intent intent = new Intent(this,SecondActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);


    }
}
