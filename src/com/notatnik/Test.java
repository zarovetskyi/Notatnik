package com.notatnik;

import javax.swing.*;

public class Test {
    public static void main(String[] args) {

//        UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
//        UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
//        UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
//        UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");

        try {
            UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
        } catch (Exception e) {
            System.out.println("Exception");
        }

        Notatnik notatnik = new Notatnik();
        notatnik.setVisible(true);
        notatnik.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
