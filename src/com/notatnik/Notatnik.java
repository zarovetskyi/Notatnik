package com.notatnik;

import com.notatnik.menu.Menu;
import com.notatnik.polepanel.PolePanel;

import javax.swing.*;
import java.awt.*;

public class Notatnik extends JFrame {
    public Notatnik() {
        setTitle("Notatnik v2");
        ImageIcon img = new ImageIcon("resources/img/Windows_Notepad_Icon.png");
        setIconImage(img.getImage());

        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension rozmiarEkranu = toolkit.getScreenSize();
        int szerEkranu = rozmiarEkranu.width;
        int wysEkranu = rozmiarEkranu.height;
        setBounds(szerEkranu/4, wysEkranu/4,szerEkranu/2,wysEkranu/2);

        setResizable(false);

        Menu menu = new Menu(this);
        PolePanel polePanel = new PolePanel(this);
    }
}
