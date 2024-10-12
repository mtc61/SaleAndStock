package com.talhacelik.utilities;

import com.talhacelik.fe.KategoriEkleFE;
import com.talhacelik.fe.UrunEkleFE;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class menuler {
    public static JMenuBar initBar() {
        JMenuBar bar = new JMenuBar();

        JMenu dosyaMenu = new JMenu("Dosya");
        bar.add(dosyaMenu);
        JMenuItem cikisItem = new JMenuItem("Çıkış");
        dosyaMenu.add(cikisItem);

        JMenu urunlerMenu = new JMenu("Ürünler");
        bar.add(urunlerMenu);
        JMenuItem urunEkleItem = new JMenuItem("Ürün Ekle");
        urunlerMenu.add(urunEkleItem);

        JMenuItem kategoriEkleItem = new JMenuItem("Kategori Ekle");
        urunlerMenu.add(kategoriEkleItem);
        urunlerMenu.addSeparator();
        JMenuItem urunDuzenleItem = new JMenuItem("Ürünü Düzenle");
        urunlerMenu.add(urunDuzenleItem);
        JMenuItem kategoriDuzenleItem = new JMenuItem("Kategori Düzenle");
        urunlerMenu.add(kategoriDuzenleItem);


        urunEkleItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {

                        new UrunEkleFE();

                    }
                });
            }
        });

        kategoriEkleItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new KategoriEkleFE();
            }
        });


        return bar;

    }
}