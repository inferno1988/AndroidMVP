package org.ifno_software.androidmvp;

import android.view.View;

/**
 * Created by inferno on 11/4/15.
 */
public class LoginPresenter {
    private final LoginView loginView;
    private final LoginModel loginModel;

    public LoginPresenter(LoginView loginView, LoginModel loginModel) {
        this.loginView = loginView;
        this.loginModel = loginModel;
        loginView.setLogin(loginModel.getLogin());
        loginView.setPassword(loginModel.getPassword());

        loginView.setOnLoginClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doLogin();
            }
        });
    }

    private void doLogin() {
        loginModel.setLogin(loginView.getLogin());
        loginModel.setPassword(loginView.getPassword());
    }
}
