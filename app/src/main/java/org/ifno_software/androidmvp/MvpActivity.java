package org.ifno_software.androidmvp;

import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MvpActivity extends AppCompatActivity implements StorageProvider {

    private LoginView loginView;
    private LoginModel loginModel;
    private LoginPresenter loginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        loginView = new LoginViewImpl(this);
        setContentView((View) loginView);

        loginModel = new LoginModel(this);
        loginPresenter = new LoginPresenter(loginView, loginModel);
    }

    @Override
    public String getString(String key, String defaultValue) {
        return PreferenceManager.getDefaultSharedPreferences(this).getString(key, defaultValue);
    }

    @Override
    public void putString(String key, String value) {
        PreferenceManager.getDefaultSharedPreferences(this).edit().putString(key, value).apply();
    }
}
