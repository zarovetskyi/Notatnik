package com.notatnik.polepanel;

import com.notatnik.menu.MenuPlik;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PolePanel implements ActionListener {

    public static JTextArea jTextArea;
    public static Font defaultFont = new Font("Arial", Font.PLAIN, 14);

    public PolePanel(JFrame jFrame) {

        jTextArea = new JTextArea();

        jTextArea.setFont(defaultFont);
        JScrollPane jScrollPane = new JScrollPane(
                jTextArea,
                JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        jFrame.setLayout(new BorderLayout());
        jFrame.add(jScrollPane, BorderLayout.CENTER);

        JPanel jPanelLewy = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel jPanelCentralny = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel jPanelPrawy = new JPanel(new FlowLayout(FlowLayout.CENTER));

        JPanel jPanelPrzyciski = new JPanel(new GridLayout(1, 2));
        jPanelPrzyciski.add(jPanelLewy);
        jPanelPrzyciski.add(jPanelCentralny);
        jPanelPrzyciski.add(jPanelPrawy);

        jFrame.add(jPanelPrzyciski, BorderLayout.SOUTH);

        JButton jButtonTytul = new JButton("Tytul");
        JButton jButtonPodpis = new JButton("Podpis");
        jPanelLewy.add(jButtonTytul);
        jPanelLewy.add(jButtonPodpis);

        jButtonTytul.setActionCommand("41");
        jButtonTytul.addActionListener(this);

        jButtonPodpis.setActionCommand("42");
        jButtonPodpis.addActionListener(this);

        JRadioButton jRadioButtonBialy = new JRadioButton("biały", true);
        JRadioButton jRadioButtonZolty = new JRadioButton("zółty");
        JRadioButton jRadioButtonZielony = new JRadioButton("zielony");

        jRadioButtonBialy.setActionCommand("1");
        jRadioButtonZolty.setActionCommand("2");
        jRadioButtonZielony.setActionCommand("3");

        jRadioButtonBialy.addActionListener(this);
        jRadioButtonZolty.addActionListener(this);
        jRadioButtonZielony.addActionListener(this);

        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(jRadioButtonBialy);
        buttonGroup1.add(jRadioButtonZolty);
        buttonGroup1.add(jRadioButtonZielony);

        jPanelPrawy.add(jRadioButtonBialy);
        jPanelPrawy.add(jRadioButtonZolty);
        jPanelPrawy.add(jRadioButtonZielony);

        Border pisanie = BorderFactory.createEtchedBorder();
        Border wstawki = BorderFactory.createEtchedBorder();
        Border koloryCzcionki = BorderFactory.createLineBorder(Color.black);
        Border koloryTla = BorderFactory.createEtchedBorder();

        Border pisanieTytul = BorderFactory.createTitledBorder(pisanie, "Pisanie");
        Border wstawkiTytul = BorderFactory.createTitledBorder(wstawki, "Wstawki");
        Border koloryCzcionkiTytul = BorderFactory.createTitledBorder(koloryCzcionki, "Kolory Czcionki");
        Border koloryTlaTytul = BorderFactory.createTitledBorder(koloryTla, "Kolory Tła");

        jScrollPane.setBorder(pisanieTytul);
        jPanelLewy.setBorder(wstawkiTytul);
        jPanelCentralny.setBorder(koloryCzcionkiTytul);
        jPanelPrawy.setBorder(koloryTlaTytul);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //sprawdzenie ktory przycisk zostal wcisniety i wykonanie odpowiedniej akcji
        switch (Integer.parseInt(e.getActionCommand())) {
            case 1: {
                jTextArea.setBackground(Color.WHITE);
                break;
            }
            case 2: {
                jTextArea.setBackground(Color.YELLOW);
                break;
            }
            case 3: {
                jTextArea.setBackground(Color.GREEN);
                break;
            }
            case 41: {
                jTextArea.setText("Szanowny Panie \n\n" + jTextArea.getText());
                break;
            }
            case 42: {
                jTextArea.setText(jTextArea.getText() + "\n\n Z poważaniem,\n");
                break;
            }
        }
    }
}
