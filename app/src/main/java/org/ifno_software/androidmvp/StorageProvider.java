package org.ifno_software.androidmvp;

/**
 * Created by inferno on 11/4/15.
 */
public interface StorageProvider {
    String getString(String key, String defaultValue);
    void putString(String key, String value);
}
