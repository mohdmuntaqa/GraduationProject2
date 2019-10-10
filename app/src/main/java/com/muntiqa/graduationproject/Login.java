package com.muntiqa.graduationproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
EditText c1,c2;
Button b1;
DatabaseHelper db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        db=new DatabaseHelper(this);
         c1=(EditText) findViewById(R.id.editText);
        c2=(EditText) findViewById(R.id.editText2);
        b1=(Button) findViewById(R.id.button2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email=c1.getText().toString();
                String password=c2.getText().toString();
                Boolean chkemailpass=db.emailpassword(email,password);
                if(chkemailpass==true)
                    Toast.makeText(getApplicationContext(), "Login Succesfully", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(getApplicationContext(), "wrong email or password", Toast.LENGTH_SHORT).show();
                Intent intent= new Intent(Login.this,Searchpage.class);
                startActivity(intent);
            }

        });

    }
}
