package com.talhacelik.fe;

import com.talhacelik.dal.KategoriDAL;
import com.talhacelik.types.KategoriContract;
import com.talhacelik.interfaces.FeInterfaces;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class KategoriEkleFE extends JDialog implements FeInterfaces {

    public KategoriEkleFE() {
        initPencere();
    }

    @Override
    public void initPencere() {
        JPanel panel = initPanel();
        panel.setBorder(BorderFactory.createTitledBorder("Kategori Ekle"));
        add(panel);

        setTitle("Kategori Ekle");
        pack();
        setModalityType(DEFAULT_MODALITY_TYPE);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public JPanel initPanel() {
        JPanel panel = new JPanel(new GridLayout(3, 2, 10, 10)); // 3 satır, 2 sütun

        JLabel adiLabel = new JLabel("Kategori Adı:", JLabel.RIGHT);
        panel.add(adiLabel);

        JTextField kategoriAdi = new JTextField(10);
        panel.add(kategoriAdi);

        JLabel kategoriLabel = new JLabel("Kategori Seç:", JLabel.RIGHT);
        panel.add(kategoriLabel);

        JComboBox<KategoriContract> kategoriBox = new JComboBox<>();
        panel.add(kategoriBox);

        // İlk elemanı uygun bir KategoriContract nesnesi olarak ekleyelim
        kategoriBox.addItem(new KategoriContract("Kategori Seç", 0)); // parentId 0

        // Kategorileri yükle
        KategoriDAL kategoriDAL = new KategoriDAL();
        List<KategoriContract> kategoriler = kategoriDAL.GetAll();
        for (KategoriContract kategori : kategoriler) {
            kategoriBox.addItem(kategori);
        }

        JButton kaydetButton = new JButton("Kaydet");
        kaydetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String kategori = kategoriAdi.getText();

                if (kategori.isEmpty()) {
                    JOptionPane.showMessageDialog(panel, "Lütfen kategori adını girin!", "Hata", JOptionPane.ERROR_MESSAGE);
                } else {
                    // Burada kategori kaydetme işlemleri yapılabilir
                    System.out.println("Kategori Eklendi: " + kategori);
                    dispose(); // Pencereyi kapat
                }
            }
        });
        panel.add(kaydetButton);

        JButton iptalButton = new JButton("İptal");
        iptalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose(); // Pencereyi kapat
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
