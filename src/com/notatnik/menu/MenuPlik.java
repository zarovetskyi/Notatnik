package com.notatnik.menu;

import javax.swing.*;
import java.io.*;

public class MenuPlik {

    public MenuPlik() {
    }
    public void OdczytPliku (JFrame jFrame, JTextArea jTextArea) {

        JFileChooser jFileChooser = new JFileChooser(".");
        if (JFileChooser.APPROVE_OPTION == jFileChooser.showOpenDialog(jFrame)) {
            try {
                File file = jFileChooser.getSelectedFile();
                jFrame.setTitle(file.getAbsolutePath() + " Notatnik");
                BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                String temp = "";
                while (bufferedReader.ready()) {
                    temp += bufferedReader.readLine() + "\n";
                }
                jTextArea.setText(temp);
            } catch (IOException ioException) {
                System.out.println("Brak pliku");
            }
        }
    }

    public void ZapisPliku(JFrame jFrame, JTextArea jTextArea) {

        JFileChooser jFileChooser = new JFileChooser(".");
        if (JFileChooser.APPROVE_OPTION == jFileChooser.showSaveDialog(jFrame)) {
            try {
                File file = jFileChooser.getSelectedFile();
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
                bufferedWriter.write(jTextArea.getText());
                bufferedWriter.flush();
                bufferedWriter.close();
            } catch (IOException ioException) {
                System.out.println("Problemy z zapisem");
            }
        }
    }

    public void ZamykanieProgramu() {

        System.exit(0);
    }
}
