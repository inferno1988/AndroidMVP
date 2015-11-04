package org.ifno_software.androidmvp;

import android.view.View;

/**
 * Created by inferno on 11/4/15.
 */
public interface LoginView {
    String getLogin();
    void setLogin(String login);

    String getPassword();
    void setPassword(String password);

    void setOnLoginClickListener(View.OnClickListener onLoginClickListener);
}
