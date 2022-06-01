/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package responsi_123200144;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lenovo
 */
public class View extends JFrame{
    JLabel labelID = new JLabel("ID");
    JLabel labelBarang = new JLabel("Barang");
    JLabel labelKasir = new JLabel("Kasir");
    JLabel labelQuantity = new JLabel("Quantity");
    JLabel labelHarga = new JLabel("Harga");
    JLabel labelDiskon = new JLabel("Diskon (%)");
    JLabel labelTotal = new JLabel("Total");
    
    public JTextField textID = new JTextField();
    public JTextField textBarang = new JTextField();
    public JTextField textKasir = new JTextField();
    public JTextField textQuantity = new JTextField();
    public JTextField textHarga = new JTextField();
    public JTextField textDiskon = new JTextField();
    public JTextField textTotal = new JTextField();
    
    public JButton btnTambah = new JButton("Tambah");
    public JButton btnUpdate = new JButton("Update");
    public JButton btnDelete = new JButton("Delete");
    public JButton btnReset = new JButton("Reset");
    
    public JTable tabelData;
    DefaultTableModel TableModel;
    JScrollPane scrollPane;
    public Object namaKolom[] = {"ID", "Barang", "Kasir", "Quantity", "Harga", "Diskon (%)", "Total"};
    int baris = -1;

    public View() {
        TableModel = new DefaultTableModel(namaKolom, 0);
        tabelData = new JTable(TableModel);
        scrollPane = new JScrollPane(tabelData);
        
        setTitle("Data Catatan Transaksi");
        setVisible(true);
        setSize(850, 650);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(null);
        setLocationRelativeTo(null);
        
        add(labelID); labelID.setBounds(60,50,50,20);
        add(labelBarang); labelBarang.setBounds(60,80,50,20);
        add(labelKasir); labelKasir.setBounds(60,110,50,20);
        add(labelQuantity); labelQuantity.setBounds(60,140,50,20);
        add(labelHarga); labelHarga.setBounds(60,170,50,20);
        add(labelDiskon); labelDiskon.setBounds(60,200,75,20);
        add(textID); textID.setBounds(180,50,140,20);
        add(textBarang); textBarang.setBounds(180,80,140,20);
        add(textKasir); textKasir.setBounds(180,110,140,20);
        add(textQuantity); textQuantity.setBounds(180,140,140,20);
        add(textHarga); textHarga.setBounds(180,170,140,20);
        add(textDiskon); textDiskon.setBounds(180,200,140,20);
        add(btnTambah); btnTambah.setBounds(350, 50, 90, 20);
        add(btnUpdate); btnUpdate.setBounds(350, 80, 90, 20);
        add(btnDelete); btnDelete.setBounds(350, 110, 90, 20);
        add(btnReset); btnReset.setBounds(350, 140, 90, 20);
        add(scrollPane); 
        scrollPane.setBounds(40,250,425,400);
        scrollPane.setSize(770, 325);
    }
    
    public int getBaris(){
        return baris;
    }

    public String getID(){
        return textID.getText();
    }
    
    public String getBarang(){
        return textBarang.getText();
    }
    
    public String getKasir(){
        return textKasir.getText();
    }
    
    public String getQuantity(){
        return textQuantity.getText();
    }

    public String getHarga(){
        return textHarga.getText();
    }

    public String getDiskon(){
        return textDiskon.getText();
    }
}