package com.example.admin.sugarorm;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btnAdd, btnRead, btnClear;
    EditText etName, etEmail;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAdd = (Button) findViewById(R.id.btnAdd);
        btnAdd.setOnClickListener(this);

        btnRead = (Button) findViewById(R.id.btnRead);
        btnRead.setOnClickListener(this);

        btnClear = (Button) findViewById(R.id.btnClear);
        btnClear.setOnClickListener(this);

        etName = (EditText) findViewById(R.id.etName);
        etEmail = (EditText) findViewById(R.id.etEmail);

        textView = (TextView) findViewById(R.id.textView);


    }

    @Override
    public void onClick(View v) {
        String name = etName.getText().toString();
        String mail = etEmail.getText().toString();


        switch (v.getId()) {

            case R.id.btnAdd:

                Contact contact = new Contact(mail, name);
                contact.save();

                break;

            case R.id.btnRead:

                List<Contact> allContacts = Contact.listAll(Contact.class);

                textView.setText(allContacts.toString());

                break;

            case R.id.btnClear:

                Contact.deleteAll(Contact.class);

                break;
        }

    }
}