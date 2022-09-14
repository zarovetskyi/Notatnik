package com.notatnik;

import com.notatnik.menu.Menu;
import com.notatnik.menu.MenuPopUp;
import com.notatnik.polepanel.PolePanel;

import javax.swing.*;
import java.awt.*;

public class Notatnik {
    public static JFrame jFrame = new JFrame();
    public Notatnik() {
        jFrame.setTitle("Notatnik v2");
        ImageIcon img = new ImageIcon("resources/img/Windows_Notepad_Icon.png");
        jFrame.setIconImage(img.getImage());

        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension rozmiarEkranu = toolkit.getScreenSize();
        int szerEkranu = rozmiarEkranu.width;
        int wysEkranu = rozmiarEkranu.height;
        jFrame.setBounds(szerEkranu/4, wysEkranu/4,szerEkranu/2,wysEkranu/2);

        jFrame.setResizable(true);

        Menu menu = new Menu(jFrame);
        PolePanel polePanel = new PolePanel(jFrame);
        MenuPopUp menuPopUp = new MenuPopUp();

        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
