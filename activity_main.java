package com.example.abiram.nascom;


import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;



public class activity_main extends AppCompatActivity {
    private EditText name;
    private EditText password;
    private Button Login;
    private Button reg ;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=(EditText) findViewById(R.id.user);
        password=(EditText)findViewById(R.id.password);
        Login=(Button)findViewById(R.id.login);
        reg=(Button)findViewById(R.id.regid);



        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate(name.getText().toString(),password.getText().toString());
            }

        });
        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Register( );
            }

        });

    }
    private void validate(String name,String password)
    {
        if((name.equals("admin"))&&(password.equals("12345")))
        {
            Intent intent=new Intent(activity_main.this,Main2Activity.class);
            startActivity(intent);
        }else if ((name.equals("student"))&&(password.equals("12345"))){
            Intent intent=new Intent(getApplicationContext(),Main4Activity.class);
            startActivity(intent);
        }
        else{
            Toast.makeText(getBaseContext(),"Wrong Credinals",
                    Toast.LENGTH_LONG).show();
        }

    }
    private void Register( ){
        Intent intent=new Intent(getApplicationContext(),Main3Activity.class);
        startActivity(intent);
        Toast.makeText(getBaseContext(),"Registeration Area",
                Toast.LENGTH_LONG).show();
    }
}