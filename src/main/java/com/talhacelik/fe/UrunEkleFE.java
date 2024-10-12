package com.talhacelik.fe;

import com.talhacelik.interfaces.FeInterfaces;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

public class UrunEkleFE extends JDialog implements FeInterfaces {

    public UrunEkleFE() {
        initPencere();
    }

    @Override
    public void initPencere() {
        JPanel panel = initPanel();
        add(panel);
        setTitle("Ürün Ekleyin");
        pack();
        setLocationRelativeTo(null);
        setModal(true);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public JPanel initPanel() {
        JPanel panel = new JPanel(new GridLayout(5, 2, 10, 10)); // Kategori satırını çıkardım

        JLabel adiLabel = new JLabel("Adı:", JLabel.RIGHT);
        panel.add(adiLabel);
        JTextField adiField = new JTextField(10);
        panel.add(adiField);

        JLabel dateLabel = new JLabel("Tarih Seç:", JLabel.RIGHT);
        panel.add(dateLabel);

        // Tarih seçimi için JSpinner
        SpinnerDateModel model = new SpinnerDateModel();
        JSpinner dateSpinner = new JSpinner(model);
        JSpinner.DateEditor editor = new JSpinner.DateEditor(dateSpinner, "dd-MM-yyyy");
        dateSpinner.setEditor(editor);
        dateSpinner.setValue(Calendar.getInstance().getTime()); // Bugünün tarihi
        panel.add(dateSpinner);

        JLabel fiyatLabel = new JLabel("Fiyat Gir:", JLabel.RIGHT);
        panel.add(fiyatLabel);
        JTextField fiyatField = new JTextField(10);
        panel.add(fiyatField);

        JButton kaydetButton = new JButton("Kaydet");
        kaydetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String adi = adiField.getText();
                String tarih = editor.getFormat().format(dateSpinner.getValue());
                String fiyat = fiyatField.getText();

                if (adi.isEmpty() || tarih.isEmpty() || fiyat.isEmpty()) {
                    JOptionPane.showMessageDialog(panel, "Lütfen tüm alanları doldurun!", "Hata", JOptionPane.ERROR_MESSAGE);
                } else {
                    // Burada kaydetme işlemi yapılabilir
                    System.out.println("Ürün Kaydedildi: " + adi + ", " + tarih + ", " + fiyat);
                    dispose();
                }
            }
        });
        panel.add(kaydetButton);

        JButton iptalButton = new JButton("İptal");
        iptalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        panel.add(iptalButton);

        return panel;
    }

    @Override
    public JMenuBar initBar() {
        return null;
    }

    @Override
    public JTabbedPane initTabs() {
        return null;
    }
}
