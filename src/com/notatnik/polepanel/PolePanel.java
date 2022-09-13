package com.notatnik.polepanel;

import com.notatnik.menu.MenuPlik;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PolePanel implements ActionListener {

    public static JTextArea jTextArea;
    public static Font defaultFont = new Font("Arial",Font.PLAIN,14);
    public PolePanel(JFrame jFrame) {

        jTextArea = new JTextArea();

        jTextArea.setFont(defaultFont);
        JScrollPane jScrollPane = new JScrollPane(
                jTextArea,
                JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        jFrame.setLayout(new BorderLayout());
        jFrame.add(jScrollPane,BorderLayout.CENTER);

        JPanel jPanelLewy = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel jPanelPrawy = new JPanel(new FlowLayout(FlowLayout.CENTER));

        JPanel jPanelPrzyciski = new JPanel(new GridLayout(1,2));
        jPanelPrzyciski.add(jPanelLewy);
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

        JRadioButton jRadioButtonBialy = new JRadioButton("bialy",true);
        JRadioButton jRadioButtonZolty = new JRadioButton("zolty");
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
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //sprawdzenie ktory przycisk zostal wcisniety i wykonanie odpowiedniej akcji
        switch (Integer.parseInt(e.getActionCommand()))
        {
            case 1:
            {
                jTextArea.setBackground(Color.WHITE);
                break;
            }
            case 2:
            {
                jTextArea.setBackground(Color.YELLOW);
                break;
            }
            case 3:
            {
                jTextArea.setBackground(Color.GREEN);
                break;
            }
            case 41:
            {
                jTextArea.setText("Szanowny Panie \n\n"+jTextArea.getText());
                break;
            }
            case 42:
            {
                jTextArea.setText(jTextArea.getText()+"\n\n Z powazaniem,\n");
                break;
            }
        }
    }
}
