package com.notatnik.menu;

import com.notatnik.Notatnik;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import static com.notatnik.Notatnik.jFrame;
import static com.notatnik.polepanel.PolePanel.jTextArea;

public class MenuPopUp implements ActionListener {

    public MenuPopUp() {

        JPopupMenu jPopupMenu = new JPopupMenu();

        JMenuItem metal = new JMenuItem("metal look-and-feel");
        JMenuItem windows = new JMenuItem("windows look-and-feel");
        JMenuItem motif = new JMenuItem("motif look-and-feel");

        metal.setActionCommand("1");
        windows.setActionCommand("2");
        motif.setActionCommand("3");

        jPopupMenu.add(metal);
        jPopupMenu.add(windows);
        jPopupMenu.add(motif);

        jTextArea.setComponentPopupMenu(jPopupMenu);
        jFrame.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                jPopupMenu.show(jFrame, e.getX(), e.getY());
            }
        });
        metal.addActionListener(this);
        windows.addActionListener(this);
        motif.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        switch (Integer.parseInt(e.getActionCommand())) {
            case 1:
            {
                try {
                    UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
                    SwingUtilities.updateComponentTreeUI(jFrame);
                } catch (Exception exception) {
                    System.out.println("Exception");
                }
                break;
            }
            case 2:
            {
                try {
                    UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
                    SwingUtilities.updateComponentTreeUI(jFrame);
                } catch (Exception exception) {
                    System.out.println("Exception");
                }
                break;
            }
            case 3:
            {
                try {
                    UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
                    SwingUtilities.updateComponentTreeUI(jFrame);
                } catch (Exception exception) {
                    System.out.println("Exception");
                }
                break;
            }
        }
    }
}
