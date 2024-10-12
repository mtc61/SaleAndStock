package com.talhacelik;

import com.talhacelik.fe.AnaPencereFE;

import javax.swing.*;

public class AppMain {
    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new AnaPencereFE();

            }
        });

    }
}
