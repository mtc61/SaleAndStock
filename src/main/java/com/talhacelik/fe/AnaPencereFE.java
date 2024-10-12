package com.talhacelik.fe;

import com.talhacelik.interfaces.FeInterfaces;
import com.talhacelik.utilities.menuler;

import javax.swing.*;
import java.awt.*;
import java.util.Date;

public class AnaPencereFE extends JFrame implements FeInterfaces {
    Date currentDate = new Date();
    long currentTimeMillis = currentDate.getTime();

    public AnaPencereFE() {
        println("Current date and time: " + currentDate);
        println("Milliseconds since Unix epoch: " + currentTimeMillis);
        initPencere();
    }

    private void println(String s) {
        System.out.println(s);
    }

    @Override
    public void initPencere() {
        JMenuBar bar = initBar();
        setJMenuBar(bar);
        setTitle("Satış Ve Stok Programı");
        setSize(600, 250);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public JPanel initPanel() {
        return new JPanel();
    }


    @Override
    public JMenuBar initBar() {
        return menuler.initBar();
    }

    @Override
    public JTabbedPane initTabs() {
        return null;
    }

    public static void main(String[] args) {
        new AnaPencereFE();
    }
}
