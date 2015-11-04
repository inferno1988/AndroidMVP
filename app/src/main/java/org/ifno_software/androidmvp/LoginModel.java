package org.ifno_software.androidmvp;

/**
 * Created by inferno on 11/4/15.
 */
public class LoginModel {
    private static final String LOGIN_KEY = "login.key";
    private static final String PASSWORD_KEY = "password.key";
    private final StorageProvider storageProvider;

    public LoginModel(StorageProvider storageProvider) {

        this.storageProvider = storageProvider;
    }

    public String getLogin() {
        return storageProvider.getString(LOGIN_KEY, "");
    }

    public String getPassword() {
        return storageProvider.getString(PASSWORD_KEY, "");
    }

    public void setPassword(String password) {
        storageProvider.putString(PASSWORD_KEY, password);
    }

    public void setLogin(String login) {
        storageProvider.putString(LOGIN_KEY, login);
    }
}
