package com.notatnik.menu;

import com.notatnik.polepanel.PolePanel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame implements ActionListener {

    public Menu(JFrame jFrame) {

        JMenuBar jMenuBar = new JMenuBar();
        jFrame.setJMenuBar(jMenuBar);

        //Plik
        JMenu mPlik = new JMenu("Plik");
        jMenuBar.add(mPlik);

        JMenuItem otworz = new JMenuItem("Otworz");
        JMenuItem zapisz = new JMenuItem("Zapisz");
        JMenuItem zakoncz = new JMenuItem("Zakoncz");

        mPlik.add(otworz);
        mPlik.add(zapisz);
        mPlik.addSeparator();
        mPlik.add(zakoncz);

        otworz.setActionCommand("1");
        zapisz.setActionCommand("2");
        zakoncz.setActionCommand("3");

        otworz.addActionListener(this);
        zapisz.addActionListener(this);
        zakoncz.addActionListener(this);

        otworz.setAccelerator(KeyStroke.getKeyStroke("ctrl O"));
        zapisz.setAccelerator(KeyStroke.getKeyStroke("ctrl S"));
        zakoncz.setAccelerator(KeyStroke.getKeyStroke("ctrl 0"));

        //Edycja
        JMenu mEdycja = new JMenu("Edycja");
        jMenuBar.add(mEdycja);

        ButtonGroup buttonGroup = new ButtonGroup();

        JRadioButtonMenuItem powiekszC = new JRadioButtonMenuItem("powiekszC");
        JRadioButtonMenuItem normalnaC = new JRadioButtonMenuItem("normalnaC");
        JRadioButtonMenuItem pomniejszC = new JRadioButtonMenuItem("pomniejszC");
        JMenuItem wyczysc = new JMenuItem("wyczysc");

        buttonGroup.add(powiekszC);
        buttonGroup.add(normalnaC);
        buttonGroup.add(pomniejszC);
        buttonGroup.add(wyczysc);

        mEdycja.add(powiekszC);
        mEdycja.add(normalnaC);
        mEdycja.add(pomniejszC);
        mEdycja.addSeparator();
        mEdycja.add(wyczysc);

        powiekszC.setActionCommand("11");
        normalnaC.setActionCommand("12");
        pomniejszC.setActionCommand("13");
        wyczysc.setActionCommand("14");

        powiekszC.addActionListener(this);
        normalnaC.addActionListener(this);
        pomniejszC.addActionListener(this);
        wyczysc.addActionListener(this);

        wyczysc.setAccelerator(KeyStroke.getKeyStroke("ctrl D"));

        //Pomoc
        JMenu mPomoc = new JMenu("Pomoc");
        jMenuBar.add(mPomoc);

        JMenuItem oAutorze = new JMenuItem("O Autorze");
        mPomoc.add(oAutorze);

        oAutorze.setActionCommand("21");
        oAutorze.addActionListener(this);

        mPlik.setMnemonic('P');
        mEdycja.setMnemonic('E');
        mPomoc.setMnemonic('H');
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (Integer.parseInt(e.getActionCommand())) {
            case 1:
            {
                MenuPlik menuPlik = new MenuPlik();
                menuPlik.OdczytPliku(this, PolePanel.jTextArea);
                break;
            }
            case 2:
            {
                MenuPlik menuPlik = new MenuPlik();
                menuPlik.ZapisPliku(this, PolePanel.jTextArea);
                break;
            }
            case 3:
            {
                MenuPlik menuPlik = new MenuPlik();
                menuPlik.ZamykanieProgramu();
                break;
            }
            case 11:
            {
                MenuEdycja menuEdycja = new MenuEdycja();
                menuEdycja.PowiekszenieC();
                break;
            }
            case 12:
            {
                MenuEdycja menuEdycja = new MenuEdycja();
                menuEdycja.NormalnaC();
                break;
            }
            case 13:
            {
                MenuEdycja menuEdycja = new MenuEdycja();
                menuEdycja.PomniejszenieC();
                break;
            }
            case 14:
            {
                MenuEdycja menuEdycja = new MenuEdycja();
                menuEdycja.Wyczysc();
                break;
            }
            case 21:
            {
                MenuPomoc menuPomoc = new MenuPomoc();
                menuPomoc.oAutorze(this);
                break;
            }
        }
    }
}
