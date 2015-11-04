package org.ifno_software.androidmvp;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;

/**
 * Created by inferno on 11/4/15.
 */
public class LoginViewImpl extends RelativeLayout implements LoginView {

    private EditText loginField;
    private EditText passwordField;
    private Button loginButton;

    public LoginViewImpl(Context context) {
        super(context);
        InitView();
    }

    public LoginViewImpl(Context context, AttributeSet attrs) {
        super(context, attrs);
        InitView();
    }

    public LoginViewImpl(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        InitView();
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public LoginViewImpl(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        InitView();
    }

    private void InitView() {
        inflate(getContext(), R.layout.activity_mvp, this);
        loginField = (EditText) findViewById(R.id.login);
        passwordField = (EditText) findViewById(R.id.password);
        loginButton = (Button) findViewById(R.id.login_button);
    }

    @Override
    public String getLogin() {
        return loginField.getText().toString();
    }

    @Override
    public void setLogin(String login) {
        loginField.setText(login);
    }

    @Override
    public String getPassword() {
        return passwordField.getText().toString();
    }

    @Override
    public void setPassword(String password) {
        passwordField.setText(password);
    }

    @Override
    public void setOnLoginClickListener(OnClickListener onLoginClickListener) {
        loginButton.setOnClickListener(onLoginClickListener);
    }
}
