package com.sunny.www.firstactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Bundle bundle=getIntent().getExtras();
        //bundle.getString("valu01");는 두줄 밑()안으로 들어갔다.
        EditText editText=(EditText) findViewById(R.id.editTextvalue02);
        editText.setText(bundle.getString("valu01"));

        Button button=findViewById(R.id.button02);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        EditText editTextvalue02=findViewById(R.id.editTextvalue02);
        String editTextvalue02String=editTextvalue02.getText().toString();

        Bundle bundle = new Bundle();
        bundle.putString("value02",editTextvalue02String);
        Intent intent = new Intent(this,ThirdActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);


    }
}
