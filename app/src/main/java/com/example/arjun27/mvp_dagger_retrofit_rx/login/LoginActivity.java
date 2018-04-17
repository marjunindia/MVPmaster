package com.example.arjun27.mvp_dagger_retrofit_rx.login;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.arjun27.mvp_dagger_retrofit_rx.R;
import com.example.arjun27.mvp_dagger_retrofit_rx.login.Interfacelogin.LoginActvityMVP;

public class LoginActivity extends AppCompatActivity implements LoginActvityMVP.View {

    EditText firstname,lastname;
    Button submit;

    LoginActvityMVP.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstname=(EditText)findViewById(R.id.editText);
        lastname=(EditText)findViewById(R.id.editText2);
        submit=(Button) findViewById(R.id.button);


        presenter=new LoginActivityPresenter(this);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.loginButtonClicked();

            }
        });
    }


    @Override
    protected void onResume() {
        super.onResume();
        presenter.setView(this);
        presenter.getCurrentUser();

    }

    @Override
    public String getFirstname() {
        return firstname.getText().toString();
    }

    @Override
    public String getLastnmae() {
        return lastname.getText().toString();
    }

    @Override
    public void showUsernotAvailable() {
        Toast.makeText(this, "user not available", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showUserSavedMessage() {
        Toast.makeText(this, "user saved", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void showInputError() {
        Toast.makeText(this, "cnnot empty", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void setFirstname(String fname) {
        firstname.setText(fname);

    }

    @Override
    public void setLastname(String lname) {
        lastname.setText(lname);
    }
}
