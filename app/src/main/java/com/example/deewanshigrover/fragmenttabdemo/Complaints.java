package com.example.deewanshigrover.fragmenttabdemo;

import android.widget.Button;

import java.io.Serializable;

/**
 * Created by DEEWANSHI GROVER on 16-03-2019.
 */

public class Complaints implements Serializable {
 private String string;
 private Button button;

    public Button getButton() {
        return button;
    }

    public void setButton(Button button) {
        this.button = button;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }
}
