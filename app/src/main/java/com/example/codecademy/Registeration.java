package com.example.codecademy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.codecademy.databinding.ActivityMainBinding;
import com.google.firebase.auth.EmailAuthCredential;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.ktx.Firebase;

import java.util.HashMap;
import java.util.jar.Attributes;


public class Registeration extends AppCompatActivity {
    EditText Name, Number, pw, Email;
    Button button3;
    FirebaseDatabase db = FirebaseDatabase.getInstance();
    DatabaseReference root = db.getReference().child("Register");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_registeration);

        Name =  findViewById(R.id.Name);
        Number = findViewById(R.id.Number);
        pw =  findViewById(R.id.pw);
        Email = findViewById(R.id.Email);
        button3 =findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String name = Name.getText().toString();
               String email = Email.getText().toString();
               String Pw = pw.getText().toString();
               String number = Number.getText().toString();
               HashMap<String, String> RegisterMap = new HashMap<>();

               RegisterMap.put("name",name );
               RegisterMap.put("email", email);
               RegisterMap.put("Pw", Pw);
               RegisterMap.put("number", number);

               root.push().setValue(RegisterMap);

                Toast.makeText(Registeration.this, "You are successfully registered", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });
    }
}







