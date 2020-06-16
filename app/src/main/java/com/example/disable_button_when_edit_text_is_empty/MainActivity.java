package com.example.disable_button_when_edit_text_is_empty;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText editTextUsername;
    private EditText editTextPassword;
    private Button buttonConfirm ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            editTextUsername = findViewById(R.id.edit_text_password);
            editTextPassword = findViewById(R.id.edit_text_password);
            buttonConfirm= findViewById(R.id.button_conform);

            editTextUsername.addTextChangedListener(loginTextWatcher);
            editTextPassword.addTextChangedListener(loginTextWatcher);
    }
private  TextWatcher loginTextWatcher = new TextWatcher() {
    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {
        String usernameInput =editTextUsername.getText().toString().trim();//removing space from beggining and end trim is used;
        String passwordInput = editTextPassword.getText().toString().trim();

// text in both or both empty both ( enable or disable button)

        buttonConfirm.setEnabled(!usernameInput.isEmpty() && !passwordInput.isEmpty() );
    }

    @Override
    public void afterTextChanged(Editable s) {

    }
};

}

