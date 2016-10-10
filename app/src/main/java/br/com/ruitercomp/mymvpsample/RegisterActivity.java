package br.com.ruitercomp.mymvpsample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;

public class RegisterActivity extends AppCompatActivity implements RegisterView {

    private EditText name;
    private EditText username;
    private EditText password;
    private ProgressBar progressBar;
    private RegisterPresenter registerPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        name = (EditText) findViewById(R.id.editText);
        username = (EditText) findViewById(R.id.editText2);
        password = (EditText) findViewById(R.id.editText4);
        progressBar = (ProgressBar) findViewById(R.id.progressBar);

        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                registerPresenter.validateRegister(name.getText().toString(),
                        username.getText().toString(),
                        password.getText().toString());
            }
        });

        registerPresenter = new RegisterPresenterImpl(this);
    }

    @Override
    protected void onDestroy() {
        registerPresenter.onDestroy();
        super.onDestroy();
    }

    @Override
    public void showProgressBar() {
        progressBar.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideProgressBar() {
        progressBar.setVisibility(View.GONE);
    }

    @Override
    public void setNameError() {
        name.setError("type your name");
    }

    @Override
    public void setUsernameError() {
        username.setError("type your username");
    }

    @Override
    public void setPasswordError() {
        password.setError("type your password");
    }

    @Override
    public void navigateToLogin() {
        startActivity(new Intent(RegisterActivity.this, MainActivity.class));
    }
}
