package com.notatnik.menu;

import com.notatnik.polepanel.PolePanel;

import java.awt.*;

public class MenuEdycja {

    public MenuEdycja() {

    }

    public void NormalnaC() {
        PolePanel.jTextArea.setFont(PolePanel.defaultFont);
    }
    public void PowiekszenieC() {
        PolePanel.jTextArea.setFont(new Font("Arial",Font.PLAIN,18));
    }

    public void PomniejszenieC() {
        PolePanel.jTextArea.setFont(new Font("Arial",Font.PLAIN,12));
    }

    public void Wyczysc() {
        PolePanel.jTextArea.setText("");
    }

}
